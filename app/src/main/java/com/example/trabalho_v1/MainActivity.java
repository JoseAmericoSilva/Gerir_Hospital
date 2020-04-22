package com.example.trabalho_v1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void BotaoMedicos  (View view){
        // Enviar a informação para outra atividade
        Intent intent = new Intent(this, Medicos.class);

        startActivity(intent);
    }

    public void BotaoPaciente (View view){
        Intent intent = new Intent(this,AdicionaPaciente.class);

        startActivity(intent);
    }

    public void BotaoDespesas(View view){
       //Intent intent = new Intent(this,AdicionaPaciente.class);

     //startActivity(intent);
    }

    public void BotaoMaterial(View view){
       // Intent intent = new Intent(this,AdicionaPaciente.class);

       // startActivity(intent);
    }

}
