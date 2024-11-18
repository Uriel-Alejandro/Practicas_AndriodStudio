package com.example.myform;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.util.Log;
import android.widget.TextView;

public class DisplayActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display);

        TextView textViewID = findViewById(R.id.textViewID);
        TextView textViewName = findViewById(R.id.textViewName);
        TextView textViewEmail = findViewById(R.id.textViewEmail);

        Intent intent = getIntent();
        String id = intent.getStringExtra("ID");
        String name = intent.getStringExtra("NAME");
        String email = intent.getStringExtra("EMAIL");

        Log.d("DisplayActivity", "ID: " + id + ", Name: " + name + ", Email: " + email);

        if (id != null && name != null && email != null) {
            textViewID.setText("ID: " + id);
            textViewName.setText("Nombre: " + name);
            textViewEmail.setText("Correo Electrónico: " + email);
        } else {
            textViewID.setText("ID: No disponible");
            textViewName.setText("Nombre: No disponible");
            textViewEmail.setText("Correo Electrónico: No disponible");
        }
    }
}
