import com.caio.estruturadados.pilha.Pilha;

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
        System.out.println(pilha.getTamanho());
        System.out.println(pilha.estaVazia());
        System.out.println(pilha.topo());
    }
}
