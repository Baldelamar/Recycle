package models;

import android.graphics.Color;

public class Tortuga {

    private String Nombre;

    private String Descripcion;

    private String Arma;

    private int color;

    public Tortuga(String nombre, String descripcion, String arma, int color) {
        Nombre = nombre;
        Descripcion = descripcion;
        Arma = arma;
        this.color = color;
    }

    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
    }

    public String getArma() {
        return Arma;
    }

    public void setArma(String arma) {
        Arma = arma;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String descripcion) {
        Descripcion = descripcion;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }


}
