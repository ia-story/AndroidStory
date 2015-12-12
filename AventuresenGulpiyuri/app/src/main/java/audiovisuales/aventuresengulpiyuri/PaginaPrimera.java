package audiovisuales.aventuresengulpiyuri;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import util.Utilidades;

public class PaginaPrimera extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pagina_primera);
        if (!Utilidades.verificaConexion(this)){
           Utilidades.mostrarVentanaErrorDeConexion(this);
        }

    }


}
