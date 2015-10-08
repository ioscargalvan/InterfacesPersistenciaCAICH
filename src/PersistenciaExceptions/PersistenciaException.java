/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PersistenciaExceptions;

/**
 * Clase que modela el comportamiento de una PersistenciaException.
 * @author Oscar
 */
public class PersistenciaException extends Exception {
    
    /**
     * Constructor de la clase que envía a la clase padre el mensaje de error.
     * @param mensajeError Mensaje de error.
     */
    public PersistenciaException(String mensajeError) { 
        super(mensajeError);
    }
}
