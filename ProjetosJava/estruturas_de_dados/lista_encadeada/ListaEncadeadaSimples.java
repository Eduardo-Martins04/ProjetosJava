package lista_encadeada;

public class ListaEncadeadaSimples{
    private NoDaListaEncadeadaSimples inicioDaLista;

    public ListaEncadeadaSimples(){
        inicioDaLista = null;
    }

    public Boolean listaEncadeadaVazia(){
        return inicioDaLista == null;
        /*if(inicioDaLista == null){
            return true;
        } else {
            return false;
        }*/
    }

    //insere no incio da lista
    public void inserirNoInicioDaLista(int valorNo){
        NoDaListaEncadeadaSimples novo = new NoDaListaEncadeadaSimples(valorNo);
        novo.setProximoNo(inicioDaLista);
        inicioDaLista = novo;
    }

    public void inserirNoFinalDaLista(int valorNo){
        NoDaListaEncadeadaSimples novo = new NoDaListaEncadeadaSimples(valorNo);
        novo.setProximoNo(inicioDaLista);
    }
}
