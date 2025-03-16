package com.example.ToDoListApi.model.enums;

import java.util.Random;

public enum StatusTarefa {
    Aguardando(1),
    Feito(2);


    private final int codigo;

    StatusTarefa(int codigo) {
        this.codigo = codigo;
    }

    public int getCodigo() {
        return codigo;
    }

    public static StatusTarefa getAleatorio() {
        StatusTarefa[] valores = StatusTarefa.values();
        return valores[new Random().nextInt(valores.length)];
    }

}
