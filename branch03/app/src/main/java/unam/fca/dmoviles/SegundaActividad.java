package unam.fca.dmoviles;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

public class SegundaActividad extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda_actividad);

        TextView tv = findViewById(R.id.tv);
        //b) Revisa la referencia y agrega el codigo en el archivo SegundaActividad
        // para que el textview muestre el mensaje que se manda en EXTRA_MESSAGE

        // Primero obtenemos el mensaje de la intención
        Intent intent = getIntent();
        String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);

        // ahora el valor de la variable mensaje se lo pasamos al TextView
        tv.setText(message);

        // Ya solo establecemos la vista de texto como interfaz de usuario de la actividad
        setContentView(tv);
    }

}
