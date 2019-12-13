package ar.org.centro8.java.curso.repositories;
import ar.org.centro8.curso.java.entities.Auto;
import ar.org.centro8.curso.java.entities.Moto;
import ar.org.centro8.curso.java.entities.Vehiculo;
import ar.org.centro8.curso.java.interfaces.I_VehiculoRepository;
import java.util.ArrayList;
import java.util.List;

public class VehiculoRepository implements I_VehiculoRepository{
    private List<Vehiculo> list;

    public VehiculoRepository() {
        list = new ArrayList();
    }
    
    @Override
    public void load(){
        list.add(new Auto (4, "Peugeot", "206", 200000));
        list.add(new Moto("125c", "Honda", "Titan", 60000));
        list.add(new Auto (5, "Peugeot", "208", 250000));
        list.add(new Moto ("160c", "Yamaha", "YBR", 80500.50f));
    }
    
    @Override
    public List<Vehiculo>getList(){
        return list;
    }    
}
