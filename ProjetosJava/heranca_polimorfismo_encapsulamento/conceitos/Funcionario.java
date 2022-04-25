package conceitos;

public class Funcionario {
    private String nome, matricula;

    public Funcionario() {}

    public Funcionario(String nome, String matricula){
        this.nome = nome;
        this.matricula = matricula;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return this.matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void mostrarDados(){
        System.out.println("O nome do funcionario é: " + getNome());
        System.out.println("A matricula do funcionario é: " + getMatricula());
        System.out.println("----------------");
    }

}