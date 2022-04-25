public class MainProgram {
        // Aqui serão declarados os atributos da classe
        public MainProgram(){}

        public static void main(String[] args) {

                //CRIANDO NOVOS OBJETOS CONSTRUTORES

                Aluno aluno1                                       = new Aluno();
                Aluno aluno2                                       = new Aluno();
                Aluno aluno3                                       = new Aluno("1360", "203904", "Vini");
                CustomMessage customMessage1                       = new CustomMessage();
                CustomMessage customMessage2                       = new CustomMessage();
                CalculoBasico calculoBasico1                       = new CalculoBasico();
                CalculoBasico calculoBasico2                       = new CalculoBasico();
                CalculoBasico calculoBasico3                       = new CalculoBasico(50+50, 50-50, 50*50, 50/50);
                Disciplina disciplina1                             = new Disciplina();
                Disciplina disciplina2                             = new Disciplina();
                Disciplina disciplina3                             = new Disciplina(3, "Lógica", 200);
                Funcionario funcionario1                           = new Funcionario();
                Funcionario funcionario2                           = new Funcionario();
                Funcionario funcionario3                           = new Funcionario("Fernando", "Xanxere", "R$5000,30", "15/07/2010");
                InstituicaoDeEnsino instituicaoDeEnsino1           = new InstituicaoDeEnsino();
                InstituicaoDeEnsino instituicaoDeEnsino2           = new InstituicaoDeEnsino();
                InstituicaoDeEnsino instituicaoDeEnsino3           = new InstituicaoDeEnsino("Imperial", "222.222.222/222-22", "EUA", "New York", "(49) 92020-4987");
                LaboratórioDeInformatica laboratórioDeInformatica1 = new LaboratórioDeInformatica();
                LaboratórioDeInformatica laboratórioDeInformatica2 = new LaboratórioDeInformatica();
                LaboratórioDeInformatica laboratórioDeInformatica3 = new LaboratórioDeInformatica("RD", "R", 80, "Linux");

                

                // SETANDO OS DADOS // Define o estado do objeto aluno

                aluno1.setId("1358");
                aluno1.setMatricula("203902");
                aluno1.setNomeAluno("Eduardo");
                //aluno1.mostrarDados();
                
                aluno2.setId("1359");
                aluno2.setMatricula("203903");
                aluno2.setNomeAluno("Pedro");

                //MOSTRANDO AS STRINGS NA TELA

                customMessage1.printCustomMessage(aluno1.mostrarDados());
                customMessage2.printCustomMessage(aluno2.mostrarDados());
                customMessage1.printCustomMessage(aluno3.mostrarDados());
                
                calculoBasico1.soma(5, 3);
                calculoBasico1.subtracao(5, 3);
                calculoBasico1.multiplicacao(5, 3);
                calculoBasico1.divisao(5, 3);
                
                calculoBasico2.soma(10, 10);
                calculoBasico2.subtracao(10, 10);
                calculoBasico2.multiplicacao(10, 10);
                calculoBasico2.divisao(10, 10);

                customMessage1.printCustomMessage(calculoBasico1.mostrarDados());
                customMessage2.printCustomMessage(calculoBasico2.mostrarDados());
                customMessage1.printCustomMessage(calculoBasico3.mostrarDados());
                
                
                disciplina1.setCodigo(1);
                disciplina1.setNome("Algebra Booleana");
                disciplina1.setCargaHoraria(100);
                
                disciplina2.setCodigo(2);
                disciplina2.setNome("Programação com Java");
                disciplina2.setCargaHoraria(500);

                customMessage1.printCustomMessage(disciplina1.mostrarDados());
                customMessage2.printCustomMessage(disciplina2.mostrarDados());
                customMessage1.printCustomMessage(disciplina3.mostrarDados());
                
                funcionario1.setNome("Eduardo");
                funcionario1.setEndereço("Bairro Efapi");
                funcionario1.setSalario("R$2.900,99");
                funcionario1.setDataAdmissao("16/08/2020");
                

                funcionario2.setNome("José");
                funcionario2.setEndereço("Centro");
                funcionario2.setSalario("R$3000,00");
                funcionario2.setDataAdmissao("20/10/2019");

                customMessage1.printCustomMessage(funcionario1.mostrarDados());
                customMessage2.printCustomMessage(funcionario2.mostrarDados());
                customMessage1.printCustomMessage(funcionario3.mostrarDados());
               
                instituicaoDeEnsino1.setRazaoSocial("EMF");
                instituicaoDeEnsino1.setCnpj("000.000.000-00");
                instituicaoDeEnsino1.setEndereco("Efapi");
                instituicaoDeEnsino1.setCidade("Chapecó");
                instituicaoDeEnsino1.setTelefone("(49) 98870-7070");
                

                instituicaoDeEnsino2.setRazaoSocial("JDM");
                instituicaoDeEnsino2.setCnpj("111.111.111-00");
                instituicaoDeEnsino2.setEndereco("Centro");
                instituicaoDeEnsino2.setCidade("Chapecó");
                instituicaoDeEnsino2.setTelefone("(49) 97070-5050");

                customMessage1.printCustomMessage(instituicaoDeEnsino1.mostrarDados());
                customMessage2.printCustomMessage(instituicaoDeEnsino2.mostrarDados());
                customMessage1.printCustomMessage(instituicaoDeEnsino3.mostrarDados());
                
                laboratórioDeInformatica1.setNome("Laboratorio");
                laboratórioDeInformatica1.setBloco("G");
                laboratórioDeInformatica1.setQuantidadeComputadores(40);
                laboratórioDeInformatica1.setSistemaOperacional("Windows");
                

                laboratórioDeInformatica2.setNome("Sala");
                laboratórioDeInformatica2.setBloco("F");
                laboratórioDeInformatica2.setQuantidadeComputadores(20);
                laboratórioDeInformatica2.setSistemaOperacional("IOS");

                customMessage1.printCustomMessage(laboratórioDeInformatica1.mostrarDados());
                customMessage2.printCustomMessage(laboratórioDeInformatica2.mostrarDados());
                customMessage1.printCustomMessage(laboratórioDeInformatica3.mostrarDados());
                
        }
}
