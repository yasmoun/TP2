package iset.dsi.tp2exercice1;

import android.graphics.Typeface;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class fontstyle extends AppCompatActivity {

    Button btn1,btn2,btn3,btn4;
    TextView textView2;
    EditText texte1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fontstyle);

        textView2 = findViewById(R.id.textView2);
        texte1 = findViewById(R.id.texte1);
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);

        btn4.setVisibility(View.INVISIBLE);
        texte1.setVisibility(View.INVISIBLE);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                texte1.setVisibility(View.VISIBLE);
                btn4.setVisibility(View.VISIBLE);
            }
            });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (TextUtils.isEmpty(texte1.getText()) ) {
                    Toast toast= Toast.makeText(v.getContext(),"champs vide",Toast.LENGTH_LONG);
                    toast.show();
                } else {
                    float n =Float.parseFloat(texte1.getText().toString());
                    textView2.setTextSize(n);
                    btn4.setVisibility(View.INVISIBLE);
                    texte1.setVisibility(View.INVISIBLE);
                }
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView2.setTypeface(Typeface.defaultFromStyle(Typeface.BOLD));
        }
            });
        btn2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                textView2.setTypeface(Typeface.defaultFromStyle(Typeface.ITALIC));

            }
        });
}
}