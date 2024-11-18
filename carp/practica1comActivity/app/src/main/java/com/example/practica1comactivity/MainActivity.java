package com.example.practica1comactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button btnA1pasaParametro;
    EditText txtA1Nombre;
    EditText txtA2id;
    EditText txtA3Correo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnA1pasaParametro = findViewById(R.id.btnA1pasoNombre);
        txtA1Nombre = findViewById(R.id.txtA1Nombre);
        txtA2id = findViewById(R.id.txtA2id);
        txtA3Correo = findViewById(R.id.txtA3correo);

        btnA1pasaParametro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pasoParametro();
            }
        });
    }

    public void pasoParametro() {
        String nombre = txtA1Nombre.getText().toString();
        String id = txtA2id.getText().toString();
        String correo = txtA3Correo.getText().toString();

        if (nombre.isEmpty() || id.isEmpty() || correo.isEmpty()) {
            Toast.makeText(this, "Todos los campos son obligatorios", Toast.LENGTH_SHORT).show();
        } else {
            Intent intent = new Intent(this, pantalla3.class);
            intent.putExtra("nombre", nombre);
            intent.putExtra("id", id);
            intent.putExtra("correo", correo);
            startActivity(intent);
        }
    }
}
