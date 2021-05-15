package be.bxl.formation.myapplicationexercice1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivityExercice3 extends AppCompatActivity {
   boolean afficherimg;
    ImageView ImgV;
    boolean reponseb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_exercice3);
        ImgV = findViewById(R.id.imageView);
        Intent intent = getIntent();

        // La méthode ".getExtras()" sur l'intent, permet de récuperer l'ensemble de des données envoyé
        Bundle data = intent.getExtras();

        // La méthode ".getTypeExtra(...)" permet de recuperer une donnée ciblé
        afficherimg = Boolean.parseBoolean(intent.getStringExtra("Image"));

        reponseb = Boolean.parseBoolean(intent.getStringExtra("Femme"));
        if (reponseb == true) {
            Toast.makeText(getApplicationContext(), "JE Suis une femme", Toast.LENGTH_LONG).show();
            if (afficherimg == true) {
                ImgV.setImageResource(R.drawable.fotofemme);
            }
        }
        reponseb = Boolean.parseBoolean(intent.getStringExtra("Homme"));
        if (reponseb == true) {
            Toast.makeText(getApplicationContext(), "JE Suis un homme", Toast.LENGTH_LONG).show();
            if (afficherimg == true) {
                ImgV.setImageResource(R.drawable.fotohomme);
            }
        }
    }

}
