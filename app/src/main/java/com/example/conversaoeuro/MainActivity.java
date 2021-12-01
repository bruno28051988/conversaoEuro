package com.example.conversaoeuro;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

    private EditText et_ValorEuros, et_ValorFahrenheit, campoNome;
    private Button converter, converterTemperatura, apresentar;
    private TextView resultadoDolar, resultadoCelsius, resultadoNome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et_ValorEuros = findViewById(R.id.et_ValorEmEuros);
        converter = findViewById(R.id.bt_Converter);
        resultadoDolar = findViewById(R.id.tv_ValorEmDolares);

        et_ValorFahrenheit = findViewById(R.id.et_ValorFahrenheit);
        converterTemperatura = findViewById(R.id.bt_ConverterTemp);
        resultadoCelsius = findViewById(R.id.tv_ValorEmCelsius);

        campoNome = findViewById(R.id.et_nome);
        apresentar = findViewById(R.id.bt_apresentar);
        resultadoNome = findViewById(R.id.tv_nome);

        converter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               double valorEuros = Double.parseDouble(String.valueOf(et_ValorEuros.getText().toString()));
                DecimalFormat arredondar = new DecimalFormat("#.##");
               double valorDolares = Double.parseDouble(arredondar.format(valorEuros * 0.80));

               resultadoDolar.setText(String.valueOf("U$ " + valorDolares));

            }
        });

        converterTemperatura.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double valorFahrenheit = Double.parseDouble(et_ValorFahrenheit.getText().toString());
                DecimalFormat arrendodarTemperatura = new DecimalFormat("#.##");
                double valorCelsius = Double.parseDouble(arrendodarTemperatura.format((valorFahrenheit - 32) / 1.8));
                resultadoCelsius.setText(valorCelsius + " ºC");
            }
        });

        apresentar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nome = campoNome.getText().toString();

                if (!nome.isEmpty()){
                    resultadoNome.setText("Olá, " + nome);
                    campoNome.setText("");
                }else{
                    Toast.makeText(getApplicationContext(), "Preencha o campo nome", Toast.LENGTH_SHORT).show();
                }

            }
        });
    }
}