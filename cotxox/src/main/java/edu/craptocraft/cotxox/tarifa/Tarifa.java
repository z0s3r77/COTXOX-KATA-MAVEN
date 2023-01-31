package edu.craptocraft.cotxox.tarifa;

import edu.craptocraft.cotxox.carrera.Carrera;

public class Tarifa {
    public double COSTE_MILLA = 1.35;
    public double COSTE_MINUTO = 0.35;
    public double COSTE_MINIMO = 5;
    public byte PORCENTAJE_COMISION = (byte) 0.20;

    public Tarifa(){}

    public double getCosteDistancia(double distancia){
        double costeDistancia =  distancia * this.COSTE_MILLA;
        return costeDistancia;
    }

    public double getCosteTiempo(int tiempoCarrera){
        double costeTiempo = tiempoCarrera * this.COSTE_MINUTO;
        return costeTiempo;
    }

    public double getCosteTotalEsperado(Carrera carrera){


        double getCosteTotalEsperado = (getCosteDistancia(carrera.getDistancia())) + (getCosteTiempo(carrera.getTiempoEsperado())) ;
        
        if (getCosteTotalEsperado < 5) {
            getCosteTotalEsperado = 5;
        }
        
        return getCosteTotalEsperado;

    }

}
