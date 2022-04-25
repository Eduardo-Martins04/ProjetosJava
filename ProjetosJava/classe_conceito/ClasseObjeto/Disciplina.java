public class Disciplina {
        // Aqui serão declarados os atributos da classe
        private int codigo, cargaHoraria;
        private String nome;

        
        public Disciplina(){}
        public Disciplina(int codigo, String nome, int cargaHoraria){
            this.codigo = codigo;
            this.nome = nome;
            this.cargaHoraria = cargaHoraria;
        }

        public int getCodigo() {
            return codigo;
        }

        public void setCodigo(int codigo) {
            this.codigo = codigo;
        }

        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public int getCargaHoraria() {
            return cargaHoraria;
        }

        public void setCargaHoraria(int cargaHoraria) {
            this.cargaHoraria = cargaHoraria;
        }

        public String mostrarDados(){
            String msg = "Código: "
            + getCodigo()
            + ", Nome: "
            + getNome()
            + ", Carga Horaria: "
            + getCargaHoraria()
            + "\n------------";

            return msg;
        }
}
/*
Criar uma classe chamada Disciplina que implemente: código, nome, carga horária, da
disciplina. Definas os atributos e métodos que achar necessário p/ que a classe tenha
as funcionalidades e comportamentos desejáveis para atender ao seu propósito.
*/