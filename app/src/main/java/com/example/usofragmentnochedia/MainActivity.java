package com.example.usofragmentnochedia;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btnModo;
    boolean modoDia = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnModo = findViewById(R.id.btnModo);

        getSupportFragmentManager()// libreria
                .beginTransaction() // metodos
                .add(R.id.contenedor, new ModoDia())// metodos
                .commit();// metodos

    }

    public void cambiaModo(View view) {

        Fragment f;

        if (modoDia) {
            f = new ModoNoche();
        } else {
            f = new ModoDia();
        }
        modoDia = !modoDia;


        //prueba commit

        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.contenedor, f)
                .commit();

    }
}