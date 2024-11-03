package iset.dsi.tp2exercice1;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Monnaie extends AppCompatActivity {
EditText numb ;
RadioButton rd1 ,rd2;
RadioGroup radioGroup;
TextView affich ;
Button btn ,btn2 ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_monnaie);
        numb=findViewById(R.id.number);
        rd1 = findViewById(R.id.rd1);
        rd2 = findViewById(R.id.rd2);
        btn = findViewById(R.id.btn);
        affich = findViewById(R.id.affich);
        btn2=findViewById(R.id.btn2);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(TextUtils.isEmpty(numb.getText().toString())){
                    Toast toast =Toast.makeText(v.getContext(),"champs vide",Toast.LENGTH_SHORT);
                    toast.show();
                }
                else {
                    Float nb = Float.parseFloat(numb.getText().toString());
                    if(rd1.isChecked()){
                        nb = nb * 0.3f;
                        affich.setText("vous avez "+nb +" euros");
                    }
                    else if(rd2.isChecked()){
                        nb = nb * 3f;
                        affich.setText("vous avez "+nb +" Dinars");
                    }
                    else{
                        Toast toast =Toast.makeText(v.getContext(),"aucun bouton radio n'a été sélectionné",Toast.LENGTH_SHORT);
                        toast.show();
                    }
                }

            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                numb.setText("");
                affich.setText("the result will be displayed here");
            }
        });

    }
}