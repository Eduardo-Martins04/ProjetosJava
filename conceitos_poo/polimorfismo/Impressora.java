package formacao.desenvolvedores.tecnologia.uno.projetodesistemasorientadoaobjetos.conceitos_poo.polimorfismo;

import android.util.Log;

import formacao.desenvolvedores.tecnologia.uno.projetodesistemasorientadoaobjetos.conceitos_poo.heranca.Leao;

public class Impressora {

    private static final String TAG = "Impressora";

    public Impressora() {}

    //polimorfismo estatico
    public void imprimir(String texto){
        Log.d(TAG, "Imprimi a cadeia de caracteres: " + texto);
    }

    public void imprimir(int numeroInteiro){
        Log.d(TAG, "Imprimi numeros inteiros: " + numeroInteiro);
    }

    public void imprimir(double numeroDouble){
        Log.d(TAG, "imprimi numeros double: " + numeroDouble);
    }


}
