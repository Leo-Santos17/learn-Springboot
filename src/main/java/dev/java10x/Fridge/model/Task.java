package dev.java10x.Fridge.model;

import jakarta.persistence.*;

@Entity
@Table(name = "tasks_table")
public class Task
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Boolean check_task;

    private String conteudo;

    public Task(){}

    public Task(Long id, Boolean check_task, String conteudo) {
        this.id = id;
        this.check_task = check_task;
        this.conteudo = conteudo;
    }

    public Task(String conteudo, Long id) {
        this.conteudo = conteudo;
        this.check_task = false;
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public boolean isCheck_task() {
        return check_task;
    }

    public void setCheck_task(boolean check) {
        this.check_task = check;
    }

    public String getConteudo() {
        return conteudo;
    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }
}
