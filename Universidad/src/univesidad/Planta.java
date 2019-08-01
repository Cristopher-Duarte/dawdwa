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
public class Planta extends Docentes {
    private String fechaContrato;
    private int cantProyectos;
    
    public Planta(String tipoDocumento, String Documento, String Apellido, 
           String Nombres, int edad, boolean activo, String profesion, 
           String asignatura, String fechaContrato, int cantProyectos) {
        super(tipoDocumento, Documento, Apellido, Nombres, edad, activo, profesion, asignatura);
        this.fechaContrato=fechaContrato;
        this.cantProyectos=cantProyectos;
    }
    
    public String mostrar(){
        String resultado;
        
        resultado=mostrarInfo()+"\n"+"Asignatura: "+asignatura+"\n"+"Profesion: "+ profesion+
                  "\n"+"Fecha de Contrato: "+fechaContrato+"\n"+"Cantidad de proyectos: "+cantProyectos ;
        
        return resultado;
    }    
}
