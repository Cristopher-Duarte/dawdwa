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
public class catedratico extends Docentes {
    
    private String fechaInicio, fechaFin;
    
    public catedratico(String tipoDocumento, String Documento, 
           String Apellido, String Nombres, int edad, boolean activo, 
           String profesion, String asignatura, String fechaInicio, String fechaFin){
        
        super(tipoDocumento, Documento, Apellido, Nombres, edad, activo, profesion, asignatura);
        this.fechaInicio=fechaInicio;
        this.fechaFin=fechaFin;
        
        
    }
    
    public String mostrar(){
        String resultado;
        
        resultado=mostrarInfo()+"\n"+"Asignatura: "+asignatura+"\n"+"Profesion: "+ profesion+
                  "\n"+"Fecha de Inicio: "+fechaInicio+"\n"+"Fecha Final: "+fechaFin ;
        
        return resultado;
    }
    
}
