import java.util.Random;
import java.util.Stack;

import estrutura_de_dados.ConceitoFila;
import estrutura_de_dados.ConceitoPilha;

public class MainProgram {
    // PILHA
    private static ConceitoPilha pilhaDelivros; // declarou pilha de livros
    private static Stack<Integer> pilhaDeNumerosInteiros;
    private static Stack<String> pilhaDeLivrosStack;
    private static Random random;
    //FILA
    private static ConceitoFila fila;

    public MainProgram(){}

    public static void main(String[] args) {
        //PILHA
        pilhaDelivros               = new ConceitoPilha(7);//instanciou pilha delivro
        pilhaDeLivrosStack          = new Stack<>();
        random                      = new Random();
        pilhaDeNumerosInteiros      = new Stack<>();
        // FILA
        fila                        = new ConceitoFila(5);
        // Empilhar

        pilhaDelivros.empilhar("Turma da Monica");
        pilhaDelivros.empilhar("Batman");
        pilhaDelivros.empilhar("Avengers");
        pilhaDelivros.empilhar("Sitio do Pica Pau Amarelo");
        pilhaDelivros.empilhar("Bob esponja");
        pilhaDelivros.empilhar("Dragon ball Z");
        pilhaDelivros.empilhar("007");

        pilhaDelivros.imprimirElementosDaPilha();

        // Desempilhar

        System.out.println("x");
        System.out.println("Desempilhando...");
        pilhaDelivros.desempilhar();
        pilhaDelivros.desempilhar();
        pilhaDelivros.imprimirElementosDaPilha();

        //Impilhar outros livros
        System.out.println("x");
        pilhaDelivros.empilhar("Novo livro");

        pilhaDelivros.imprimirElementosDaPilha();

        if(pilhaDelivros.retornaTopo() instanceof String){
            System.out.println("");
            System.out.println("Elemento no topo da pilha: " +
            pilhaDelivros.retornaTopo());
            System.out.println("x");

        }
        System.out.println("--------------------------");
        
        // Usando a classe Stack(pilha) da API do java

        System.out.println("Trabalhando com a classe Stack (pilha) da API do JAVA");

        System.out.println("");
        System.out.println("Empilhando valores numéricos...");

        for(int i = 0; i < 10; i++){
            pilhaDeNumerosInteiros.push(random.nextInt(100)); // Empilha
        }
        System.out.println("Pilha de inteiros: " + pilhaDeNumerosInteiros);

        pilhaDeNumerosInteiros.pop(); // Desempilha
        System.out.println("Topo da pilha removido: " + pilhaDeNumerosInteiros);
        pilhaDeNumerosInteiros.pop();
        System.out.println("Topo da pilha removido: " + pilhaDeNumerosInteiros);

        System.out.println("");
        System.out.println("Elemento do topo da pilha: " + pilhaDeNumerosInteiros.peek());
        System.out.println("--------------------------");

        // Pilha de livros usando STACK(pilha)

        System.out.println("Nova pilha de livros: ");

        for(int i = 0; i < 5; i++){
            pilhaDeLivrosStack.push("livro "+ i); // Empilha
        }
        System.out.println("Pilha de livros: " + pilhaDeLivrosStack);

        pilhaDeLivrosStack.pop(); // Desempilha
        System.out.println("Livro do topo removido: " + pilhaDeLivrosStack);
        pilhaDeLivrosStack.pop(); 
        System.out.println("Livro do topo removido: " + pilhaDeLivrosStack);

        System.out.println("");
        System.out.println("Livro do topo: " + pilhaDeLivrosStack.peek());
        System.out.println("--------------------------");

        
        //  FILA
        System.out.println("CONCEITOS FILA");

        fila.adicionarElementoFila(1);
        fila.adicionarElementoFila(2);
        fila.adicionarElementoFila(3);
        fila.adicionarElementoFila(4);
        fila.adicionarElementoFila(5);
        

        fila.imprimirElementosDaFila();

        fila.removerElementoFila();

        fila.imprimirElementosDaFila();

        System.out.println("Tamanho da filha: " + fila.tamanhoDaFila());
    }    
}
