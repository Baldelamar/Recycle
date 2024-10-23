package adapters;

import android.os.Bundle;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.recycle.R;

import models.Tortuga;

public class DatosTortuga extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_datos_tortuga);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        Tortuga tortuga = (Tortuga) getIntent().getSerializableExtra("tortuga");
        TextView texto1 = findViewById(R.id.texto1);
        TextView texto2 = findViewById(R.id.texto2);
        assert tortuga != null;
        texto2.setText(tortuga.getDescripcion());
        texto1.setText(tortuga.getArma());
    }
}