package conceitos;

public class Engenheiro extends Funcionario {
    private String crea;

    public Engenheiro(){}

    public Engenheiro(String crea){
        this.crea = crea;
    }

    public String getCrea() {
        return this.crea;
    }

    public void setCrea(String crea) {
        this.crea = crea;
    }

    public void mostrarDados(){
        System.out.println("O nome do Engenheiro é: " + getNome() +", Matricula: " + getMatricula()
        + ", CREA: " + getCrea());
        System.out.println("-------------------------------");
    }
}
