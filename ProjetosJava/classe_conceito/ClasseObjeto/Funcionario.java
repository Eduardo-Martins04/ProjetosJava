public class Funcionario {
        // Aqui serão declarados os atributos da classe
        private String nome, endereco, salario, dataAdmissao;
     

        public Funcionario(){}

        public Funcionario(String nome, String endereco, String salario, String dataAdmissao){
            this.nome = nome;
            this.endereco = endereco;
            this.salario = salario;
            this. dataAdmissao = dataAdmissao;
        }

        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public String getEndereço() {
            return endereco;
        }

        public void setEndereço(String endereço) {
            this.endereco = endereço;
        }

        public String getSalario() {
            return salario;
        }

        public void setSalario(String salario) {
            this.salario = salario;
        }

        public String getDataAdmissao() {
            return dataAdmissao;
        }

            
        public void setDataAdmissao(String dataAdmissao) {
            this.dataAdmissao = dataAdmissao;
        }

        public String mostrarDados(){
            String msg = "Nome: "
            + nome
            + ", Endereço: "
            + endereco
            + ", Salario: "
            + salario
            + ", Data de Admissão: "
            + dataAdmissao
            + "\n------------";

            return msg;
        }

}
/*
Criar uma classe chamada Funcionario que implemente: nome, endereço, salário, data
de admissão, do funcionário. Definas os atributos e métodos que achar necessário p/
que a classe tenha as funcionalidades e comportamentos desejáveis para atender ao
seu propósito.
*/