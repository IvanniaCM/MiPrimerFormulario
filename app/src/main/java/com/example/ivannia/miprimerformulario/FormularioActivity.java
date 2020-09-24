package com.example.ivannia.miprimerformulario;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;
import android.widget.Button;
import android.view.View.OnClickListener;

/**
 * A login screen that offers login via email/password.
 */
public class FormularioActivity extends AppCompatActivity  implements OnClickListener{

    Button button_id1;
    Bundle

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_formulario);
        button_id1 = (Button)findViewById(R.id.button_id1);
        button_id1.setOnClickListener(this);
        button_id1onClick();
        }
    public void button_id1onClick() {
        button_id1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AbrirConfirmacionIntent();
            }
        }}
    public void AbrirConfirmacionIntent() {
        Intent AbrirConfirmacion = new Intent(FormularioActivity.this, Confirmacion.class);
        AbrirConfirmacion.putExtra("tvNombre", "tvNombre");
        AbrirConfirmacion.putExtra("tvTelefono", "tvTelefono");
        AbrirConfirmacion.putExtra("tvEmail", "tvEmail");
        AbrirConfirmacion.putExtra("tvFechaNac", "tvFechaNac");
        AbrirConfirmacion.putExtra("tvDescripcion", "tvDescripcion");
        startActivity(AbrirConfirmacion);
        finish();

    }
