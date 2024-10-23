package com.example.recycle;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import adapters.TortugaAdapter;
import models.Tortuga;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclertortuga;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclertortuga=findViewById(R.id.recyclertortuga);
        List<Tortuga> tortugas = new ArrayList<>();
        tortugas.add(new Tortuga("Leonardo", "Es azul y tiene disciplina", "Espada", Color.parseColor("#0000FF"), R.drawable.leonardo));
        tortugas.add(new Tortuga("Donatello", "Es morado y es el más inteligente", "Bastón", Color.parseColor("#800080"), R.drawable.donatello));
        tortugas.add(new Tortuga("Raphael", "Es rojo y muy fuerte", "Sai", Color.parseColor("#FF0000"), R.drawable.rafael));
        tortugas.add(new Tortuga("Miguel", "Es naranja y divertido", "Nunchaku", Color.parseColor("#FFA500"), R.drawable.miguel));



        TortugaAdapter adapterTortuga = new TortugaAdapter(tortugas);
        recyclertortuga.setAdapter(adapterTortuga);
        recyclertortuga.setHasFixedSize(true);
        recyclertortuga.setLayoutManager(new LinearLayoutManager(getApplicationContext()));

    }
}