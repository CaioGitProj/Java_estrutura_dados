package com.caio.estruturadados.vetor;

import com.caio.estruturadados.base.EstruturaEstatica;

public class Lista<T> extends EstruturaEstatica<T>
{

    public Lista() {
        super();
    }

    public Lista(int capacidade) {
        super(capacidade);
    }

    public boolean adicionaFinalLista(T elemento){
        return super.adicionaFinal(elemento);
    }

    public boolean adicionaLista(int posicao, T elemento)
    {
        return super.adiciona(posicao, elemento);
    }
}
