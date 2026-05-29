package com.caio.estruturadados.pilha;

import com.caio.estruturadados.base.EstruturaEstatica;

import java.util.Arrays;

public class Pilha<T> extends EstruturaEstatica<T>
{
    public Pilha(){
        super();
    }
    public Pilha(int capacidade){
        super(capacidade);
    }

    public void empilha(T elemento)
    {
        super.adicionaFinal(elemento);
    }

    public T topo()
    {
        if(estaVazia())
        {
            return null;
        }
        return elementos[tamanho - 1];
    }
}
