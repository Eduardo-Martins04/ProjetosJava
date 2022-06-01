package formacao.desenvolvedores.tecnologia.uno.projetodesistemasorientadoaobjetos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import formacao.desenvolvedores.tecnologia.uno.projetodesistemasorientadoaobjetos.conceitos_poo.abstracao.IMotor;
import formacao.desenvolvedores.tecnologia.uno.projetodesistemasorientadoaobjetos.conceitos_poo.heranca.Leao;
import formacao.desenvolvedores.tecnologia.uno.projetodesistemasorientadoaobjetos.conceitos_poo.polimorfismo.Carro;
import formacao.desenvolvedores.tecnologia.uno.projetodesistemasorientadoaobjetos.conceitos_poo.polimorfismo.Impressora;
import formacao.desenvolvedores.tecnologia.uno.projetodesistemasorientadoaobjetos.conceitos_poo.polimorfismo.Motocicleta;
import formacao.desenvolvedores.tecnologia.uno.projetodesistemasorientadoaobjetos.conceitos_poo.polimorfismo.Veiculo;
import formacao.desenvolvedores.tecnologia.uno.projetodesistemasorientadoaobjetos.layoutviacodigo.ProgramarLayout;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";
    private Leao leao;
    private Impressora impressora;
    private Carro carro;
    private Motocicleta motocicleta;
    private Veiculo veiculo;
    private Button btnProgamarLayout;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnProgamarLayout = findViewById(R.id.btnProgramarLayout);


        impressora  = new Impressora();
        leao        = new Leao();
        motocicleta = new Motocicleta();
        carro       = new Carro();
        veiculo     = new Veiculo();

        leao.rugir();
        leao.respirar();


        impressora.imprimir("Teste");
        impressora.imprimir(5);
        impressora.imprimir(Math.PI);

        veiculo.ligar();
        veiculo.acelerar();



        //carro = new Carro();
        /*carro.ligar();
        carro.acelerar();*/




        dirigir(motocicleta);

        dirigir(new Carro());
        dirigir(new Veiculo());

        IMotor iMotor = new Carro();
        Log.d(TAG, "Instanciando pelo IMotor: " + iMotor.getModelo());
        Log.d(TAG, "Instanciando pelo IMotor: " + iMotor.getFabricante());

        IMotor iMotor1 = new Motocicleta();
        Log.d(TAG, "Instanciando pelo IMotor: " + iMotor1.getModelo());
        Log.d(TAG, "Instanciando pelo IMotor: " + iMotor1.getFabricante());



        Log.d(TAG, "Instanciando a classe: " + carro.getModelo());
        Log.d(TAG, "Instanciando a classe: " + motocicleta.getFabricante());

        btnProgamarLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent irParaOutraActivity = new Intent(MainActivity.this, ProgramarLayout.class);
                startActivity(irParaOutraActivity);

                //Toast.makeText(MainActivity.this, "Clicaram no meu botão :(", Toast.LENGTH_LONG).show();

            }
        });

    }


    private boolean dirigir(Veiculo veiculo) {
        boolean operacaoBemSucedida = false;
        if (veiculo != null) {
            operacaoBemSucedida = true;
            veiculo.ligar();
            veiculo.acelerar();
        }
        return operacaoBemSucedida;

    }




}