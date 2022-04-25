package conceitos;

public class Secretario extends Funcionario {
    private String departamento;

    public Secretario(){}

    public Secretario(String departamento){
        this.departamento = departamento;
    }

    public String getDepartamento() {
        return this.departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public void mostrarDados(){
        System.out.println("O nome do Secretario é: " + getNome() +", Matricula: " + getMatricula()
        + ", Departamento: " + getDepartamento());
        System.out.println("-------------------------------");
    }

}
