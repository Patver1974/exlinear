package be.bxl.formation.exo_01_interface_login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText editUsername, editPassword;
    Button btnLogin, btnReset;
    TextView textNoRegister;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Liaison les elements "code" et "interface"
        editUsername = findViewById(R.id.et_main_username);
        editPassword = findViewById(R.id.et_main_password);
        btnLogin = findViewById(R.id.btn_main_login);
        btnReset = findViewById(R.id.btn_main_reset);
        textNoRegister = findViewById(R.id.tv_main_noregister);

        // Ajout d'un listenner sur les boutons
        // - Création d'un classe anonyme sur l'interface "View.OnClickListener" pour l'implementer
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String username = editUsername.getText().toString();
                String password = editPassword.getText().toString();

                // Simulation d'une verification
                String messageToast;
                if(username.equals("Zaza") && password.equals("1234")) {
                    messageToast = String.format(getString(R.string.toast_login_welcome), username);
                }
                else {
                    messageToast = getString(R.string.toast_login_error);
                }

                Toast.makeText(getApplicationContext(), messageToast, Toast.LENGTH_LONG).show();
            }
        });

        // - L'interface ne possede qu'une méthode (@FunctionalInterface), cela nous permet
        //    d'utiliser une fonction lambda (Java 8+) à la place de la classe anonyme
        btnReset.setOnClickListener(view -> {
            editUsername.setText("");
            editPassword.setText("");
        });


        // Ajout d'un listenner sur le text "No register"
        textNoRegister.setOnClickListener(v -> {
            Toast.makeText(getApplicationContext(), "Boum, le text est cliquable :p", Toast.LENGTH_SHORT).show();


            // Création d'un intent pour ouvrir l'activité "RegisterActivity"
            Intent intent = new Intent(getApplicationContext(), RegisterActivity.class);

            // Envois de l'intent a Android pour démarré l'activité
            startActivity(intent);
        });
    }

}