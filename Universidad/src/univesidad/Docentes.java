/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package univesidad;

/**
 *
 * @author CBN
 */
public class Docentes extends personal{
    
    
    protected String profesion, asignatura;
    public Docentes(String tipoDocumento, String Documento, 
           String Apellido, String Nombres, int edad, boolean activo, String profesion, String asignatura){
                
        super(tipoDocumento, Documento, Apellido, Nombres, edad, activo);
        this.profesion=profesion;
        this.asignatura=asignatura;
    }
    
    public void setAsignatura(String asignatura){
        this.asignatura=asignatura;
    }
    
    
    
        
    
}
