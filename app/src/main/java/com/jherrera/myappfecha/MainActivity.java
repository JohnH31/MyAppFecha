package com.jherrera.myappfecha;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;

public class MainActivity extends AppCompatActivity {
    private EditText campo1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        campo1 = findViewById(R.id.txtAno);
    }

    private void datos() {
        String año = campo1.getText().toString();
        if (!año.isEmpty()) {
            Intent intent = new Intent(this,MADatos.class);
            intent.putExtra("año",año);
            startActivity(intent);
    }else {
            Toast.makeText(this,"Datos no ingresados",Toast.LENGTH_SHORT).show();
        }
    }

    public void onClick(View view) {
        this.datos();
    }
}