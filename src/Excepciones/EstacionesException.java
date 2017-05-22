/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Excepciones;

/**
 *
 * @author Estudiante
 */
public class EstacionesException extends Exception{

    public EstacionesException() {
        super("Deben ser mas de 3 estaciones");
    }
    
}
