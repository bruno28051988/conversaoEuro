package com.example.conversaoeuro;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputEditText;

public class MainActivity2 extends AppCompatActivity {

    private TextInputEditText campoLogin, campoSenha;
    private Button entrar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        campoLogin = findViewById(R.id.edLogin);
        campoSenha = findViewById(R.id.edSenha);
        entrar = findViewById(R.id.btnEntrar);

        entrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String login = campoLogin.getText().toString();
                String senha = campoSenha.getText().toString();

                if(login.equals("BBordin88") && senha.equals("Sk@tes1988")){
                    Toast.makeText(getApplicationContext(), "Sucesso ao entrar!", Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(getApplicationContext(), "Login ou senha errada!", Toast.LENGTH_SHORT).show();
                }

                campoLogin.setText("");
                campoSenha.setText("");
            }
        });
    }
}