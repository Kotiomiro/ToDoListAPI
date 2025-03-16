package com.example.ToDoListApi.controller;


import com.example.ToDoListApi.model.Tarefa;
import com.example.ToDoListApi.repository.TarefaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("tarefas")
public class TarefaController {


    private final TarefaRepository tarefaRepository;

    
    public TarefaController(TarefaRepository tarefaRepository) {
        this.tarefaRepository = tarefaRepository;
    }

    @PostMapping
    public void criarTarefa(@RequestBody Tarefa tarefa) {
        var id = UUID.randomUUID().toString();
        tarefa.setId(id);
        System.out.println("Tarefa: " + tarefa + " recebida com sucesso!");
        tarefaRepository.save(tarefa);
    }

    @GetMapping("/{id}")
    public Tarefa obterPorId(@PathVariable("id") String id) {
        return tarefaRepository.findById(id).orElse(null);
    }

    @DeleteMapping("/{id}")
    public void deletarPorId(@PathVariable("id") String id) {
        tarefaRepository.deleteById(id);
        System.out.println("Tarefa excluída com sucesso!");
    }

    @PutMapping("/{id}")
    public void atualizarTarefa(@PathVariable("id") String id, Tarefa tarefa) {
        tarefa.setId(id);
        criarTarefa(tarefa);
        tarefaRepository.save(tarefa);
        System.out.println("Tarefa: " + tarefa + " atualizada com sucesso!");
    }

    @GetMapping("tarefas")
    public List<Tarefa> tarefasLista() {
        return tarefaRepository.findAll();
    }
}
