package com.example.appavessopele;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class TimeLine extends AppCompatActivity {
   // private TextView textView;
   // private Button button1, button2, button3, button4, button5, button6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_time_line); // Certifique-se de que o layout correto está definido aqui

        // Encontrar a ImageView e definir a ação de clique
     /*   ImageView seta2 = findViewById(R.id.seta2);
        seta2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Abrir a MainActizzzzvity
                Intent intent = new Intent(TimeLine.this, personagens.class);
                startActivity(intent);
            }
        });

        // Inicializar a TextView e os Botões
        textView = findViewById(R.id.textView);
        button1 = findViewById(R.id.button1);
        button2 = findViewById(R.id.button2);
        button3 = findViewById(R.id.button3);
        button4 = findViewById(R.id.button4);
        button5 = findViewById(R.id.button5);
        button6 = findViewById(R.id.button6);

        // Definir ações de clique para os botões
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText("Infância de Pedro\n\nPedro relembra sua infância com seu pai, um professor que enfrentava racismo.");
                textView.setVisibility(View.VISIBLE);
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText("Morte de Henrique\n\nA morte do pai de Pedro, vítima de racismo policial, transformou sua vida.");
                textView.setVisibility(View.VISIBLE);
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText("Reflexões de Pedro\n\nPedro revisita o passado e reflete sobre o racismo e a morte de seu pai.");
                textView.setVisibility(View.VISIBLE);
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText("Reconstrução da Memória\n\nPedro tenta reconstruir as memórias e o legado de seu pai.");
                textView.setVisibility(View.VISIBLE);
            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText("Relação com a Mãe\n\nA relação de Pedro com sua mãe é marcada pelo silêncio após a morte do pai.");
                textView.setVisibility(View.VISIBLE);
            }
        });

        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText("Confronto com Racismo\n\nPedro enfrenta o racismo no trabalho e na escola, refletindo sobre o preconceito.");
                textView.setVisibility(View.VISIBLE);
            }
        });*/
    }
}
