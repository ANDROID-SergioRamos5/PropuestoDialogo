package com.example.propuestodialogo;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button botonDialogo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        botonDialogo = (Button) findViewById(R.id.boton_dialogo);
        botonDialogo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);

                LayoutInflater inflater = MainActivity.this.getLayoutInflater();

                View v = inflater.inflate(R.layout.dialogo,null);

                builder.setView(v);

                Button crear = (Button) v.findViewById(R.id.crearCuenta);
                Button iniciar = (Button) v.findViewById(R.id.iniciarSesion);

                crear.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(getApplicationContext(),"Boton crear cuenta", Toast.LENGTH_LONG).show();
                    }
                });

                iniciar.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(getApplicationContext(), "Boton iniciar sesion", Toast.LENGTH_LONG).show();
                    }
                });

                builder.create();
                builder.show();
            }
        });
    }
}
