package estrutura_de_dados;

import javax.swing.JOptionPane;

public class ConceitoFila {
    private int inicio, fim;
    private int tamanhoDaFila;
    private int numeroDeElementos;
    private int[] filaDeInteiros;
    private final static int FILA_SEM_ELEMENTOS = -1;

    public ConceitoFila(int tamanhoDaFila){
        if(tamanhoDaFila > 0){
            this.tamanhoDaFila = tamanhoDaFila;
        } else {
            this.tamanhoDaFila = 5;
        }

        filaDeInteiros = new int[this.tamanhoDaFila];
        inicio = fim = FILA_SEM_ELEMENTOS;
        numeroDeElementos = 0;
    }

    public boolean filaVazia(){

        if(numeroDeElementos == 0){
            return true;
        } else {
            return false;
        }
        
    }

    public boolean filaCheia(){
        if(numeroDeElementos == tamanhoDaFila - 1){
            return true;
        } else {
            return false;
        }
    }

    public int tamanhoDaFila(){
        if(filaVazia()){// metodo da classe por isso nao usar o .
            return 0;
        } else {
            return filaDeInteiros.length;
        }
    }

    public void adicionarElementoFila(int valorNumerico){
        if(!filaCheia()){
            if(inicio == FILA_SEM_ELEMENTOS){
                inicio = 0;
            }
            fim++;
            filaDeInteiros[fim] = valorNumerico;
            numeroDeElementos++;
        }
    }

    public void removerElementoFila(){
        if(!filaVazia()){
            inicio++;
            numeroDeElementos--;
        }
    }

    public void imprimirElementosDaFila(){
        if(filaDeInteiros == null){
            System.out.println("Erro. A fila não foi criada!");
        } else if(filaVazia()){
            System.out.println("A fila está vazia!");
        } else {
            String elementos = "";
            for(int i = inicio; i <= fim; i++){
                //System.out.printf("%2d° elemento da fila: %2d \n", i+1, filaDeInteiros[i]);
                elementos += filaDeInteiros[i]+ ", ";
            }
            String msg = "Elemetos da fila: " + elementos;       
            
            if(elementos != ""){
                JOptionPane.showMessageDialog(null, msg);
            }
        }
    }
}
