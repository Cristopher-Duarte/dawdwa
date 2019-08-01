
package univesidad;

import java.util.ArrayList;
import java.util.Scanner;
public class Univesidad {

    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String tipoDocumento,Documento, Apellido,Nombres,codigo,facultad,programa;
         int edad,semestre;
         boolean activo=true;
   
    ArrayList <Alumnos> AlumnosMod = new ArrayList();
    int operacion,op2;
    boolean desicion=true;
    while(desicion){
        System.out.println("Seleccione");
        System.out.println("1.Agregar");
        System.out.println("2.Modificar");
        System.out.println("3.Mostrar");
        System.out.println("4.Salir");
        operacion=leer.nextInt();
            switch(operacion){
                case 1:
                    System.out.println("Ingrese el tipo de documento");
                    tipoDocumento=leer.next();
                    System.out.println("");
                    System.out.println("Ingrese el Documento");
                    Documento=leer.next();
                    System.out.println("");
                    System.out.println("Ingrese el Nombre");
                    Nombres=leer.next();
                    System.out.println("");
                    System.out.println("Ingrese el Apellido");
                    Apellido=leer.next();
                    System.out.println("");
                    System.out.println("Ingrese el codigo");
                    codigo=leer.next();
                    System.out.println("");
                    System.out.println("Ingrese la edad");
                    edad=leer.nextInt();
                    System.out.println("");
                    System.out.println("Ingrese la facultad");
                    facultad=leer.next();
                    System.out.println("");
                    System.out.println("Ingrese el programa");
                    programa=leer.next();
                    System.out.println("");
                    System.out.println("Ingrese semestre");
                    semestre=leer.nextInt();
                    System.out.println("");
                    AlumnosMod.add(new Alumnos(tipoDocumento, Documento, Apellido, Nombres, edad, activo, codigo, facultad, programa, semestre));
    
                    
                    break;
                case 2:
                    System.out.println("");
                    System.out.println("Seleccione el id del estudiante");
                    op2=leer.nextInt();
                    System.out.println("");
                    System.out.println("1.Codigo");
                    System.out.println("");
                    System.out.println("2.Facultad");
                    System.out.println("");
                    System.out.println("3.Programa");
                    System.out.println("");
                    System.out.println("4.Semestre");
                    System.out.println("");
                    operacion=leer.nextInt();
                    
                    switch(operacion){
                        case 1:
                            System.out.println("");
                            String codigos;
                            System.out.println("Ingrese el nuevo codigo");
                            codigos=leer.next();
                            System.out.println("");
                            AlumnosMod.get(op2).setCodigo(codigos);
                            System.out.println("Cambiado con exito!!!!");
                            break;
                        case 2:
                            System.out.println("");
                            String fact;
                            System.out.println("Ingrese la nueva Facultad");
                            fact=leer.next();
                            System.out.println("");
                            AlumnosMod.get(op2).setFacultad(fact);
                            System.out.println("Cambiado con exito!!!!");
                            break;
                        case 3:
                            System.out.println("");
                            String program;
                            System.out.println("Ingrese el nuevo Programa");
                            program=leer.next();
                            System.out.println("");
                            AlumnosMod.get(op2).setPrograma(program);
                            System.out.println("Cambiado con exito!!!!");
                            break;
                        case 4:
                            System.out.println("");
                            int semestr;
                            System.out.println("Ingrese el nuevo Semestre");
                            semestr=leer.nextInt();
                            AlumnosMod.get(op2).setSemestre(semestr);
                            System.out.println("Cambiado con exito!!!!");
                            break;
                                    
                            
                    } 
                    
                    break;
                case 3:
                    System.out.println("");
                    for(int x=0;x<AlumnosMod.size();x++){
                        System.out.println(x+"\n"+AlumnosMod.get(x).mostrar());
                    
                    } 
                    break;
                case 4:
                    System.out.println("");
                    System.out.println("Adios");
                    desicion=false;
                    break;
            
                
            }
    
    }

        
        
    }
    
}
