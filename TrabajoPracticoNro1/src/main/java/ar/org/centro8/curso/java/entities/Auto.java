package ar.org.centro8.curso.java.entities;
public class Auto extends Vehiculo {
    private final int puertas;

    public Auto(int puertas, String marca, String modelo, float precio) {
        super(marca, modelo, precio);
        this.puertas = puertas;
    }
    
    @Override
    public String toString() {
        return "Marca: " + this.getMarca() + " // " + "Modelo: " + this.getModelo()
                + " // " + "Puertas: " + this.getPuertas()
                + " // " + "Precio: " + "$"+ this.getDecimalFormat();
    } 

    public int getPuertas() {
        return puertas;
    }
}