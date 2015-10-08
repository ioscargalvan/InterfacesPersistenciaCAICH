/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PaqueteDatosInterfacePersistencia;

import Clases.Cita;
import Clases.Paciente;
import PersistenciaExceptions.PersistenciaException;
import java.util.List;

/**
 * Clase que establece el comportamiento de las clases de Persistencia que 
 * quieran cumplir con las medidas de Persistencia.
 * @author Oscar Galván
 */
public interface IPersistencia {
    
    public boolean agendar(Cita cita) throws PersistenciaException;
    
    public boolean eliminar(Cita cita) throws PersistenciaException;
    
    public Cita buscar(Cita cita) throws PersistenciaException;
    
    public boolean actualizar(Cita cita) throws PersistenciaException;
    
    public boolean cancelar(Cita cita) throws PersistenciaException;
    
    public boolean activar(Cita cita) throws PersistenciaException;
    
    public boolean registrar(Cita cita) throws PersistenciaException;
    
    public List<Cita> recuperarCitas() throws PersistenciaException;
    
    public List<Cita> recuperarCitasActivas() throws PersistenciaException;
    
    public List<Cita> recuperarCitasCanceladas() throws PersistenciaException;
    
    public List<Cita> recuperarCitasPorPaciente(Paciente paciente) throws PersistenciaException;
    
    
}
