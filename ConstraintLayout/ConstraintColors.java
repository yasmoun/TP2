package iset.dsi.tp2exercice1;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class RelatvColors extends AppCompatActivity {
    Button btnR ,btnB ,btnJ,btnV ;
    TextView zoneColore;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.constraint);
        btnR = findViewById(R.id.btnR);
        btnB = findViewById(R.id.btnB);
        btnJ = findViewById(R.id.btnJ);
        btnV = findViewById(R.id.btnV);
        zoneColore = findViewById(R.id.zoneColore);
        btnR.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int c = getResources().getColor(R.color.red);
                zoneColore.setBackgroundColor(c);
                Toast.makeText(v.getContext(), "Rouge", Toast.LENGTH_SHORT).show();
            }
        });
        btnB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int c = getResources().getColor(R.color.blue);
                zoneColore.setBackgroundColor(c);
                Toast.makeText(v.getContext(), "Bleu", Toast.LENGTH_SHORT).show();
            }
        });
        btnJ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int c = getResources().getColor(R.color.jaune);
                zoneColore.setBackgroundColor(c);
                Toast.makeText(v.getContext(), "Jaune", Toast.LENGTH_SHORT).show();
            }
        });
        btnV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int c = getResources().getColor(R.color.vert);
                zoneColore.setBackgroundColor(c);
                Toast.makeText(v.getContext(), "Vert", Toast.LENGTH_SHORT).show();
            }
        });
    }
    }
