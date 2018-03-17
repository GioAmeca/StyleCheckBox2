package com.unidad3.gio.stylecheckbox;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    /**declaro los componentes graficos utilizare; 1 TextView - txtTexto,
     * 2 Spinner -spinner1
     *           -spinner2
     *
     **/
private TextView txtTexto;
private Spinner spinner1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //buscamos los componengtes dentro de vista y los asignamos
        txtTexto=(TextView)findViewById(R.id.txtTexto);
        spinner1=(Spinner)findViewById(R.id.spinner1);

        //Opciones de los spinner
        String opciones[]={"Negritas","Cursivas","Mix"};
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,opciones);
        spinner1.setAdapter(adapter);
        //Evento para el spinner1
        spinner1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                //evento cuando se selecciona un item del spinner
                String opcion=spinner1.getSelectedItem().toString();
                if (opcion.equals("Negritas")){
                    txtTexto.setTypeface(null,Typeface.BOLD);
                }
                if (opcion.equals("Cursivas")){
                    txtTexto.setTypeface(null,Typeface.ITALIC);
                }
                if (opcion.equals("Mix")){
                    txtTexto.setTypeface(null,Typeface.BOLD_ITALIC);
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
    }

}
