package dev.java10x.Fridge.service;

import dev.java10x.Fridge.model.Task;
import dev.java10x.Fridge.repository.TaskRepository;
import org.springframework.stereotype.Service;

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
        return "Hello world";
    }
}