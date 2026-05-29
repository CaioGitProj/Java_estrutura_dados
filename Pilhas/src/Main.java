import com.caio.estruturadados.pilha.Pilha;

import java.util.Stack;

public class Main
{
    public static void main(String[] args)
    {
        Pilha<Integer> pilha = new Pilha<Integer>(); //Inicia por padrão com 10

        for(int i = 1; i < 11; i++)
        {
            pilha.empilha(i);
        }

        System.out.println(pilha);

        pilha.desempilha();

        System.out.println(pilha.getTamanho());
        System.out.println(pilha.estaVazia());
        System.out.println(pilha.topo());

        System.out.println();
        System.out.println();
        System.out.println();


        //Usando a pilha nativa
        Stack<Integer> stack = new Stack<>();

        System.out.println(stack.isEmpty());

        for(int i = 0; i < 16; i++)
        {
            stack.push(i);
        }

        System.out.println(stack.size());
        System.out.println(stack);

        System.out.println(stack.peek());
        System.out.println(stack.pop());

        System.out.println(stack);
    }
}
