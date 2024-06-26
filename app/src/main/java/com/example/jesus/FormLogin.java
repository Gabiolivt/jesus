package com.example.jesus;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.text.Normalizer;

public class FormLogin extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_form_login);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

    }

    public void FormSobre(View view) {
        Intent intent=new Intent(FormLogin.this, FormSobre.class);
        startActivity(intent);
    }

    public void FormLanche(View view) {
        Intent intent=new Intent(FormLogin.this, FormLanche.class);
        startActivity(intent);
    }

    public void Cadastro(View view) {
        Intent intent=new Intent(FormLogin.this, FormCadastro.class);
        startActivity(intent);
    }
}