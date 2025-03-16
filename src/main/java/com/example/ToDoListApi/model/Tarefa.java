package com.example.ToDoListApi.model;

import com.example.ToDoListApi.model.enums.StatusTarefa;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Id;
import jdk.jshell.Snippet;

import static com.example.ToDoListApi.model.enums.StatusTarefa.getAleatorio;

@Entity
public class Tarefa {

    @Id
    private String id;
    private String nome;
    private String descricao;
    @Enumerated(EnumType.STRING)
    private StatusTarefa status = getAleatorio();

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Enum<StatusTarefa> getStatus() {
        return status;
    }



    @Override
    public String toString() {
        return "Tarefa{" +
                "id='" + id + '\'' +
                ", nome='" + nome + '\'' +
                ", descricao='" + descricao + '\'' +
                ", status=" + status +
                '}';
    }
}
