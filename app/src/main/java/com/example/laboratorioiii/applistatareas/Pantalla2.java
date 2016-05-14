package com.example.laboratorioiii.applistatareas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Pantalla2 extends AppCompatActivity implements View.OnClickListener {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantalla2);

        String nombreRecibido = getIntent().getStringExtra("nombre");
    }

    @Override
    public void onClick(View view) {

    }
}
