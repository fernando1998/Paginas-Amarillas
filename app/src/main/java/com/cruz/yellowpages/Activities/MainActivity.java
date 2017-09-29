package com.cruz.yellowpages.Activities;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.cruz.yellowpages.Model.Empresa;
import com.cruz.yellowpages.R;
import com.cruz.yellowpages.Repositorio.EmpresaRepositorio;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

        EditText buscador;
        RecyclerView recyclerEmpresas;

    ArrayList<Empresa> listaEmpresas;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);




        buscador=(EditText)findViewById(R.id.edit_buscar);
        recyclerEmpresas=(RecyclerView)findViewById(R.id.primer_recycle);
        recyclerEmpresas.setLayoutManager(new LinearLayoutManager(this));

        EmpresaRepositorio empresaRepository = EmpresaRepositorio.getInstance();
        listaEmpresas= empresaRepository.getEmpresas();

        AdaptadorEmpresas adapter=new AdaptadorEmpresas(listaEmpresas);
        recyclerEmpresas.setAdapter(adapter);


        BottomNavigationView bottomNavigationView = (BottomNavigationView)findViewById(R.id.bottom_navigation);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.menu_home:
                        Toast.makeText(MainActivity.this, "Escriba en el buscador", Toast.LENGTH_SHORT).show();
                        break;
                }
                return true;
            }
        });

    }


   /* public void llenarEmpresas(){
        listaEmpresas.add(new Empresa(0, "comida", "KFC", "Calle San Jacinto 338,San Borja", "4452694", "kfc@gmail.com", "www.kfc.com",
                "Sabrosa comida chatarra ", R.drawable.img_kfc));

    }*/

    public void buscarlocal(View view){
        String bus=buscador.getText().toString();

        if(bus.isEmpty()){
            Toast.makeText(MainActivity.this,"Ingrese un lugar de Preferencia", Toast.LENGTH_SHORT).show();
        }
    }

}
