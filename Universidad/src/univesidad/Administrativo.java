package univesidad;

public class Administrativo extends personal{
    private String cargo, fechaContrato;

    public Administrativo(String tipoDocumento, String Documento, 
           String Apellido, String Nombres, int edad, boolean activo,
           String cargo, String fechaContrato){
                
        super(tipoDocumento, Documento, Apellido, Nombres, edad, activo);
        this.cargo=cargo;
        this.fechaContrato=fechaContrato;
    }
    
    public String mostrar(){
        String resultado;
        resultado=mostrarInfo()+"\n"+"Cargo: "+cargo+"\n"+"Fecha de Contrato: "+fechaContrato;
        return resultado;
                
    }
    
    public void setCargo(String cargo){
        this.cargo=cargo;
    }
    

    

   
    
}
