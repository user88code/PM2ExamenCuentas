package com.example.pm2examencuentas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button salvarContacto;
    Button contactosSalvados;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        salvarContacto =(Button) findViewById(R.id.salvarContacto);
        contactosSalvados   = (Button) findViewById(R.id.contactosSalvados);
    }
}