package conceitos;

public class Diretor extends Funcionario {
    private String areaDeNegocio;

    //Construtor vazio
    public Diretor(){}

    //Construtor com parametros
    public Diretor(String areaDeNegocio){
        this.areaDeNegocio = areaDeNegocio;
    }


    public String getAreaDeNegocio() {
        return this.areaDeNegocio;
    }

    public void setAreaDeNegocio(String areaDeNegocio) {
        this.areaDeNegocio = areaDeNegocio;
    }

    public void mostrarDados(){
        System.out.println("O nome do Diretor é: " + getNome() +", Matricula: " + getMatricula()
        + ", Area de Negocio: " + getAreaDeNegocio());
        System.out.println("-------------------------------");
    }

    
}
