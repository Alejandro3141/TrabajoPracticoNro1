package ar.org.centro8.curso.java.interfaces;
import ar.org.centro8.curso.java.entities.Vehiculo;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public interface I_VehiculoRepository {
   void load ();
   List<Vehiculo> getList();
   
   default Vehiculo max() {
       return getList()
               .stream()
               .max(Comparator.comparingDouble(Vehiculo::getPrecio))
               .get();
   }
   
   default Vehiculo min() {
       return getList()
               .stream()
               .min(Comparator.comparingDouble(Vehiculo::getPrecio))
               .get();
   }
   default List<Vehiculo> contains(String caracter) {
       if (caracter == null) return new ArrayList();
       return getList()
               .stream()
               .filter(v -> v.getModelo().toLowerCase().contains(caracter.toLowerCase()))
               .collect(Collectors.toList());
   }
   
   default List<Vehiculo> order() {
       return getList()
               .stream()
               .sorted(Comparator.comparingDouble(Vehiculo::getPrecio).reversed())
               .collect(Collectors.toList());
   }
}