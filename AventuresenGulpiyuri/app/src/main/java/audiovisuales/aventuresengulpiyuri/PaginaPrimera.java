package audiovisuales.aventuresengulpiyuri;

import android.content.Intent;
import android.speech.tts.TextToSpeech;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import util.Utilidades;

public class PaginaPrimera  extends AppCompatActivity implements TextToSpeech.OnInitListener{

    private TextToSpeech tts;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pagina_primera);
        if (!Utilidades.verificaConexion(this)){
           Utilidades.mostrarVentanaErrorDeConexion(this);
        }
        else if(Portada.getLecturaAutomatica()){
            tts= new TextToSpeech(this, this);
            //Por la API mínima que usamos tenemos que usar el método deprecated
            tts.speak(getResources().getString(R.string.primeraPagina), TextToSpeech.QUEUE_ADD, null);
        }
    }

    public void pasaPagina(View view){
        Intent mIntent= new Intent(PaginaPrimera.this, PaginaSegunda.class);
        startActivity(mIntent);
    }

    @Override
    public void onInit(int status) {}
}
