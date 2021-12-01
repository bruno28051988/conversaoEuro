package com.example.conversaoeuro;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity4 extends AppCompatActivity {

    private EditText totalHora;
    private Button calcular;
    private TextView resultadoHoras, resultadoDias, resultadoSemanas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        totalHora = findViewById(R.id.editHora);
        calcular = findViewById(R.id.btnCalcularHora);
        resultadoHoras = findViewById(R.id.text_Horas);
        resultadoDias = findViewById(R.id.text_Dias);
        resultadoSemanas = findViewById(R.id.text_Semanas);


        calcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int horaTotal = Integer.parseInt(totalHora.getText().toString());

                int nSemanas = horaTotal / 24 / 7;
                resultadoSemanas.setText(nSemanas + " Semanas");

                int nDias = (horaTotal % (24 * 7)) /24;
                resultadoDias.setText(nDias + " Dias");

                int nHoras = (horaTotal % (24 * 7)) % 24;
                resultadoHoras.setText(nHoras + " Horas");
            }
        });
    }
}