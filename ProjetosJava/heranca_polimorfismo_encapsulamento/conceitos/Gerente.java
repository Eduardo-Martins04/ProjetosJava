package conceitos;

public class Gerente extends Funcionario{
    private String diretoria;

    public Gerente(){}

    public Gerente(String diretoria){
        this.diretoria = diretoria;
    }

    public String getDiretoria() {
        return this.diretoria;
    }

    public void setDiretoria(String diretoria) {
        this.diretoria = diretoria;
    }

    public void mostrarDados(){
        System.out.println("O nome do Gerente é: " + getNome() +", Matricula: " + getMatricula()
        + ", Diretoria: " + getDiretoria());
        System.out.println("-------------------------------");
    }

}
