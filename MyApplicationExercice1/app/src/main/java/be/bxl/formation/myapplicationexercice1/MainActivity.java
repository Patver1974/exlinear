package be.bxl.formation.myapplicationexercice1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button BtEx1;
    Button BtEx2;
    Button BtEx3;
    Button BtEx4;
    TextView Tvnom;
    TextView Tvprenom;

    EditText telephone;

    Switch Sw1;
    CheckBox ChkBHomme;
    CheckBox ChkBFemme;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Tvnom = findViewById(R.id.ex2Nom);
        Tvprenom = findViewById(R.id.ex2Prenom1);
        BtEx1 = findViewById(R.id.BtEx1);

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
            intent2.putExtra("Nom", Tvnom.getText().toString());


            intent2.putExtra("prenom", Tvprenom.getText().toString());

            // Envois de l'intent a Android pour démarré l'activité
            startActivity(intent2);
        });
         Sw1= findViewById(R.id.switch1);
         ChkBHomme= findViewById(R.id.ChkBHomme);
         ChkBFemme = findViewById(R.id.ChkBFemme);


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
        telephone = findViewById(R.id.ex4Tel);
        BtEx4 = findViewById(R.id.BtEx4);
        BtEx4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String telep =telephone.getText().toString();
                Intent intent4 = new Intent(Intent.ACTION_DIAL, Uri.parse(telep));
                startActivity(intent4);
            }
        });




    }
}