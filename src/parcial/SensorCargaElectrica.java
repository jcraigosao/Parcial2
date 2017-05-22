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
public class SensorCargaElectrica extends Sensor{
    private int nivel;
    

    public SensorCargaElectrica(String marca, String referencia, Date fechaInstalacion, int nivel) {
        super(marca, referencia, fechaInstalacion);
        this.nivel = nivel;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

     public String nivelesElectricos(){
         String a= "";
        switch(nivel){
            case 1:
                a= "1. Tormenta electrica";
                break;
            case 2:
                a= "2. Rayos";
                break;
            case 3:
                a= "3. Truenos";
                break;
            case 4:
                a= "4. Normal";
                break;
            default:
                    break;
        }
        return a;
    }

    
     
     
}

