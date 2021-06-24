package com.jherrera.myappfecha;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Calendar;

public class MADatos extends AppCompatActivity {
    private TextView campo2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_madatos);
        campo2 = findViewById(R.id.txtA);
        this.año();
    }
    private void año() {
        Bundle bundle = getIntent().getExtras();
        Calendar calendar = Calendar.getInstance();
        if (bundle != null){
            String año = bundle.getString("año");
            int dia = 1;
            int mes = 0;
            calendar.set(Integer.parseInt(año),mes,dia);
            int sem = calendar.getActualMaximum(Calendar.WEEK_OF_YEAR);
            int mese = 12;
            int dias = calendar.getActualMaximum(calendar.DAY_OF_YEAR);
            if (dias == 366){
                campo2.setText("Año bisiesto "+" \nmeses: "+mese+" \nsemanas: "+sem+" \ndias: "+dias);
            } else {
                campo2.setText("Año no bisiesto "+" \nmeses: "+mese+" \nsemanas: "+sem+" \ndias: "+dias);
            }
        }else{
            Toast.makeText(this,"Datos no Encontrar",Toast.LENGTH_SHORT).show();
        }
    }
}