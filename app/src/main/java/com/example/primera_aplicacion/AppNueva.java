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
        EditText edNombres,edApellidos,edCedula,edCorreo,edDireccion;
        Button btnvalidar=findViewById(R.id.btnvalidar);

        edNombres=findViewById(R.id.txtnombres);
        edApellidos=findViewById(R.id.txtapellidos);
        edCedula=findViewById(R.id.txtcedula);
        edCorreo=findViewById(R.id.txtcorreo);
        edDireccion=findViewById(R.id.txtdireccion);

        btnvalidar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Obtener los valores de los campos
                String nombre = edNombres.getText().toString();
                String apellidos = edApellidos.getText().toString();
                String cedula = edCedula.getText().toString();
                String correo = edCorreo.getText().toString();
                String direccion = edDireccion.getText().toString();

                // Validar que los campos estén llenos
                if (!nombre.isEmpty() && !apellidos.isEmpty() && !cedula.isEmpty() && !correo.isEmpty() && !direccion.isEmpty()) {
                    // Todos los campos están llenos, mostrar mensaje de éxito
                    Toast.makeText(AppNueva.this, "Los campos se han llenado correctamente", Toast.LENGTH_SHORT).show();
                } else {
                    // Al menos un campo está vacío, mostrar mensaje de advertencia
                    Toast.makeText(AppNueva.this, "Llene primero los campos con info ", Toast.LENGTH_SHORT).show();
                }
            }
        });


    }
}