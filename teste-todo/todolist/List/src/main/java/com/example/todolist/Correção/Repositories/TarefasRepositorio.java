package com.example.todolist.Correção.Repositories;

import com.example.todolist.Correção.Entities.Tarefas;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface TarefasRepositorio extends JpaRepository<Tarefas, Long> {
}
