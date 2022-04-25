package estrutura_de_dados;

public class ConceitoPilha {
    private int tamanhoDaPilha;
    private Object pilha[];

    public ConceitoPilha(int tamanhoDaPilha){
        if(tamanhoDaPilha > 0){
            this.tamanhoDaPilha = tamanhoDaPilha;
        } else {
            // Se um valor inválido for passado no construtor, uma pilha de tamanho 5 sera criada
            this.tamanhoDaPilha = 5;
        }

        pilha = new Object[this.tamanhoDaPilha];
    }

    public boolean pilhaVazia(){

        if(this.pilha == null){
            return true;
        } else {
            //return (pilha.length == 0 ? true : false);
            if( pilha.length == 0){
                return true;
            } else {
                return false;
            }
        }
        
    }

    public int tamanhoDaPilha(){
        if(pilhaVazia()){// metodo da classe por isso nao usar o .
            return 0;
        } else {
            return pilha.length;
        }
    }

    public Object retornaTopo(){
        Object topo = null;

        if(pilhaVazia()){
            return null;
        } else {
            int controleDoLacoWhile = tamanhoDaPilha() - 1;
            while(controleDoLacoWhile >= 0){
                if(pilha[controleDoLacoWhile] != null){
                    topo = pilha[controleDoLacoWhile];
                    break;
                }
                controleDoLacoWhile--;
            }

            return topo;
        }
    }

    public void empilhar(Object elemento){//push
        if(pilha != null){
            int indice = 0;
            /* O while percorre, de maneira controlada, todos os índices da pilha e não acessa 
            uma posição inválida.*/
            while(indice < pilha.length){
                if(pilha[indice] == null){
                    //Só insere no topo da pilha, até chegar a sua capacidade maxima*/
                    if(elemento != null){
                        pilha[indice] = elemento;
                        break;
                    }
                }
                indice++;
            }
        }

    }

    public void desempilhar(){//pop
        if(!pilhaVazia()){
            int controleDoLacoWhile = tamanhoDaPilha() - 1;

            while(controleDoLacoWhile >= 0){
                if(pilha[controleDoLacoWhile] != null){
                    /* Vasculha a pilha do topo até o primeiro elemento  Nesse trajeto, o primeiro elemento não NULO
                    será o topo da pilha e sofrerá um "pop", ou seja, será desempilhado, excluído da pilha.
                    */ 
                    pilha[controleDoLacoWhile] = null;
                    break;//sai do laço quando encontrar o topo da pilha
                }
                controleDoLacoWhile--;
            }
        }
    }

    public void imprimirElementosDaPilha(){
        if(pilha == null){
            System.out.println("Erro. A pilha não foi criada");
        } else if (pilhaVazia()){
            System.out.println("A pilha está vazia");
        } else {
            /* MINHA RESOLUÇÃO
            int controleDoLacoWhile = tamanhoDaPilha() - 1;

            while(controleDoLacoWhile >= 0){
                if(pilha[controleDoLacoWhile] != null){
                    System.out.println(pilha[controleDoLacoWhile]);
                    break;
                }
            }
            controleDoLacoWhile--;*/

            for(int i = pilha.length - 1; i >= 0; i--){
                if(pilha[i] instanceof String){// é do tipo string? imprime
                    System.out.printf("Elemento %2d: %s \n", i, pilha[i]);
                }
            }
        }
    }

    public void push(String string) {
    }
}
