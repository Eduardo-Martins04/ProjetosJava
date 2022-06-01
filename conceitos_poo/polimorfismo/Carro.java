package formacao.desenvolvedores.tecnologia.uno.projetodesistemasorientadoaobjetos.conceitos_poo.polimorfismo;

import android.util.Log;

import formacao.desenvolvedores.tecnologia.uno.projetodesistemasorientadoaobjetos.conceitos_poo.abstracao.IMotor;
// extends cria heranca == Carro filho de Veiculo
public class Carro extends Veiculo implements IMotor{

    public static final String TAG = "Carro";

    public Carro() {}

    @Override
    public void ligar(){
        super.ligar(); // chamando do pai
        Log.d(TAG, "ligando o carro...");
    }

    @Override
    public void acelerar(){
        Log.d(TAG, "Acelerando o carro");
    }


    @Override
    public String getModelo() {
        return "O motor do carro é de 4 cilindros.";
    }

    @Override
    public String getFabricante() {
        return "O fabricante do motor do carro é americano";
    }
}
