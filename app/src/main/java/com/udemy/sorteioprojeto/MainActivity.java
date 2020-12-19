package com.udemy.sorteioprojeto;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void gera_numero( View view ){

        TextView texto_destino = ( TextView ) findViewById( R.id.id_texto_destino );
        Random gerador = new Random();
        int num_gerado = gerador.nextInt(10 ) + 1;
        texto_destino.setText( "Número sorteado é : " + num_gerado );

    }
}