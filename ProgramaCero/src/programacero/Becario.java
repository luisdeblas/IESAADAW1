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
public class Becario extends Empleado {

    public Becario() {
        super();
    }

    public Becario(Becario j) {
        super(j);
    }
    
    public Becario(Empleado e) {
        super(e);
    }

    public Becario(String nombre, int pagoPorHora) {
        super(nombre, pagoPorHora);
    }

    @Override
    public int calcularSalario() {
        return getPagoPorHora() * 0;
    }

    //El siguiente método es erróneo porque el Empleado.aumentarPago() es final y no se puede sobreescribir
//    @Override
//    private void aumentaPago() {
//         this.setPagoPorHora(this.getPagoPorHora()*1000);
//    }
    
    @Override
    protected void nuevaComision(String c){
        this.comision+="\n[BECARIO]"+c; //Empleado.comision es protected, por lo que podemos acceder desde una subclase 
    }
    
    //El siguiente método aLaCalle NO sobreescribe al del padre, sino que es otro distinto y ajeno
    //por lo que incluir @Override supone un error
//    @Override
//    private void aLaCalle(){
//        this.cesado=false; //Empleado.cesado es private por lo que NO podemos acceder desde una subclase
//    }
    
    @Override
    public void calculaNomina() {
        System.out.println("Calculando la nomina de " + this.getNombre());
        System.out.println("Los becarios NO tienen nómina!!");
    }
}
