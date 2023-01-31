package edu.craptocraft.cotxox.conductores;

import java.util.ArrayList;

public class Conductor {
    private String nombre;
    private String modelo;
    private String matricula;
    private double valoracionMedia;
    private boolean ocupado;
    private ArrayList<Byte> valoraciones = new ArrayList<Byte>();

    public Conductor(){}

    public Conductor(String nombre){
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }


    public void setOcupado(boolean estado){
        this.ocupado = estado;
    }

    public boolean isOcupado(){
        return this.ocupado;
    }






    public double getValoracion() {
        return valoracionMedia;
    }



    public int getNumeroValoraciones(){
        return this.valoraciones.size();
    }

    public void setValoracion(byte valoracion){
        this.valoraciones.add((byte) valoracion);

        byte sum = (byte) 0.0;

        for (byte valoraciones : this.valoraciones) {
            sum += valoraciones;
        }
        
        float div = (float)sum / getNumeroValoraciones();


        this.valoracionMedia = div;

    }






}
