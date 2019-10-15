/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programacero;

/**
 *
 * @author lbbprof01
 */
public class Profesor extends Persona {
    
    private String departamento; 
   
    public Profesor() {
        super();
    }

    public Profesor(String nombre, String apellidos, String NIF, String telefono, String direccion, int edad, String dpto){
        super(nombre, apellidos, NIF, telefono, direccion, edad);
        this.departamento = dpto;
    }
   
    public Profesor(Profesor p){
        super(p);
        this.departamento = p.getDepartamento();
    }
    
   public Profesor(Persona p, String dpto){
       super(p);
       this.departamento = dpto;
   } 

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    @Override
    public String toString() {
        //return super.toString()+"Profesor{" + "departamento=" + departamento + '}';
        return "Profesor{" + "departamento=" + departamento + '}';
    }
    
    
    
}
