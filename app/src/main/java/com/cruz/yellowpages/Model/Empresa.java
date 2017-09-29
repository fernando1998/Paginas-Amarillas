package com.cruz.yellowpages.Model;

/**
 * Created by FERNANDO on 28/09/2017.
 */

public class Empresa {

    private int id;
    private String rubro;
    private String nombre;
    private String direccion;
    private String telefono;
    private String correo;
    private String url;
    private String infor;
    private int img;

    public Empresa(){

    }

    public Empresa(String nombre, String direccion, String telefono, int img) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.img = img;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRubro() {
        return rubro;
    }

    public void setRubro(String rubro) {
        this.rubro = rubro;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getInfor() {
        return infor;
    }

    public void setInfor(String infor) {
        this.infor = infor;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }

    public Empresa(int id, String rubro, String nombre, String direccion, String telefono, String correo, String url, String infor, int img) {
        this.id = id;
        this.rubro = rubro;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.correo = correo;
        this.url = url;
        this.infor = infor;
        this.img = img;
    }

    @Override
    public String toString() {
        return "Empresa{" +
                "id=" + id +
                ", rubro='" + rubro + '\'' +
                ", nombre='" + nombre + '\'' +
                ", direccion='" + direccion + '\'' +
                ", telefono='" + telefono + '\'' +
                ", correo='" + correo + '\'' +
                ", url='" + url + '\'' +
                ", infor='" + infor + '\'' +
                ", img=" + img +
                '}';
    }

}
