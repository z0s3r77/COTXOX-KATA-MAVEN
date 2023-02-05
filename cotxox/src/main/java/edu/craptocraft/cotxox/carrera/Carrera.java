package edu.craptocraft.cotxox.carrera;

import edu.craptocraft.cotxox.conductores.Conductor;
import edu.craptocraft.cotxox.conductores.PoolConductores;
import edu.craptocraft.cotxox.tarifa.Tarifa;

public class Carrera {
    
    private String tarjetaCredito;
    private String origen;
    private String destino;
    private double distancia;
    private int tiempoEsperado;
    private int tiempoCarrera;
    private double costeTotal;
    private int propina;
    private Conductor conductor;

    public Carrera(String tarjetaCredito){
        this.tarjetaCredito = tarjetaCredito;
    }

    public String getTarjetaCredito() {
        return tarjetaCredito;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getOrigen() {
        return origen;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public String getDestino() {
        return destino;
    }

    public void setDistancia(double distancia) {
        this.distancia = distancia;
    }

    public double getDistancia() {
        return distancia;
    }


    public double getCosteEsperado(){

        Tarifa tarifa = new Tarifa();
        return tarifa.getCosteTotalEsperado(this);
    }


    public int getTiempoEsperado() {
        return tiempoEsperado;
    }

    public void setTiempoEsperado(int tiempoEsperado) {
        this.tiempoEsperado = tiempoEsperado;
    }

    public int getTiempoCarrera() {
        return tiempoCarrera;
    }

    public void setTiempoCarrera(int tiempoCarrera) {
        this.tiempoCarrera = tiempoCarrera;
    }

    public void setConductor(Conductor conductor) {
        this.conductor = conductor;
    }

    public Conductor getConductor() {
        return conductor;
    }


    public void asignarConductor(PoolConductores conductores){
        
        Conductor conductorLibre = conductores.getPoolConductores().stream()
                                                                .filter(conductors -> conductors.isOcupado())
                                                                .findFirst()
                                                                .orElse(null);
        
        this.conductor = conductorLibre;
    }


    public void realizarPago(double pago){
        this.costeTotal = pago;
    }

    public double getCosteTotal() {
        return costeTotal;
    }

    public void recibirPropina(int propina){
        this.propina = propina;
    }

    public int getPropina() {
        return propina;
    }

    public void liberarConductor(){
        this.conductor.setOcupado(false);
    }

}
