package formacao.desenvolvedores.tecnologia.uno.projetodesistemasorientadoaobjetos.conceitos_poo.polimorfismo;

import android.util.Log;

import formacao.desenvolvedores.tecnologia.uno.projetodesistemasorientadoaobjetos.conceitos_poo.abstracao.IMotor;
// extends cria a herança == Motocicleta é filho de Veiculo
public class Motocicleta extends Veiculo  implements IMotor {

    private static final String TAG = "Moto";

    public Motocicleta() {}

    @Override
    public void ligar(){
        Log.d(TAG, "ligando a motocicleta...");
    }

    @Override
    public void acelerar(){
        Log.d(TAG, "Acelerando a motocicleta");
    }

    @Override
    public String getModelo() {
        return "O motor da motocicleta tem 300 cilindradas";
    }

    @Override
    public String getFabricante() {
        return "O fabricante do motor da motocicleta é Europeu";
    }
}
