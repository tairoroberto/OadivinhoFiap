package br.com.tairoroberto.oadivinhofiap;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private TextView textViewUltimoChute;
    private EditText editTextChuteJogador;
    private int chuteJogador;
    private int chuteAleatorio;
    private Random geradorNumero;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextChuteJogador = (EditText) findViewById(R.id.editTextChuteJogador);
        textViewUltimoChute = (TextView) findViewById(R.id.textViewUltimoChute);
        geradorNumero = new Random();
        chuteAleatorio = geradorNumero.nextInt(5);
    }

    public void chutar(View view) {
        if ("".equals(editTextChuteJogador.getText().toString())){
            Toast.makeText(this, "Insira o chute", Toast.LENGTH_SHORT).show();
            return;
        }

        if (chuteJogador < chuteAleatorio){
            Toast.makeText(this, "Chute é menor", Toast.LENGTH_SHORT).show();
            return;
        }

        if (chuteJogador > chuteAleatorio){
            Toast.makeText(this, "Chute é maior", Toast.LENGTH_SHORT).show();
            return;
        }

        if (chuteJogador == chuteAleatorio){
            Toast.makeText(this, "Acertou mizeravi", Toast.LENGTH_SHORT).show();
            textViewUltimoChute.setText(editTextChuteJogador.getText().toString());
            return;
        }

        chuteJogador = Integer.parseInt(editTextChuteJogador.getText().toString());

        if (chuteJogador < chuteAleatorio) {
            AlertDialog.Builder alertDialog = new AlertDialog.Builder(this);
            alertDialog.setTitle("Atenção");
            alertDialog.setMessage("O chute deve ser maio que: " + editTextChuteJogador.getText().toString());
            alertDialog.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    dialog.dismiss();
                }
            });
            alertDialog.create();
            alertDialog.show();
        }
    }
}
