package com.example.todolist.Correção.Repositories;

import com.example.todolist.Correção.Entities.Usuarios;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepositorio extends JpaRepository<Usuarios, Long> {
}
