package formacao.desenvolvedores.tecnologia.uno.projetodesistemasorientadoaobjetos.conceitos_poo.heranca;

import android.util.Log;

public class Leao extends Mamifero {
    //atributo
    private static final String TAG = "Leao";
    //contrutor vazio
    public Leao() {}
    //metodo
    public void rugir(){
        Log.d(TAG, "O leão está rugindo");

    }
}
