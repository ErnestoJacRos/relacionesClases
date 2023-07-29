package relaciones;

import java.util.List;

public class Auto {
    private Long id;
    private String marca;
    private String modelo;

    private List<Propietario> listaPropieatrios;


    public Auto() {
    }

    public Auto(Long id, String marca, String modelo, List<Propietario> listaPropieatrios) {
        this.id = id;
        this.marca = marca;
        this.modelo = modelo;
        this.listaPropieatrios = listaPropieatrios;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public List<Propietario> getListaPropieatrios() {
        return listaPropieatrios;
    }

    public void setListaPropieatrios(List<Propietario> listaPropieatrios) {
        this.listaPropieatrios = listaPropieatrios;
    }

    @Override
    public String toString() {
        return "Auto{" +
                "id=" + id +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", listaPropieatrios=" + listaPropieatrios +
                '}';
    }
}

