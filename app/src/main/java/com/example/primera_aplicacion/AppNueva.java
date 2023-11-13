package com.example.primera_aplicacion;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class AppNueva extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_app_nueva);

        //CREAR OBJETOS DEL MISMO TIPO DEL LAYOUT
        EditText edNombres,edAepllios,edCedula,edCorreo,edDireccion;
        Button btnvalidar=findViewById(R.id.btnvalidar);

        edNombres=findViewById(R.id.txtnombres);
        edAepllios=findViewById(R.id.txtapellidos);
        edCedula=findViewById(R.id.txtcedula);
        edCorreo=findViewById(R.id.txtcorreo);
        edDireccion=findViewById(R.id.txtdireccion);

        btnvalidar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nombre=edNombres.getText().toString();
                if(!nombre.isEmpty()){


                   Toast.makeText(AppNueva.this,"Hola gei", Toast.LENGTH_SHORT).show();

                }

            }
        });
    }
}