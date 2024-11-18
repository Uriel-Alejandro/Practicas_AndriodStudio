package com.example.myform;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;

import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText editTextID, editTextName, editTextEmail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextID = findViewById(R.id.editTextID);
        editTextName = findViewById(R.id.editTextName);
        editTextEmail = findViewById(R.id.editTextEmail);
        Button buttonSubmit = findViewById(R.id.buttonSubmit);

        buttonSubmit.setOnClickListener(v -> {
            String id = editTextID.getText().toString();
            String name = editTextName.getText().toString();
            String email = editTextEmail.getText().toString();


            Intent intent = new Intent(MainActivity.this, DisplayActivity.class);
            intent.putExtra("ID", id);
            intent.putExtra("NAME", name);
            intent.putExtra("EMAIL", email);
            startActivity(intent);


        });

    }
}
