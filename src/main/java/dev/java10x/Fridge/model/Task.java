package dev.java10x.Fridge.model;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(name = "tasks_table")
public class Task
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Boolean concluida;

    private String conteudo;

    private LocalDateTime dataCriacao;

    private Long usuarioInternoId;

    public Task(){}

    public Task(Long id, Boolean check_task, String conteudo) {
        this.id = id;
        this.concluida = check_task;
        this.conteudo = conteudo;
        this.dataCriacao = LocalDateTime.now();
        this.usuarioInternoId = 1L;
    }

    public Task(String conteudo, Long id) {
        this.conteudo = conteudo;
        this.concluida = false;
        this.id = id;
        this.dataCriacao = LocalDateTime.now();
        this.usuarioInternoId = 1L;
    }

    public Long getId() {
        return id;
    }

    public Boolean getConcluida() {
        return concluida;
    }

    public String getConteudo() {
        return conteudo;
    }

    public LocalDateTime getDataCriacao() {
        return dataCriacao;
    }

    public Long getUsuarioInternoId() {
        return usuarioInternoId;
    }
}