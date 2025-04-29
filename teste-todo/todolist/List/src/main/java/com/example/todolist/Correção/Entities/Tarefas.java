package com.example.todolist.Correção.Entities;


import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table (name = "tb_tarefas")
public class Tarefas {


    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String descricao;
    private String setor;
    private Prioridade prioridade;
    private LocalDate data_cadastro;
    private Status status;



    @ManyToOne
//    @JoinColumn(name = "id_usuario")
    private Usuarios usuario;

    public Tarefas() {
    }

    public Tarefas(Long id, Long id_usuario, String descricao, String setor, Prioridade prioridade, LocalDate data_cadastro, Status status) {
        this.id = id;
        this.descricao = descricao;
        this.setor = setor;
        this.prioridade = prioridade;
        this.data_cadastro = data_cadastro;
        this.status = status;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }


    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public Prioridade getPrioridade() {
        return prioridade;
    }

    public void setPrioridade(Prioridade prioridade) {
        this.prioridade = prioridade;
    }

    public LocalDate getData_cadastro() {
        return data_cadastro;
    }

    public void setData_cadastro(LocalDate data_cadastro) {
        this.data_cadastro = data_cadastro;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Usuarios getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuarios usuario) {
        this.usuario = usuario;
    }

}
