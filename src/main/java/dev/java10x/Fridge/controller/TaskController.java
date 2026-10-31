package dev.java10x.Fridge.controller;

import dev.java10x.Fridge.model.TaskResponseDTO;
import dev.java10x.Fridge.model.Task;
import dev.java10x.Fridge.service.TaskService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/task")
public class TaskController
{
    private final TaskService taskService;

    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }

    @GetMapping
    public List<Task> getAll(){ return taskService.getAll(); }

    @GetMapping({"/teste"})
    public List<TaskResponseDTO> teste()
    {
        return taskService.getDTO();
    }

    @PostMapping
    public Task create(@RequestBody Task task)
    {
        return taskService.save(task);
    }

    @DeleteMapping
    public void delete(@PathVariable Long id) { taskService.delete(id); }
}