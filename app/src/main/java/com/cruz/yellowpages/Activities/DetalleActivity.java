package com.cruz.yellowpages.Activities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

import com.cruz.yellowpages.R;

/**
 * Created by FERNANDO on 29/09/2017.
 */

public class DetalleActivity extends AppCompatActivity {
    private TextView txtNombre,txtRubro,txtDireccion,txtTelefono, txtCorreo, txtInfo;

    private ImageView imgEmpresa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalle);

        txtNombre = (TextView)findViewById(R.id.detalle_titulo);
        txtRubro = (TextView)findViewById(R.id.detalle_rubro);
        txtDireccion = (TextView)findViewById(R.id.detalle_direccion);
        txtTelefono = (TextView)findViewById(R.id.detalle_telefono);
        txtCorreo = (TextView)findViewById(R.id.detalle_correo);
        txtInfo = (TextView)findViewById(R.id.detalle_info);
        imgEmpresa = (ImageView)findViewById(R.id.detalle_img);

        //Recepcion de datos

        String nombre = this.getIntent().getExtras().getString("nombre");
        String rubro = this.getIntent().getExtras().getString("rubro");
        String direccion = this.getIntent().getExtras().getString("direccion");
        String telefono = this.getIntent().getExtras().getString("telefono");
        String correo = this.getIntent().getExtras().getString("correo");
        String url = this.getIntent().getExtras().getString("url");
        String info = this.getIntent().getExtras().getString("info");
        int imgId = this.getIntent().getExtras().getInt("imgId");

        txtNombre.setText(nombre);
        txtRubro.setText(rubro);
        txtDireccion.setText(direccion);
        txtTelefono.setText(telefono);
        txtCorreo.setText(correo);
        txtInfo.setText(info);
        imgEmpresa.setImageResource(imgId);



    }

}
