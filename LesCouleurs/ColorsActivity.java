package iset.dsi.tp2exercice1;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class ColorsActivity extends AppCompatActivity {

    Button btn1 ,btn2 ,btn3,btn4 ;
    TextView TextColor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.col);

       btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);
        TextColor = findViewById(R.id.TextColor);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               int c = getResources().getColor(R.color.red);
                TextColor.setBackgroundColor(c);
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int c = getResources().getColor(R.color.blue);
                TextColor.setBackgroundColor(c);
            }
        });
       btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int c = getResources().getColor(R.color.jaune);
                TextColor.setBackgroundColor(c);
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int c = getResources().getColor(R.color.vert);
                TextColor.setBackgroundColor(c);
            }
        });
    }
}