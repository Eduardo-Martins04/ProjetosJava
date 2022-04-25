public class CalculoBasico {
    private long soma, subtracao, multiplicacao, divisao;

    public CalculoBasico(){
    }

    public CalculoBasico(long soma, long subtracao, long multiplicacao, long divisao){
        this.soma = soma;
        this.subtracao = subtracao;
        this.multiplicacao = multiplicacao;
        this.divisao = divisao;
    }
    
    /*public CalculoBasico(){
        this
    }*/
    //Método de CLASSE do tipo GET
    /*public long getSoma(){
        return soma;
    }*/

    public long soma(long x, long y){
        this.soma = x + y;
        return soma;
    }

    /*public long getSubtracao() {
        return subtracao;
    }*/

    public long subtracao(long x, long y){
        this.subtracao = x - y;
        return subtracao;
    }
    
   /* public long getMultiplicacao() {
        return multiplicacao;
    }*/

    public long multiplicacao(long x, long y){
        this.multiplicacao = x * y;
        return multiplicacao;
    }

   /* public long getDivisao() {
        return divisao;
    }*/

    public long divisao(long x, long y){
        this.divisao = x / y;
        return divisao;
    }

    public String mostrarDados() {
        String msg = "Soma: "
        + soma
        +", Subtração: "
        + subtracao
        +", Multiplicação: "
        + multiplicacao
        +", Divisão: "
        + divisao
        +"\n------------";


        return msg;
    }


    
}

/*Criar uma classe chamada CalculoBasico que implemente as 4 operações básicas:
soma, subtração, multiplicação, divisão. Definas os atributos e métodos que achar
necessário p/ que a classe tenha as funcionalidades e comportamentos desejáveis
para atender ao seu propósito.*/

/*
import java.util.Scanner;

public class CalculoBasico {
    public CalculoBasico(){}
    public static void main(String[] args) throws Exception {
        int valor1, valor2;

        System.out.println("Programa Matematico");

        Scanner entradaTeclado = new Scanner (System.in);

        System.out.print("Digite o 1° valor inteiro: ");
        valor1 = entradaTeclado.nextInt();

        System.out.print("Digite o 2° valor inteiro: ");
        valor2 = entradaTeclado.nextInt();

        entradaTeclado.close();

        CalculoBasico calculoBasico = new CalculoBasico();

        calculoBasico.somaValores(valor1, valor2);
        calculoBasico.subtracao(valor1, valor2);
        calculoBasico.multiplicacao(valor1, valor2);
        calculoBasico.divisao(valor1, valor2);

    }

    public void somaValores(int valor1, int valor2){
        int soma = valor1 + valor2;
        System.out.println("O resultado da soma é: " + soma);

    }

    public void subtracao(int valor1, int valor2){
        int subtração = valor1 - valor2;
        System.out.println("O resultado da subtração é: " + subtração);
    }

    public void multiplicacao(int valor1, int valor2){
        int multiplicação = valor1 * valor2;
        System.out.println("O resultado da multiplicação é: " + multiplicação);
    }

    public void divisao(int valor1, int valor2){
        int divisao = valor1 / valor2;
        System.out.println("O resultado da divisão é: " + divisao);
    }
}
*/

