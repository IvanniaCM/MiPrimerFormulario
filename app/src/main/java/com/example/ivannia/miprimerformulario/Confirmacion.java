package com.example.ivannia.miprimerformulario;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.content.Intent;

/**
 * Created by ivannia on 21/9/2020.
 */

public class Confirmacion extends AppCompatActivity implements OnClickListener{
    public Confirmacion() {
        super();
    }
    Bundle parametros;
    Button button_id2;
    private TextView tvNombre;
    private TextView tvTelefono;
    private TextView tvEmail;
    private TextView tvFechaNac;
    private TextView tvDescripcion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.confirmacion);
        button_id2 = (Button)findViewById(R.id.button_id1);
        button_id2.setOnClickListener(this);
        button_id2onClick();
        parametros = getIntent().getExtras();

        TextView tvNombre2 = (TextView) findViewById(R.id.tvNombre);
        TextView tvTelefono2 = (TextView) findViewById(R.id.tvTelefono);
        TextView tvEmail2 = (TextView) findViewById(R.id.tvEmail);
        TextView tvFechaNac2 = (TextView) findViewById(R.id.tvFechaNac);
        TextView tvDescripcion2 = (TextView) findViewById(R.id.tvDescripcion);

        String ptvNombre2 = parametros.getString("tvNombre2");
        String ptvTelefono2 = parametros.getString("tvTelefono2");
        String ptvEmail2 = parametros.getString("tvEmail2");
        String ptvFechaNac2 = parametros.getString("tvFechaNac2");
        String ptvDescripcion2 = parametros.getString("tvDescripcion2");

        tvNombre2.setText(ptvNombre2);
        tvTelefono2.setText(ptvTelefono2);
        tvEmail2.setText(ptvEmail2);
        tvFechaNac2.setText(ptvFechaNac2);
        tvDescripcion2.setText(ptvDescripcion2);

    }



    public void button_id2onClick() {
        button_id2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intento = new Intent(Confirmacion.this, FormularioActivity.class);
                intento.putExtra("tvNombre", "tvNombre");
                intento.putExtra("tvTelefono", "tvTelefono");
                intento.putExtra("tvEmail", "tvEmail");
                intento.putExtra("tvFechaNac", "tvFechaNac");
                intento.putExtra("tvDescripcion", "tvDescripcion");
                startActivity(intento);
                finish();

            }
        }
    }

