package dev.java10x.Fridge.repository;

import dev.java10x.Fridge.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task, Long> {
}
