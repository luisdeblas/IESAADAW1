package programacero;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author LBB
 * @version 1.0
 */
public class ProgramaCero {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        
        Persona p = new Persona();
        Persona[] alumnos= new Persona[13];
        
        System.out.println("Introduce los datos de la persona:");
        System.out.println("Nombre:");
        p.setNombre(in.nextLine());
        System.out.println("Apellidos:");
        p.setApellidos(in.nextLine());
        System.out.println("NIF:");
        p.setNIF(in.nextLine());
        System.out.println("Telefono:");
        p.setTelefono(in.nextLine());
        System.out.println("Direccion:");
        p.setDireccion(in.nextLine());
        System.out.println("Edad:");
        p.setEdad(in.nextInt());
        System.out.println("Los datos introducidos son:");
        System.out.println(p+"\n\n");
        
        
        int edad=0;
        alumnos[0] = new Persona("Nombre", "Apellidos", "NNIF", "Telefono", "Direccion", edad=0);
        alumnos[1] = new Persona("Nombre", "Apellidos", "NNIF", "Telefono", "Direccion", edad=0);
        alumnos[2] = new Persona("Nombre", "Apellidos", "NNIF", "Telefono", "Direccion", edad=0);
        alumnos[3] = new Persona("Nombre", "Apellidos", "NNIF", "Telefono", "Direccion", edad=0);
        alumnos[4] = new Persona("Nombre", "Apellidos", "NNIF", "Telefono", "Direccion", edad=0);
        alumnos[5] = new Persona("Nombre", "Apellidos", "NNIF", "Telefono", "Direccion", edad=0);
        alumnos[6] = new Persona("Nombre", "Apellidos", "NNIF", "Telefono", "Direccion", edad=0);
        alumnos[7] = new Persona("Nombre", "Apellidos", "NNIF", "Telefono", "Direccion", edad=0);
        alumnos[8] = new Persona("Nombre", "Apellidos", "NNIF", "Telefono", "Direccion", edad=0);
        alumnos[9] = new Persona("Nombre", "Apellidos", "NNIF", "Telefono", "Direccion", edad=0);
        alumnos[10] = new Persona("Nombre", "Apellidos", "NNIF", "Telefono", "Direccion", edad=0);
        alumnos[11] = new Persona("Nombre", "Apellidos", "NNIF", "Telefono", "Direccion", edad=0);
        alumnos[12] = new Persona("Nombre", "Apellidos", "NNIF", "Telefono", "Direccion", edad=0);

        System.out.println("Los datos de los alumnos son:");
        System.out.println(alumnos[0]);
        System.out.println(alumnos[1]);
        System.out.println(alumnos[2]);
        System.out.println(alumnos[3]);
        System.out.println(alumnos[4]);
        System.out.println(alumnos[5]);
        System.out.println(alumnos[6]);
        System.out.println(alumnos[7]);
        System.out.println(alumnos[8]);
        System.out.println(alumnos[9]);
        System.out.println(alumnos[10]);
        System.out.println(alumnos[11]);
        System.out.println(alumnos[12]);
        
        
        
        ArrayList<Persona> profesores = new ArrayList<Persona>();
        profesores.add(new Persona("Luis", "de Blas Blázquez", "72149278L", "984206366", "Gijón", 36));
        profesores.add(new Persona("Marian", "Gonzalez", "55332211J", "942200111", "Santander", 42));
        profesores.add(new Persona("Josu", "Lucas", "35227740V", "943650852", "Bilbao", 30));
        profesores.add(new Persona("Juan Manuel", "Torino", "01087291J", "902121122", "Madrid", 67));
        
        System.out.println("Los datos de los profesores son:");
        System.out.println(profesores);
        
        //Recorremos los alumnos
        for(int i=0; i<13; i++){
            System.out.println(alumnos[i]);
        }
        
        //Recorremos los profesores
        int j=0;
        while(j<profesores.size()){
            System.out.println(profesores.get(j));
            j++;
        }
        
        
        Persona[] gente = new Persona[13+profesores.size()]; 
        ArrayList<Persona> listaGente = new ArrayList<Persona>();
        int k=0, indice=0;
        do{
            if(k<13){
                gente[k]=alumnos[k];
            }
            else{
                gente[k]= profesores.get(indice);
                indice++;
            }
            System.out.println(gente[k]);
        } while(++k<gente.length);
        
        System.out.println("FIN");
    }
    
}
