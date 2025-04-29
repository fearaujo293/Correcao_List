package com.example.todolist.Correção.Services;

import com.example.todolist.Correção.DTO.TarefasDTO;
import com.example.todolist.Correção.Entities.Status;
import com.example.todolist.Correção.Entities.Tarefas;
import com.example.todolist.Correção.Entities.Usuarios;
import com.example.todolist.Correção.Repositories.TarefasRepositorio;
import com.example.todolist.Correção.Repositories.UsuarioRepositorio;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class TarefasService {

    @Autowired
    UsuarioRepositorio usuarioRepositorio;

    @Autowired
    TarefasRepositorio tarefasRepositorio;

    @Transactional
    public TarefasDTO novaTarefa( TarefasDTO dto){
        Tarefas tarefa = new Tarefas();
        tarefa.setDescricao(dto.getDescricao());
        tarefa.setData_cadastro(LocalDate.now());
        tarefa.setSetor(dto.getSetor());
        Usuarios usuario = usuarioRepositorio.getReferenceById(dto.getId_usuario());
        tarefa.setUsuario(usuario);
        tarefa.setStatus(Status.A_FAZER);
        tarefa.setPrioridade(dto.getPrioridade());
        tarefa = tarefasRepositorio.save(tarefa);

        return  new TarefasDTO(tarefa);
    }


    public List<TarefasDTO> listarTarefas(){
        List<Tarefas> tarefas = tarefasRepositorio.findAll();

        return tarefas.stream().map(x -> new TarefasDTO(x)).toList();
    }

}
