public class Aluno {
    // Aqui serão declarados os atributos da classe
    private String id, matricula, nomeAluno;

    //Contrutor vazio
    public Aluno(){}

    public Aluno(String id, String matricula, String nomeAluno ) {
        this.id = id;
        this.matricula = matricula;
        this.nomeAluno = nomeAluno;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getNomeAluno() {
        return nomeAluno;
    }

    public void setNomeAluno(String nomeAluno) {
        this.nomeAluno = nomeAluno;
    }

    public String mostrarDados() {
        String msg = "Nome do Aluno: "
        + getNomeAluno()
        + ", Matricula: "
        + getMatricula()
        + ", ID: "
        + getId()
        +"\n------------";

        return msg;


    }

}
/*
 * Toda a classe Java precisa de um Metodo Construtor
 */

/*
 * Criar uma classe chamada Aluno que implemente: ID, matricula, nome, do aluno.
 * Definas os atributos e métodos que achar necessário p/ que a classe tenha as
 * funcionalidades e comportamentos desejáveis para atender ao seu propósito.
 */