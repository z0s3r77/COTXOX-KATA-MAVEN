package edu.craptocraft.cotxox.tarifa;

import edu.craptocraft.cotxox.carrera.Carrera;

public class Tarifa {

    private final double COSTE_MILLA = 1.35;
    private final double COSTE_MINUTO = 0.35;
    private final double COSTE_MINIMO = 5;
    private final byte PORCENTAJE_COMISION = (byte) 0.20;


    public double getCosteDistancia(double distancia ){
        return distancia * this.COSTE_MILLA;
    }

    public double getCosteTiempo(int minutos ){
        return minutos * this.COSTE_MINUTO;
    }

    public double getCosteTotalEsperado(Carrera carrera){
        
        if (getCosteDistancia(carrera.getDistancia()) + getCosteTiempo(carrera.getTiempoEsperado()) < this.COSTE_MINIMO) {
            return this.COSTE_MINIMO;
        } else {
            return getCosteDistancia(carrera.getDistancia()) + getCosteTiempo(carrera.getTiempoEsperado());
        }

    }
}
