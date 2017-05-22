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
public abstract class Sensor {
    protected String marca;
    protected String referencia;
    protected Date fechaInstalacion;

    public Sensor(String marca, String referencia, Date fechaInstalacion) {
        this.marca = marca;
        this.referencia = referencia;
        this.fechaInstalacion = fechaInstalacion;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getReferencia() {
        return referencia;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }

    public Date getFechaInstalacion() {
        return fechaInstalacion;
    }

    public void setFechaInstalacion(Date fechaInstalacion) {
        this.fechaInstalacion = fechaInstalacion;
    }
    
    
}
