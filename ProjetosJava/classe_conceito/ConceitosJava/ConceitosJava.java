import java.util.Scanner;

public class ConceitosJava {
    private static String mensagem = "Um valor textual representa os símbolos contidos na tabela ASCII, um padrão UNICODE";
    /*private String msg = 
    "Um valor textual representa os"
     + "símbolos contidos na tabela ASCII, um padrão UNICODE"; == WARNING*/ 
    //private short tipoNumerico = 500000; == ERRO!!!
    

    public ConceitosJava(){}

    public static void main(String[] args) throws Exception{
        System.out.println("Primeiro programa Java da turma de Formação de Desenvolvedores em Tecnologia da Informação (manhã)");
    
        System.out.println(mensagem);
        //System.out.println(somaValores([15, 25]))

        ConceitosJava conceitosJava = new ConceitosJava();
        System.out.println("O valor da soma é: " + conceitosJava.somaValores(15, 25));

        conceitosJava.compararValores();
    }

    public int somaValores(int x, int y){
        int resultadoSoma = x + y;
        return resultadoSoma;
    }

    public void compararValores(){ // Void nao tem retorno
        int valor1, valor2;

        //Lê entradas do telcado
        Scanner entradaTeclado = new Scanner( System.in);

        System.out.print("Digite o 1° valor inteiro: ");
        valor1 = entradaTeclado.nextInt();

        System.out.print("Digite o 2° valor inteiro: ");
        valor2 = entradaTeclado.nextInt();

        if(valor1 == valor2)
            System.out.printf( "%d IGUAL(==) %d\n", valor1, valor2);
        else 
            System.out.printf("%d DIFERENTE(!=) %d\n", valor1, valor2);

        //encera a leitura de dados do teclado
        entradaTeclado.close();
    }
}//Fim do escopo da classe ConceitoJava

/*O visual Studio Code é um editor de código-fonte desenvolvido pela Microsoft para Windows, Linux
e MacOS. Ele inclui suporte para depuração, controle de versionamento Git incorporado, realce de
sintaxe, complementação inteligente de código, snippets e refatoração de código*/