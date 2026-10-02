package com.example.tsdmi_prac4_angelrodriguez;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class RegresoinfoActivity extends AppCompatActivity {
    TextView p3lblresultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_regresoinfo);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        p3lblresultado = findViewById(R.id.p3lblresultado);
        Bundle datos = getIntent().getExtras();
        String nombre = datos.getString("nombre");
        p3lblresultado.setText(nombre);
    }

    public void accionclick(View v){
        if (v.getId() == R.id.btnregresa){
            Intent tonteria = new Intent();
            tonteria.putExtra("info","somos muy malos");
            setResult(RESULT_OK,tonteria);
            finish();
        } else if (v.getId() == R.id.btncancela) {
            setResult(RESULT_CANCELED);
            finish();
        }
    }
}