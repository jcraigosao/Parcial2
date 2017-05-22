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
public class SensorAgua extends Sensor {
    
    private int cantAguaLLuvia;

    public SensorAgua(String marca, String referencia, Date fechaInstalacion, int cantAguaLLuvia) {
        super(marca, referencia, fechaInstalacion);
        this.cantAguaLLuvia = cantAguaLLuvia;
    }

    public int getCantAguaLLuvia() {
        return cantAguaLLuvia;
    }

    public void setCantAguaLLuvia(int cantAguaLLuvia) {
        this.cantAguaLLuvia = cantAguaLLuvia;
    }
    
    
    
    
}
