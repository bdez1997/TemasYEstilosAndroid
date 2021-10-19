package com.bermudez.practicerestart;

import static android.view.View.*;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.Switch;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button calcularImporte;
    RadioButton radioBtnDam;
    RadioButton radioBtnDaw;
    RadioButton radioBtnAsir;
    RadioButton radioBtnManiana;
    RadioButton radioBtnTarde;
    RadioButton radioBtnOnline;
    Switch swchiva ;
    TextView textPrecio;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        radioBtnDam=findViewById(R.id.radioBtnDam);
        radioBtnDaw= findViewById(R.id.radioBtnDaw);
        radioBtnAsir=findViewById(R.id.radioBtnAsir);
        radioBtnManiana=findViewById(R.id.radioBtnManiana);
        radioBtnTarde=findViewById(R.id.radioBtnTarde);
        radioBtnOnline=findViewById(R.id.radioBtnOnline);
        swchiva = findViewById(R.id.iva);
        textPrecio=findViewById(R.id.textPrecio);

        radioBtnDam.setOnClickListener(view -> {
            textPrecio.setText("El precio es "+calcularImporteTotal());
        });
        radioBtnDaw.setOnClickListener(view -> {
            textPrecio.setText("El precio es "+calcularImporteTotal());
        });
        radioBtnAsir.setOnClickListener(view -> {
            textPrecio.setText("El precio es "+calcularImporteTotal());
        });
        radioBtnManiana.setOnClickListener(view -> {
            textPrecio.setText("El precio es "+calcularImporteTotal());
        });
        radioBtnTarde.setOnClickListener(view -> {
            textPrecio.setText("El precio es "+calcularImporteTotal());
        });
        radioBtnOnline.setOnClickListener(view -> {
            textPrecio.setText("El precio es "+calcularImporteTotal());
        });
        swchiva.setOnClickListener(view -> {
            textPrecio.setText("El precio es "+calcularImporteTotal());
        });




    }
    public double calcularImporteTotal(){
        final double precioCurso[] = {1000, 1200, 750};
        final double precioTurno[] = {600, 400, 200};
        double iva = 1.21;

        double precioxCurso = 0;
        double precioxTurno = 0;
        double precioxTotal = 0;


        if (radioBtnDam.isChecked()) {
            precioxCurso = precioCurso[0];
        }
        ;
        if (radioBtnDaw.isChecked()) {
            precioxCurso = precioCurso[1];
        }
        ;
        if (radioBtnAsir.isChecked()) {
            precioxCurso = precioCurso[2];
        }
        ;

        if (radioBtnManiana.isChecked()) {
            precioxTurno = precioTurno[0];
        }
        ;
        if (radioBtnTarde.isChecked()) {
            precioxTurno = precioTurno[1];
        }
        ;
        if (radioBtnOnline.isChecked()) {
            precioxTurno = precioTurno[2];
        }
        ;

        if (!swchiva.isChecked()) {
            iva = 1.0;
        };


        precioxTotal = (precioxCurso + precioxTurno) * iva;

        return precioxTotal;
    }
}