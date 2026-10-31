package dev.java10x.Fridge.service;

import dev.java10x.Fridge.model.TaskResponseDTO;
import dev.java10x.Fridge.model.Task;
import dev.java10x.Fridge.repository.TaskRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TaskService {
    private final TaskRepository taskRepository;


    public TaskService(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    // Listar tudo
    public List<Task> getAll()
    {
        return taskRepository.findAll();
    }

    public List<TaskResponseDTO> getDTO()
    {
        List<TaskResponseDTO> dto = new ArrayList<>();
        for(Task task: taskRepository.findAll())
        {
            dto.add(converter(task));
        }
        return dto;
    }

    // Criar
    public Task save(Task task)
    {
        return taskRepository.save(task);
    }

    // Deletar
    public void delete(Long id)
    {
        taskRepository.deleteById(id);
    }

    // Teste
    public String hello()
    {
        return "Hello World";
    }

    // DTO
    public TaskResponseDTO converter(Task task)
    {
        return new TaskResponseDTO(task);
    }
}