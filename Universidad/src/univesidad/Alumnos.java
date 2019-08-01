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
public class Alumnos extends personal{

    private String codigo, facultad, programa;
    private int semestre;
    
    public Alumnos(String tipoDocumento, String Documento, String Apellido,
                   String Nombres, int edad, boolean activo, String codigo,
                   String facultad, String programa, int semestre) {
        
        super(tipoDocumento, Documento, Apellido, Nombres, edad, activo);
        
        this.codigo=codigo;
        this.facultad=facultad;
        this.programa=programa;
        this.semestre =semestre;
        
    }

    public String mostrar(){
        String resultado;
        
        resultado=mostrarInfo()+"\n"+"Programa: "+ programa+ "\n"+"Codigo: "+codigo+"\n"+
                  "Facultadad: "+ facultad+"\n"+ "Semestre: "+semestre;
        
        return resultado;
    }
    
    public void setCodigo(String codigo){
        this.codigo=codigo;     
    }
    
    public void setFacultad(String facultad){
        this.facultad=facultad;
        
    }
    
    public void setPrograma(String programa){
        this.programa=programa;   
    }
    
    public void setSemestre(int semestre){
        this.semestre=semestre;
    }
    
    
}
