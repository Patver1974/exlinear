package be.bxl.formation.myapplicationexercice1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button BtEx1;
    Button BtEx2;
    TextView Tvnom;
    TextView Tvprenom;
    Button BtEx3;
    Switch Sw1;
    CheckBox ChkBHomme;
    CheckBox ChkBFemme;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Tvnom = findViewById(R.id.ex2Nom);
        Tvprenom = findViewById(R.id.ex2Prenom);


        BtEx1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MainActivityExercice1.class);
                startActivity(intent);
            }
        });
        BtEx2 = findViewById(R.id.BtEx2);
        BtEx2.setOnClickListener(v -> {
            Intent intent2 = new Intent(getApplicationContext(), MainActivityExercice2.class);

            // Ajout de donnée dans le bundle de l'intent
            intent2.putExtra("Nom", Tvnom.getText());
            intent2.putExtra("Prenom", Tvprenom.getText());

            // Envois de l'intent a Android pour démarré l'activité
            startActivity(intent2);
        });



        BtEx3 = findViewById(R.id.BtEx3);
        BtEx3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent3 = new Intent(getApplicationContext(), MainActivityExercice3.class);

                // Ajout de donnée dans le bundle de l'intent
                intent3.putExtra("Image", Sw1.isChecked());
                intent3.putExtra("Femme", ChkBFemme.isChecked());
                intent3.putExtra("Homme", ChkBHomme.isChecked());

                // Envois de l'intent a Android pour démarré l'activité
                startActivity(intent3);
            }
        });


    }
}