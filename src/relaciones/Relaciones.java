package relaciones;

import java.util.ArrayList;
import java.util.List;

public class Relaciones {
    public static void main(String[] args) {
        Auto auto = new Auto();
        auto.setId(1L);
        auto.setMarca("Renault");
        auto.setModelo("Duster");

        List<Propietario> listaPropietatios = new ArrayList<Propietario>();

        Propietario propietario1 = new Propietario();
        Propietario propietario2 = new Propietario();

        propietario1.setId(35L);
        propietario1.setNombre("Luisina");
        propietario1.setApellido("de Paula");

        propietario2.setId(33L);
        propietario2.setNombre("Ernesto");
        propietario2.setApellido("Jacros");

        listaPropietatios.add(propietario1);
        listaPropietatios.add(propietario2);
        auto.setListaPropieatrios(listaPropietatios);


        System.out.println("El auto: " + auto.getMarca() + " " + auto.getModelo()+
                " Tiene como propietarios a: " + auto.getListaPropieatrios());
    }
}
