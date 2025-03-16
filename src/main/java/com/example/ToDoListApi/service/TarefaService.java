package com.example.ToDoListApi.service;

import com.example.ToDoListApi.model.Tarefa;
import com.example.ToDoListApi.repository.TarefaRepository;

import java.util.List;

public class TarefaService {

    private final TarefaRepository tarefaRepository;

    public TarefaService(TarefaRepository tarefaRepository) {
        this.tarefaRepository = tarefaRepository;
    }

    public List<Tarefa> listarTodas() {
        return tarefaRepository.findAll();
    }
}
