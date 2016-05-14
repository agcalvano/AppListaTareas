package com.example.laboratorioiii.applistatareas;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity/* implements View.OnClickListener */{

    private EditText txtNombre;
    private Button btnEntrar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtNombre = (EditText)findViewById(R.id.txt_nombre);
        btnEntrar = (Button)findViewById(R.id.btn_entrar);

        btnEntrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String texto = txtNombre.getText().toString();

                Intent intent = new Intent();
                intent.putExtra("nombre",texto); //pasa objetos de una pantalla a otra
                intent.setClass(view.getContext(),Pantalla2.class);
                startActivity(intent);
            }
        });

    }

   /* @Override
    public void onClick(View view) {

        Intent intent = new Intent();
        intent.putExtra("nombre",texto); //pasa objetos de una pantalla a otra
        intent.setClass(view.getContext(),Pantalla2.class);
        startActivity(intent);
    }*/
}
