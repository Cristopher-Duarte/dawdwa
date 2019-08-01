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
public class personal {
    protected String tipoDocumento, Documento, Apellido, Nombres;
    protected int edad;
    protected boolean activo;
    
    public personal(String tipoDocumento, String Documento, String Apellido, String Nombres, int edad, boolean activo){
        this.tipoDocumento=tipoDocumento;
        this.Documento=Documento;
        this.Apellido=Apellido;
        this.Nombres=Nombres;
        this.edad=edad;
        this.activo=activo;              
    }
    
    public String mostrarInfo(){
        String resultado; 
        String estado;
        if (this.activo){
            estado="Activo";
        }
        else{
            estado="Inactivo";
        }
        
        resultado="Tipo de Documento: "+tipoDocumento+" \n"+
                  "Documento: "+Documento+"\n"+"Nombres: "+Nombres+"\n"+
                  "Apellidos: "+Apellido+"\n"+"Edad: "+ Integer.toString(edad)+"\n"+
                  "Estado: "+estado;
        
        return resultado;
                
    }
    
    public void setEdad(int edad){
        this.edad=edad;
        
    }
    
    public void setActivo(boolean activo){
        this.activo=activo;
    }
    
}
