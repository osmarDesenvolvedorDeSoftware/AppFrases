package com.example.appfrases;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        }

       public void gerarFrases(View view){

        String[] frases = {

         "Sorrir muda tudo.",
         "Acredite no seu potencial e tudo será possível.",
         "Amanhã é um novo começo.",
         "Viva o presente.",
         "Grandes jornadas começam com pequenos passos.",
         "Não conte os dias, faça os dias contarem." ,
         "Pequenos passos, grandes conquistas.",
         "Cada desafio é uma oportunidade disfarçada.",
         "Seja a mudança que você deseja ver no mundo.",
         "A persistência é o caminho para o sucesso."

        };

        int numeroAleatorio = new Random().nextInt(9);

        TextView texto = findViewById(R.id.textFrase);
        texto.setText(frases[numeroAleatorio]);

        }

}