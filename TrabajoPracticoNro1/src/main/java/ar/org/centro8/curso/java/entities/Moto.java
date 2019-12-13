package ar.org.centro8.curso.java.entities;
public class Moto extends Vehiculo {
    private String cilindrada;

    public Moto(String cilindrada, String marca, String modelo, float precio) {
        super(marca, modelo, precio);
        this.cilindrada = cilindrada;
    }

    public String getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(String cilindrada) {
        this.cilindrada = cilindrada;
    }
    
    @Override
    public String toString() {
                return "Marca: " + this.getMarca() 
                + " // " + "Modelo: " + this.getModelo()
                + " // " + "Cilindrada: " + this.getCilindrada()
                + " // " + "Precio: " + "$"+ this.getDecimalFormat();
    }  
}