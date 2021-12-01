package com.example.conversaoeuro;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity3 extends AppCompatActivity {

    private EditText editNumero;
    private Button verificar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        editNumero = findViewById(R.id.editNumber);
        verificar = findViewById(R.id.btnNumber);

        verificar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int numero = Integer.parseInt(editNumero.getText().toString());

                if (numero % 2 == 0)
                    Toast.makeText(getApplicationContext(), "O número " + numero + " é par", Toast.LENGTH_LONG).show();
                else
                    Toast.makeText(getApplicationContext(), "O número " + numero + " é impar", Toast.LENGTH_LONG).show();
                

                for (int i = 2; i<numero; i++){
                    if (numero % i == 0){
                        Toast.makeText(getApplicationContext(), "O número " + numero + " não é primo", Toast.LENGTH_SHORT).show();
                        return;
                    }
                }
                Toast.makeText(getApplicationContext(), "O número " + numero + " é primo", Toast.LENGTH_SHORT).show();

            }
        });

    }
}