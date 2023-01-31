package edu.craptocraft.cotxox.carrera;

import edu.craptocraft.cotxox.conductores.Conductor;
import edu.craptocraft.cotxox.conductores.PoolConductores;
import edu.craptocraft.cotxox.tarifa.Tarifa;

public class Carrera  {
    
    private String tarjetaCredito;
    private String origen;
    private String destino;
    private double distancia;
    private int  tiempoEsperado;
    private int tiempoCarrera;
    private double costeTotal;
    private int propina;
    public Conductor conductor;

    public Carrera(String tarjetaCredito){
        this.tarjetaCredito = tarjetaCredito;
    }


    public String getTarjetaCredito(){
        return this.tarjetaCredito;
    }

    public void setOrigen(String origen){
        this.origen = origen;
    }

    public String getOrigen(){
        return this.origen;
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

        // Nos montamos una instancia de tarifa
        Tarifa taria = new Tarifa();
        return taria.getCosteTotalEsperado(this);
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


    public void asignarConductor(PoolConductores poolConductores){
        for (Conductor conductor : poolConductores.getPoolConductores()) {
            // Tomamos un conductor que esté libre, lo asignamos a la carrera y lo ponemos ocupado
            if (conductor.isOcupado() == false) {
                this.setConductor(conductor);
                this.conductor.setOcupado(true);
                break;
            }
            
        }

    }

    public void realizarPago(double pago){
        this.costeTotal = pago;
    }

    public void recibirPropina(int propina){
        this.propina = propina;
    }

    public int getPropina() {
        return propina;
    }

    public double getCosteTotal() {
        return costeTotal;
    }

    public void liberarConductor(){
        this.conductor.setOcupado(false);
    }
}
