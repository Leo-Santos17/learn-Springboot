package dev.java10x.Fridge.model;

public class TaskResponseDTO
{
    private Long id;
    private String conteudo;
    private Boolean concluida;

    public TaskResponseDTO(){}

    public TaskResponseDTO(Task task) {
        this.id = task.getId();
        this.conteudo = task.getConteudo();
        this.concluida = task.getConcluida();
    }

    public Long getId() {
        return id;
    }

    public String getConteudo() {
        return conteudo;
    }

    public Boolean getConcluida() {
        return concluida;
    }
}
