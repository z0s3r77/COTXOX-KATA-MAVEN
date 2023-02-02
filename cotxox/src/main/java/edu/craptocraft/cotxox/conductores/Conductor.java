package edu.craptocraft.cotxox.conductores;

import java.util.ArrayList;
import java.util.OptionalDouble;

public class Conductor {
    private String nombre;
    private String modelo;
    private String matricula;
    private double valoracionMedia;
    private boolean ocupado = true;
    private ArrayList<Byte> valoraciones = new ArrayList<Byte>();

    public Conductor(){}

    public Conductor(String nombre){
        this.nombre = nombre;
    }

    public String getNombre() {
        return this.nombre;
    }

    public String getModelo() {
        return this.modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMatricula() {
        return this.matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public double getValoracion() {

        this.valoracionMedia = this.calcularValoracionMedia();
        return this.valoracionMedia;
    }

    // public int getNumeroValoraciones(){
    //     return this.valoraciones.size();
    // }

    public void setValoracion(Byte valoracion) {
        this.valoraciones.add(valoracion);
    }

    private double calcularValoracionMedia(){
        OptionalDouble valoracionMedias = this.valoraciones.stream()
                                                .mapToDouble( valoracion -> valoracion)
                                                .average();

        return valoracionMedias.isPresent() ? valoracionMedias.getAsDouble() : 0;
    }

    public void setOcupado(boolean estado){
        this.ocupado = estado;
    }

    public boolean isOcupado(){
        return this.ocupado;
    }
}
