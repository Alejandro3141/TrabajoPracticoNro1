package ar.org.centro8.curso.java.test;
import ar.org.centro8.curso.java.interfaces.I_VehiculoRepository;
import ar.org.centro8.java.curso.repositories.VehiculoRepository;

public class Concesionaria {
    public static void main(String[] args) {
        I_VehiculoRepository vr = new VehiculoRepository();
        vr.load();
        vr.getList().forEach(System.out::println);
        System.out.println("=============================");
        System.out.println("Vehiculo más caro: "
                + vr.max().getMarca() + " " + vr.max().getModelo());
        // Si hubiese más de uno:
//        System.out.print("Vehículo más caro: ");
//        vr
//                .getList()
//                .stream()
//                .filter(v -> v.getPrecio() == vr.max().getPrecio())
//                .forEach(x -> System.out.println(x.getMarca() + " " + x.getModelo()));
        System.out.println("Vehiculo más barato: "
                + vr.min().getMarca() + " " + vr.min().getModelo());
        // Si hubiese más de uno:
//        System.out.print("Vehículo más barato: ");
//        vr
//                .getList()
//                .stream()
//                .filter(v -> v.getPrecio() == vr.min().getPrecio())
//                .forEach(x -> System.out.println(x.getMarca() + " " + x.getModelo()));
        System.out.print("Vehiculo que contiene en el modelo la letra 'Y': ");
            vr.contains("y").forEach(x->System.out.println(x.getMarca() + " " 
                    + x.getModelo() + " " + "$" + x.getDecimalFormat()));
        System.out.println("=============================");
        System.out.println("Vehículos ordenados por precio de mayor a menor: ");
        vr.order().forEach(x->System.out.println(x.getMarca() + " " + x.getModelo()));
    }
}