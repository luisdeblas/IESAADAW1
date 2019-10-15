/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programacero;

/**
 *
 * @author lbbprof01
 * @version 1.0
 */
public class Alumno extends Persona {
    
    private long numExpediente;
    private String cursoActual;
    

    public Alumno() {
        super();
    }

    public Alumno(String nombre, String apellidos, String NIF, String telefono, String direccion, int edad, long nExp, String curso){
        super(nombre, apellidos, NIF, telefono, direccion, edad);
        this.numExpediente = nExp;
        this.cursoActual = curso;
    }
   
    public Alumno(Alumno a){
        super(a);
        this.numExpediente = a.getNumExpediente();
        this.cursoActual = a.getCursoActual();
    }
    
   public Alumno(Persona p, long numExp, String curso){
       super(p);
       this.numExpediente = numExp;
       this.cursoActual = curso;
   } 
    
    public long getNumExpediente() {
        return numExpediente;
    }

    public void setNumExpediente(long numExpediente) {
        this.numExpediente = numExpediente;
    }

    public String getCursoActual() {
        return cursoActual;
    }

    public void setCursoActual(String cursoActual) {
        this.cursoActual = cursoActual;
    }


    
}
