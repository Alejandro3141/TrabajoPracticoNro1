package ar.org.centro8.curso.java.entities;
import java.text.DecimalFormat;

public abstract class Vehiculo {
    private final String marca;
    private final String modelo;
    private float precio;

    public Vehiculo(String marca, String modelo, float precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
    }
    
    @Override
    public abstract String toString();

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }
    
    public String getDecimalFormat () {
        return new DecimalFormat("##,##0.00").format(this.getPrecio());
    }
}