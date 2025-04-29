package com.example.todolist.Correção.Controllers;


import com.example.todolist.Correção.DTO.TarefasDTO;
import com.example.todolist.Correção.Services.TarefasService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Tarefa")
public class TarefaController {

    @Autowired
    TarefasService Tservice;

    @PostMapping("/Novo")
    public ResponseEntity<TarefasDTO> inserirTarefa(@RequestBody @Valid TarefasDTO dto){
    dto = Tservice.novaTarefa(dto);
    return ResponseEntity.ok(dto);
    }

    @GetMapping("/Tudo")
    public List<TarefasDTO> listarTarefas(){
       return Tservice.listarTarefas();
    }
}
