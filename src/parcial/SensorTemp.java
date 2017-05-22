/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcial;

import java.util.Date;

/**
 *
 * @author Estudiante
 */
public class SensorTemp extends Sensor{
    private int temperaturaGrados;

    public SensorTemp(String marca, String referencia, Date fechaInstalacion, int temperaturaGrados) {
        super(marca, referencia, fechaInstalacion);
        this.temperaturaGrados = temperaturaGrados;
    }

    public int getTemperaturaGrados() {
        return temperaturaGrados;
    }

    public void setTemperaturaGrados(int temperaturaGrados) {
        this.temperaturaGrados = temperaturaGrados;
    }
    
    
    
}
