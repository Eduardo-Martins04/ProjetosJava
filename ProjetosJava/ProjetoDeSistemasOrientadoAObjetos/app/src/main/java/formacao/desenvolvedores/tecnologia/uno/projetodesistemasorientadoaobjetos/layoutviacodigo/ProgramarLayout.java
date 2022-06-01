package formacao.desenvolvedores.tecnologia.uno.projetodesistemasorientadoaobjetos.layoutviacodigo;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.content.res.Resources;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.Toast;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import formacao.desenvolvedores.tecnologia.uno.projetodesistemasorientadoaobjetos.R;

public class ProgramarLayout extends AppCompatActivity {
    private static final int BTN_PRESSIONAR_BOTAO_ID = 125478;
    private static final int EDT_NOME_ID = 125479;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //NAO SERA USADO O LAYOUT XML
        //setContentView(R.layout.activity_programar_layout);

        //o botao é instanciado primeiro p/ poder ser incluido no layout
        Button btnPressionar = new Button(this);

        RelativeLayout layoutAct = new RelativeLayout(this);

        //define a cor de fundo do layout
        layoutAct.setBackgroundColor(Color.rgb(255,182,193));

        //define texto e cor de fundo do botao
        btnPressionar.setText("Pressione");
        btnPressionar.setBackgroundColor(Color.rgb(135,206,250));

        final EditText edtNome = new EditText(this);

        //usando ID's View. foi criado previamente o arquivo de resource id.val

        btnPressionar.setId(BTN_PRESSIONAR_BOTAO_ID);
        edtNome.setId(EDT_NOME_ID);
        edtNome.setClickable(false);
        edtNome.setCursorVisible(false);
        edtNome.setGravity(Gravity.CENTER);

        //Define Altura(height) e Largura(width) do botao (widget) p/ armazenar o conteudo

        RelativeLayout.LayoutParams parametrosBtnPressionar = new RelativeLayout.
                LayoutParams(RelativeLayout.LayoutParams.WRAP_CONTENT,
                RelativeLayout.LayoutParams.WRAP_CONTENT);

        //centralizar botao dentro do layout
        parametrosBtnPressionar.addRule(RelativeLayout.CENTER_HORIZONTAL);
        parametrosBtnPressionar.addRule(RelativeLayout.CENTER_VERTICAL);

        //Definir Altura(height) e largura(width) do EditText (widget p/ armazenar o conteudo
        RelativeLayout.LayoutParams parametrosEdtNome = new RelativeLayout.
                LayoutParams(RelativeLayout.LayoutParams.WRAP_CONTENT,
                RelativeLayout.LayoutParams.WRAP_CONTENT);
        //Posiciona o edtNome acima do botao que esta centralizado
        parametrosEdtNome.addRule(RelativeLayout.ABOVE, btnPressionar.getId());
        parametrosEdtNome.addRule(RelativeLayout.CENTER_HORIZONTAL);
        parametrosEdtNome.setMargins(0, 0, 0, 80);

        //Atenção p/ nao vincular uma View + de uma vez no codigo p/ nao gerar a exceção
        //The specified child already has a parent, You must call removeView() on the child's parent first
        layoutAct.addView(btnPressionar, parametrosBtnPressionar);
        layoutAct.addView(edtNome, parametrosEdtNome);

        //Uma outra forma de informar ao layout o widget/parametros
        //btnPressionar.setLayoutParams(parametrosBtnPressioar);

        //Converte dp em px
        Resources r = getResources();
        int pixels = (int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, 200,
                r.getDisplayMetrics());

        edtNome.setWidth(pixels);

        setContentView(layoutAct);

        btnPressionar.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.O)
            @Override
            public void onClick(View view) {
                LocalDateTime hj = LocalDateTime.now();
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
                edtNome.setText("Data: " + hj.format(formatter));
                
            }
        });
    }
}