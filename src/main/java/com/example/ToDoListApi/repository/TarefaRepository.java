package com.example.ToDoListApi.repository;

import com.example.ToDoListApi.model.Tarefa;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TarefaRepository extends JpaRepository<Tarefa, String> {

    List<Tarefa> findByNome(String nome);
}
