package formacao.desenvolvedores.tecnologia.uno.projetodesistemasorientadoaobjetos.conceitos_poo.polimorfismo;

import android.util.Log;

public class Veiculo {

    private static final String TAG = "Veiculo";

    public Veiculo() {}

    public void ligar(){
        Log.d(TAG, "ligando o veiculo...");
    }

    public void acelerar(){
        Log.d(TAG, "Acelerando o veiculo");
    }
}
