/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcial;

import Excepciones.SensoresException;
import java.util.Date;

/**
 *
 * @author Estudiante
 */
public class EstacionMeteor {
    private String nombre;
    private int estacion;
    private String ubicacion;
    private Date fechaDeInstalacion;
    private Sensor[] sensores;

    public EstacionMeteor(String nombre, int estacion, String ubicacion, Date fechaDeInstalacion, Sensor[] sensores)
    throws SensoresException{
        this.nombre = nombre;
        this.estacion = estacion;
        this.ubicacion = ubicacion;
        this.fechaDeInstalacion = fechaDeInstalacion;
        if(sensores.length!=3){
        throw new SensoresException();
        }    
        this.sensores = sensores;
    
    }
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEstacion() {
        return estacion;
    }

    public void setEstacion(int estacion) {
        this.estacion = estacion;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public Date getFechaDeInstalacion() {
        return fechaDeInstalacion;
    }

    public void setFechaDeInstalacion(Date fechaDeInstalacion) {
        this.fechaDeInstalacion = fechaDeInstalacion;
    }
    
    public void promedioPorSensor(){
        SensorAgua[] sa= new SensorAgua[sensores.length];
        SensorTemp[] k= new SensorTemp[sensores.length];
        SensorCargaElectrica[] sc= new SensorCargaElectrica[sensores.length];
        double promedioagua=0;
        double promediocarga=0;
        double promediotemper=0;
        for (int i=0; i<sensores.length; i++) {

            
            if(sensores[i] instanceof SensorAgua){
                for (int j = 0; j < sa.length; j++) {
                sa [j]= (SensorAgua)sensores[i];
                promedioagua+= sa[j].getCantAguaLLuvia();    
                }
            }else if(sensores[i] instanceof SensorTemp){
                for (int j = 0; j < k.length; j++) {
                k[j]= (SensorTemp)sensores[i];
                promediotemper+= k[j].getTemperaturaGrados();
                }
            }else if(sensores[i] instanceof SensorCargaElectrica){
                for (int j=0; j < sc.length; j++) {
                sc[j]= (SensorCargaElectrica)sensores[i];
                promediocarga+= sc[j].getNivel();
                }
            }
            
            
        }
            promedioagua= promedioagua/sa.length;
            promediocarga= promediocarga/sc.length;
            promediotemper= promediotemper/k.length;
    }
   
}
