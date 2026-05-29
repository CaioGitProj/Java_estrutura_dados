package com.caio.estruturadados.base;

public class EstruturaEstatica<T>
{
    protected T[] elementos;
    protected int tamanho;

    public EstruturaEstatica(int capacidade) {
        this.elementos = (T[]) new Object[capacidade];
        this.tamanho = 0;
    }

    public EstruturaEstatica()
    {
        //Procura o próximo construtor com um inteiro como parâmetro e aplica a lógica
        this(10);
    }


    public boolean estaVazia()
    {
        return tamanho == 0;
    }

    protected boolean adicionaFinal(T elemento)
    {
        aumentaCapacidade();
        if(tamanho < elementos.length)
        {
            elementos[tamanho] = elemento;
            tamanho++;
            return true;
        }
        return false;
    }

    protected boolean adiciona(int posicao, T elemento)
    {
        if(posicao < 0 || posicao > tamanho)
        {
            throw new IllegalArgumentException("Posicao inválida");
        }
        aumentaCapacidade();

        for(int i = tamanho -1; i >= posicao; i--)
        {
            elementos[i + 1] = elementos[i];
        }
        elementos[posicao] = elemento;
        tamanho++;

        return true;
    }

    protected void remove(int posicao)
    {
        if(!(posicao >= 0 && posicao < tamanho))
        {
            throw new IllegalArgumentException("Posicao inválida");
        }
        for(int i =posicao; i< tamanho - 1; i++)
        {
            elementos[i] = elementos[i + 1];
        }
        tamanho --;
    }

    protected void aumentaCapacidade()
    {
        if(tamanho == elementos.length)
        {
            T[] elementosNovos = (T[]) new Object[elementos.length * 2];
            for(int i = 0; i < elementos.length; i++)
            {
                elementosNovos[i] = elementos[i];
            }
            elementos = elementosNovos;
        }
    }

    public int getTamanho()
    {
        return tamanho;
    }

    @Override
    public String toString() {

        StringBuilder s = new StringBuilder();

        s.append("[");

        for (int i=0; i<tamanho-1; i++){
            s.append(elementos[i]);
            s.append(", ");
        }

        if (this.tamanho>0){
            s.append(elementos[tamanho-1]);
        }

        s.append("]");

        return s.toString();
    }
}
