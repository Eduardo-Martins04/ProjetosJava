public class InstituicaoDeEnsino {
        // Aqui serão declarados os atributos da classe
        private String razaoSocial, cnpj, endereco, cidade, telefone;

        
        public InstituicaoDeEnsino(){}

        public InstituicaoDeEnsino(String razaoSocial, String cnpj, String endereco, String cidade, String telefone){
            this.razaoSocial = razaoSocial;
            this.cnpj = cnpj;
            this.endereco = endereco;
            this.cidade = cidade;
            this.telefone = telefone;
        }

        public String getRazaoSocial() {
            return razaoSocial;
        }

        public void setRazaoSocial(String razaoSocial) {
            this.razaoSocial = razaoSocial;
        }

        public String getCnpj() {
            return cnpj;
        }

        public void setCnpj(String cnpj) {
            this.cnpj = cnpj;
        }
        

        public String getEndereco() {
            return endereco;
        }

        public void setEndereco(String endereco) {
            this.endereco = endereco;
        }

        public String getCidade() {
            return cidade;
        }

        public void setCidade(String cidade) {
            this.cidade = cidade;
        }

        public String getTelefone() {
            return telefone;
        }

        public void setTelefone(String telefone) {
            this.telefone = telefone;
        }

        public String mostrarDados(){
            String msg = "Razão Social: "
            + getRazaoSocial()
            + ", CNPJ: "
            + getCnpj()
            + ", Endereço: "
            + getEndereco()
            + ", Cidade: "
            + getCidade()
            + ", Telefone: "
            + getTelefone()
            +"\n------------";

            return msg;
        }
        
}
/*
Criar uma classe chamada InstituicaoDeEnsino que implemente: razão social, cnpj,
endereço, cidade, telefone, da instituição de ensino. Definas os atributos e métodos
que achar necessário p/ que a classe tenha as funcionalidades e comportamentos
desejáveis para atender ao seu propósito.
*/
