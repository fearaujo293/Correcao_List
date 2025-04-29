package com.example.todolist.Correção.Services;

import com.example.todolist.Correção.DTO.UsuarioDTO;
import com.example.todolist.Correção.Entities.Usuarios;
import com.example.todolist.Correção.Repositories.UsuarioRepositorio;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class UsuarioService {

    @Autowired
    UsuarioRepositorio usuarioRepositorio;

    public UsuarioDTO inserirUsuario(@RequestBody @Valid UsuarioDTO dto){
        Usuarios usuarioNovo = new Usuarios();
        usuarioNovo.setNome(dto.getNome());
        usuarioNovo.setEmail(dto.getEmail());
        usuarioNovo = usuarioRepositorio.save(usuarioNovo);

        return  new UsuarioDTO(usuarioNovo);
    }


}
