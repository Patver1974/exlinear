package be.bxl.formation.myapplicationexercice1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivityExercice2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_exercice2);
        Intent intent = getIntent();

        // La méthode ".getExtras()" sur l'intent, permet de récuperer l'ensemble de des données envoyé
        Bundle data = intent.getExtras();

        // La méthode ".getTypeExtra(...)" permet de recuperer une donnée ciblé
        String msg="";
        msg = "Bienvenue " + intent.getStringExtra("Nom")+" "+intent.getStringExtra("prenom");
        TextView tv1;
        tv1 = findViewById(R.id.textView2);
        tv1.setText(msg);




    }
}