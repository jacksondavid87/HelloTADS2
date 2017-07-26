package com.example.aluno.hellotads;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView imagem = (ImageView) findViewById(R.id.image);
        imagem.setImageResource(R.drawable.smile);
    }
}
