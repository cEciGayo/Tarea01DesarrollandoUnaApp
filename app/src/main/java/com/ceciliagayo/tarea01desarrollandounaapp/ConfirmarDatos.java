package com.ceciliagayo.tarea01desarrollandounaapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ConfirmarDatos extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confirmar_datos);
    }

    public void cambiarIngresarDatos(View v) {
        startActivity(new Intent(ConfirmarDatos.this, MainActivity.class));
    }
}