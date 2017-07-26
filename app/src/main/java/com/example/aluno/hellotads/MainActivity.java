package com.example.aluno.hellotads;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView imagem = (ImageView) findViewById(R.id.image);
        //imagem.setImageResource(R.drawable.smile);
    }

    public void Clique (View v){
        EditText edit = (EditText) findViewById(R.id.texto);
        Toast.makeText(this, edit.getText(), Toast.LENGTH_SHORT).show();
    }
}
