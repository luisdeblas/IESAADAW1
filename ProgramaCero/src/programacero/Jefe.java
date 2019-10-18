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
public class Jefe extends Empleado implements Reunion{

    private int horasTrabajo;

    public Jefe() {
        super();
    }

    public Jefe(Jefe j) {
        super(j);
        this.horasTrabajo = j.getHorasTrabajo();
    }

    public Jefe(Empleado e, int horasTrabajo) {
        super(e);
        this.horasTrabajo = horasTrabajo;
    }

    public Jefe(String nombre, int pagoPorHora, int horasTrabajo) {
        super(nombre, pagoPorHora);
        this.horasTrabajo = horasTrabajo;
    }

    public int getHorasTrabajo() {
        return horasTrabajo;
    }

    public void setHorasTrabajo(int horasTrabajo) {
        this.horasTrabajo = horasTrabajo;
    }

    @Override
    public int calcularSalario() {
        return getPagoPorHora() * horasTrabajo;
    }

    @Override
    public String toString() {
        return super.toString()+"Jefe{" + "horasTrabajo=" + horasTrabajo + '}';
    }

    @Override
    public void nuevaReunion(String tema) {
        this.nuevaComision(tema);
    }

    
}
