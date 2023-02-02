package edu.craptocraft.cotxox.conductores;

import java.util.ArrayList;
import java.util.List;

public class PoolConductores {
    
    List<Conductor> conductores = new ArrayList<Conductor>();

    public PoolConductores(List<Conductor> conductores){
        this.conductores = conductores;
    }

    public List<Conductor> getPoolConductores() {
        return conductores;
    }

}
