package conceitos;

import java.util.Scanner;

public class StartProgram {
    public static void main(String[] args) {

        Diretor diretor1         = new Diretor();// lendo pelo teclado
        //Funcionario funcionario1 = new Funcionario(); 
        Engenheiro engenheiro1   = new Engenheiro();
        Gerente gerente1         = new Gerente();
        Secretario secretario1   = new Secretario();
        Scanner entradaTeclado   = new Scanner( System.in);

        // Leitura e atribuição de dados
        
        // DIRETOR
        System.out.print("Digite o nome do Diretor: ");
        diretor1.setNome(entradaTeclado.nextLine());

        System.out.print("Digite a matricula do Diretor: ");
        diretor1.setMatricula(entradaTeclado.nextLine());

        System.out.print("Area de negócio: ");
        diretor1.setAreaDeNegocio(entradaTeclado.nextLine());

        System.out.println("");

        // ENGENHERIO
        System.out.print("Digite o nome do Engenheiro: ");
        engenheiro1.setNome(entradaTeclado.nextLine());

        System.out.print("Digite a matricula do Engenheiro: ");
        engenheiro1.setMatricula(entradaTeclado.nextLine());

        System.out.print("CREA do Engenheiro: ");
        engenheiro1.setCrea(entradaTeclado.nextLine());

        System.out.println("");

        // GERENTE
        System.out.print("Digite o nome do Gerente: ");
        gerente1.setNome(entradaTeclado.nextLine());

        System.out.print("Digite a matricula do Gerente: ");
        gerente1.setMatricula(entradaTeclado.nextLine());

        System.out.print("Diretoria do Gerente: ");
        gerente1.setDiretoria(entradaTeclado.nextLine());;

        System.out.println("");

        //SECRETARIO
        System.out.print("Digite o nome do Secretario: ");
        secretario1.setNome(entradaTeclado.nextLine());

        System.out.print("Digite a matricula do Secretario: ");
        secretario1.setMatricula(entradaTeclado.nextLine());

        System.out.print("Informe o departamento do Secretario: ");
        secretario1.setDepartamento(entradaTeclado.next());

        // Mostrando os dados do funcionario1

        entradaTeclado.close();

        diretor1.mostrarDados();
        engenheiro1.mostrarDados();
        gerente1.mostrarDados();
        secretario1.mostrarDados();


        
    }
}
