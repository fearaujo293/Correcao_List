package com.example.todolist.Correção.Controllers;

import com.example.todolist.Correção.DTO.UsuarioDTO;
import com.example.todolist.Correção.Services.UsuarioService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Usuario")
public class UsuarioController {

    @Autowired
    UsuarioService uService;

    @PostMapping("/Novo")
    public ResponseEntity<UsuarioDTO> inserirUsuario(@RequestBody @Valid UsuarioDTO dto){
       dto = uService.inserirUsuario(dto);
       return  ResponseEntity.ok(dto);
    }





}
