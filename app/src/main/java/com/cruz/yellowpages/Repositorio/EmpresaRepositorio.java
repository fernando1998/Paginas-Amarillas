package com.cruz.yellowpages.Repositorio;

import android.support.v7.widget.LinearLayoutCompat;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.cruz.yellowpages.Model.Empresa;
import com.cruz.yellowpages.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by FERNANDO on 28/09/2017.
 */

public class EmpresaRepositorio {

    private static EmpresaRepositorio _INSTANCE = null;

    public static EmpresaRepositorio getInstance(){
        if(_INSTANCE == null)
            _INSTANCE = new EmpresaRepositorio();
        return _INSTANCE;
    }

    private ArrayList<Empresa> empresas = new ArrayList<>();

    private EmpresaRepositorio() {

        addEmpresa(new Empresa(0, "comida", "KFC", "Calle San Jacinto 338,San Borja", "4452694", "kfc@gmail.com", "www.kfc.com",
                "Sabrosa comida chatarra ", R.drawable.img_kfc));

        addEmpresa(new Empresa(1, "comida", "Pizza Hut", "Av. Crisoles 265,Santa Beatriz", "4451288", "pizzahut@gmail.com", "www.pizzahut.com",
                "Las mejores pizzas y muy caras ;)", R.drawable.img_pizza_hut));

        addEmpresa(new Empresa(2, "comida", "BurgerKing", "Jr. Manantial 369,San Antonio", "6654281", "burgerking@gmail.com", "www.burgerking.com",
                "Las mejores hamburguesas de todo el reyno..", R.drawable.img_burger_king));

        addEmpresa(new Empresa(3, "bar", "Etnias Bar", "Av. Ferrero 666,La Molina", "3651238", "etniasbar@gmail.com", "www.etniasbar.com",
                "Lo mejor en variedad de licores ", R.drawable.img_etnias_bar));

        addEmpresa(new Empresa(4, "bar", "Piselli", "Jr Palacio 448,San Clemente", "3389281", "piselli@gmail.com", "www.piselli.com",
                "Lo mejor en pisco peruano, chilcanos de primera", R.drawable.img_piselli_bar));

        addEmpresa(new Empresa(5, "bar", "Hops", "Jr. Ayacucho 333,Pueblo Libre", "3585581", "hops@gmail.com", "www.hops.com",
                "Lo mejor en cerveza artesanal del perú", R.drawable.img_hops_pub));

        addEmpresa(new Empresa(6, "cines", "Cineplanet", "Calle Venezuela 268,San Miguel", "3354854", "cineplanet@gmail.com", "www.cineplanet.com",
                "Los mejores precios para tu pelicula favorita", R.drawable.img_cineplanet));

        addEmpresa(new Empresa(7, "cines", "CineMark", "Calle Lucifer 666,Surco", "3351255", "cinemark@gmail.com", "www.cinemark.com",
                "Las mejores estreno de todo el mundo", R.drawable.img_cinemark));

        addEmpresa(new Empresa(8, "cines", "Cinepolis", "Jr. Cuernabaca 334,Santa Maria", "6688254", "cinepolis@gmail.com", "www.cinepolis.com",
                "Todos los estrenos mundiales al mejor servicio", R.drawable.img_cinepolis));

        addEmpresa(new Empresa(9, "diversion", "Happyland", "Calle Florestales 445", "6688466", "happyland@gmail.com", "www.happyland.com",
                "Las mejores juegos mecanicos de todo lima, a tu alcance", R.drawable.img_happyland));

    }

    public ArrayList<Empresa> getEmpresas() {

        return empresas;
    }

    public void addEmpresa(Empresa empresa){

        this.empresas.add(empresa);
    }


}
