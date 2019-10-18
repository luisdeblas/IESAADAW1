/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programacero;

/**
 *
 * @author luis
 */
public abstract class Empleado implements Nomina{
    
    public static final float IPC = 1.2f;
    
    private String nombre;
    private int pagoPorHora;
    
    protected String comision="";
    private boolean cesado=false;

    public Empleado() {
    }

    public Empleado(String nomre, int pagoPorHora) {
        this.nombre = nomre;
        this.pagoPorHora = pagoPorHora;
    }

    public Empleado(Empleado e) {
        this.nombre = e.getNombre();
        this.pagoPorHora = e.getPagoPorHora();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPagoPorHora() {
        return pagoPorHora;
    }

    public void setPagoPorHora(int pagoPorHora) {
        this.pagoPorHora = pagoPorHora;
    }

    public abstract int calcularSalario();
    
    protected final void aumentaPago(){
        if(!cesado)
            this.setPagoPorHora(Math.round(pagoPorHora*IPC));
    }
    
    protected void nuevaComision(String comision){
        this.comision+="\n["+this.getClass().getName()+"]"+comision;
        this.pagoPorHora+=1;
    }
    
    @Override
    public String toString() {
        return "Empleado{" + "nombre=" + nombre + ", pagoPorHora=" + pagoPorHora + '}';
    }

    protected String getComision() {
        return comision;
    }

    protected void setComision(String comision) {
        this.comision = comision;
    }

    private void aLaCalle(){
        this.cesado=true;
    }

    @Override
    public void calculaNomina() {
        System.out.println("Calculando la nomina de " + this.getNombre());
    }

    @Override
    public void imprimeNomina() {
        System.out.println("Imprimiendo la nomina de " + this.getNombre());
    }
}
