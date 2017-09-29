package com.cruz.yellowpages.Activities;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.cruz.yellowpages.Model.Empresa;
import com.cruz.yellowpages.R;
import com.cruz.yellowpages.Repositorio.EmpresaRepositorio;

import java.util.ArrayList;

/**
 * Created by FERNANDO on 29/09/2017.
 */

class AdaptadorEmpresas extends RecyclerView.Adapter<AdaptadorEmpresas.ViewHolderEmpresa> {

            ArrayList<Empresa> listaEmpresas;
    public AdaptadorEmpresas(ArrayList<Empresa> listaEmpresas) {
        this.listaEmpresas = listaEmpresas;
    }

    @Override
    public ViewHolderEmpresa onCreateViewHolder(ViewGroup parent, int viewType) {

        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.card_item, parent, false);
        return new ViewHolderEmpresa(view);



    }
    @Override
    public void onBindViewHolder(ViewHolderEmpresa holder, int position) {
        holder.img_imagen.setImageResource(listaEmpresas.get(position).getImg());
        holder.txtTitulo.setText(listaEmpresas.get(position).getNombre());
        holder.txtDireccion.setText(listaEmpresas.get(position).getDireccion());
        holder.txtTelefono.setText(listaEmpresas.get(position).getTelefono());

        //EventoOnclick-Prueba
        holder.setOnClickListeners();
    }

    @Override
    public int getItemCount() {
        return listaEmpresas.size();
    }

    ///////////////////////////////////////////////////////////////////////////////////////

    static class ViewHolderEmpresa extends RecyclerView.ViewHolder implements View.OnClickListener{
        Button btn_detalle;
        TextView txtTitulo, txtDireccion,txtTelefono;
        ImageView img_imagen;
        Context context;
       // ArrayList<Empresa> listaEmpresas;

        public ViewHolderEmpresa(View itemView) {

            super(itemView);
            context=itemView.getContext();
            btn_detalle=(Button)itemView.findViewById(R.id.btn_detalle);
            txtTitulo=(TextView)itemView.findViewById(R.id.titulo_card);
            txtDireccion=(TextView)itemView.findViewById(R.id.direcion_card);
            txtTelefono=(TextView)itemView.findViewById(R.id.telefono_card);
            img_imagen=(ImageView)itemView.findViewById(R.id.imagen_card);

            //listaEmpresas=datos;

           // btn_detalle.setOnClickListener(this);

        }
        void setOnClickListeners(){
            btn_detalle.setOnClickListener(this);
        }

        @Override
        public void onClick(View view) {
            int position=getAdapterPosition();
           // Empresa obj=listaEmpresas.get(position);
            switch (view.getId()){
                case R.id.btn_detalle:


                   // Toast.makeText(context, "Prueba: " + position+"con:"+ context, Toast.LENGTH_SHORT).show();
                  //  Intent intent = new Intent(context,DetalleActivity.class);
                //    context.startActivity(intent);


                    String nombre,rubro,direccion,telefono,correo,url,info;
                    int imgId;

                    EmpresaRepositorio empresaRepository = EmpresaRepositorio.getInstance();
                    ArrayList<Empresa> empresas = empresaRepository.getEmpresas();

                    for (Empresa empresa : empresas){
                        if(position== empresa.getId() ){
                            Intent i = new Intent(context, DetalleActivity.class);

                            nombre = empresa.getNombre();
                            i.putExtra("nombre", nombre);
                            rubro = empresa.getRubro();
                            i.putExtra("rubro", rubro);
                            direccion = empresa.getDireccion();
                            i.putExtra("direccion", direccion);
                            telefono = empresa.getTelefono();
                            i.putExtra("telefono", telefono);
                            correo = empresa.getCorreo();
                            i.putExtra("correo", correo);
                            url = empresa.getUrl();
                            i.putExtra("url", url);
                            info = empresa.getInfor();
                            i.putExtra("info",info);
                            imgId = empresa.getImg();
                            i.putExtra("imgId",imgId);
                            context.startActivity(i);
                            break;
                        }
                    }

                        break;
            }
        }
    }

}
