public class LaboratórioDeInformatica {
        // Aqui serão declarados os atributos da classe
        private String nome, bloco, sistemaOperacional;
        private int quantidadeComputadores;


        public LaboratórioDeInformatica(){}

        public LaboratórioDeInformatica(String nome, String bloco, int quantidadeComputadores, String sistemaOperacional){
            this.nome = nome;
            this.bloco = bloco;
            this.quantidadeComputadores = quantidadeComputadores;
            this.sistemaOperacional = sistemaOperacional;
        }

        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public String getBloco() {
            return bloco;
        }

        public void setBloco(String bloco) {
            this.bloco = bloco;
        }

        public int getQuantidadeComputadores() {
            return quantidadeComputadores;
        }

        public void setQuantidadeComputadores(int quantidadeComputadores) {
            this.quantidadeComputadores = quantidadeComputadores;
        }

        public String getSistemaOperacional() {
            return sistemaOperacional;
        }

        public void setSistemaOperacional(String sistemaOperacional) {
            this.sistemaOperacional = sistemaOperacional;
        }

        String mostrarDados(){
            String msg = "Nome: "
            + nome
            + ", Bloco: "
            + bloco
            + ", Quantidade de Computadores: "
            + quantidadeComputadores
            + ", Sistema Operacional: "
            + sistemaOperacional
            + "\n------------";

            return msg;
        }
}
/*
Criar uma classe chamada LaboratórioDeInformatica que implemente: nome, bloco,
quantidade de computadores, sistema operacional, do laboratório de informática.
Definas os atributos e métodos que achar necessário p/ que a classe tenha as
funcionalidades e comportamentos desejáveis para atender ao seu propósito.
*/