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
        
        System.out.println("¿Cuántas personas se han declarado hasta este momento (1)?");
        System.out.println("El valor de la variable static Persona.npersonas es: " + Persona.getNpersonas());
        
        
        int edad=0;
        /*DAW101->David         */ alumnos[0] = new Persona("David", "Díez Vallejo", "75968546M", "942568793", "Narnia", 0);
        /*DAW102->Luis          */ alumnos[1] = new Persona("Luis Jose", "Fernandez Lastra", "NNIF", "Telefono", "Direccion", 21);
        /*DAW104->Alberto Liñan */ alumnos[2] = new Persona("Nombre", "Apellidos", "NNIF", "Telefono", "Direccion", 0);
        /*DAW105->Aidan         */ alumnos[3] = new Persona("Aidan", "LLamosas", "9999999999999999999", "9432131421222", "Polo norte no tiene perdida.", 18);
        /*DAW106->Alberto Maza  */ alumnos[4] = new Persona("Nombre", "Apellidos", "NNIF", "Telefono", "Direccion", 0);
        /*DAW107->Vindio        */ alumnos[5] = new Persona("Vindio", "Pérez Pérez", "12345678A", "600601602", "Todo recto y al final de la calle a la derecha", 25);
        /*DAW108->Ander         */ alumnos[6] = new Persona("Nombre", "Apellidos", "NNIF", "Telefono", "Direccion", 0);
        /*DAW109->Mar           */ alumnos[7] = new Persona("Mar", "Santi", "721060L", "625958485", "Castro", 21);
        /*DAW110->Adrian        */ alumnos[8] = new Persona("Nombre", "Apellidos", "NNIF", "Telefono", "Direccion", 0);
        /*DAW111->Andres        */ alumnos[9] = new Persona("Nombre", "Apellidos", "NNIF", "Telefono", "Direccion", 0);
        /*DAW112->Jose Manuel   */ alumnos[10] = new Persona("Nombre", "Apellidos", "NNIF", "Telefono", "Direccion", 0);
        /*DAW113->Jairo         */ alumnos[11] = new Persona("Jairo", "Martínez", "63728492L", "655555932", "Mordor", 0);
        /*DAW114->Mario         */ alumnos[12] = new Persona("Mario", "Sánchez Martín", "11111111L", "612312312", "Area 52", 20);

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
        
        System.out.println("¿Cuántas personas se han declarado hasta este momento (2)?");
        System.out.println("El valor de la variable static Persona.npersonas es: " + Persona.getNpersonas());
        
        
        ArrayList<Persona> profesores = new ArrayList<Persona>();
        profesores.add(new Persona("Luis", "de Blas Blázquez", "72149278L", "984206366", "Gijón", 36));
        profesores.add(new Persona("Marian", "Gonzalez", "55332211J", "942200111", "Santander", 42));
        profesores.add(new Persona("Josu", "Lucas", "35227740V", "943650852", "Bilbao", 30));
        profesores.add(new Persona("Juan Manuel", "Torino", "01087291J", "902121122", "Madrid", 67));
        
        System.out.println("Los datos de los profesores son:");
        System.out.println(profesores);
        
        System.out.println("¿Cuántas personas se han declarado hasta este momento (3)?");
        System.out.println("El valor de la variable static Persona.npersonas es: " + Persona.getNpersonas());
        
        System.out.println("Recorremos alumnos:");
        
        //Recorremos los alumnos
        for(int i=0; i<13; i++){
            System.out.println(alumnos[i]);
        }
        
        System.out.println("Recorremos profesores:");
        //Recorremos los profesores
        int j=0;
        while(j<profesores.size()){
            System.out.println(profesores.get(j));
            j++;
        }
        
        System.out.println("Recorremos gente=alumnos+profesores:");
        Persona[] gente = new Persona[alumnos.length+profesores.size()]; 
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
        
        System.out.println("¿Cuántas personas se han declarado al final?");
        System.out.println("El valor de la variable static Persona.npersonas es: " + Persona.getNpersonas());
        System.out.println("El valor de la variable final Persona.PI es: " + Persona.PI);

        
        char c;
        System.out.println("Introduzca un caracter:");
        c=in.next().charAt(0);
        char opcion=0;
        do{
            System.out.println("Pulse 1 para buscar en los alumnos o 2 para buscar en los profesores:");
            opcion= in.next().charAt(0);
        }while(opcion!=1 && opcion!=2);
        
        switch(opcion){
            case 1: buscar(c, alumnos);    break;
            case 2: buscar(c, profesores);    break;
            default:
        }
        
        
        System.out.println("FIN");
    }
    double a = Math.PI;
    /**
     * Recorremos el array de Personas y si el nombre contiene al caracter c, mostramos los datos de la persona por pantalla.
     * @param c caracter a buscar en el nombre de las personas
     * @param array array de personas donde buscar el caracter c
     */
    public static void buscar(char c, Persona[] array){        
        for (Persona p : array) {
            /* El método String.indexOf(char c) devuelve:
            -1 si el char c NO está en el String
            la primera posicion (indice) dentro del String en la que aparezca el char c
            */
            if (p.getNombre().indexOf(c) != -1) {
                System.out.println(p);
            } else {
                continue;
            }
        }
    }
    
    /**
     * Recorremos la ArrayList de Personas y si el nombre contiene al caracter c, mostramos los datos de la persona por pantalla.
     * @param c caracter a buscar en el nombre de las personas
     * @param lista ArrayList de personas donde buscar el caracter c
     */
    public static void buscar(char c, ArrayList<Persona> lista){
        /*
        //Una primera forma podría ser transformar la ArrayList<Persona> en un array Persona[]
        //y luego llamar al método buscar(char, Persona[])
        */
        Persona[] array = new Persona[lista.size()];
        for(int i=0; i<lista.size(); i++){
            array[i]=lista.get(i);
        }
        buscar(c,array);
        
        /*
        //Otra manera más directa, buscando sobre la propia ArrayList, podría ser la siguiente:
        for(Persona p: lista){
            //el método String.contains(String subcadena) necesita un String subcadena a buscar, que obtenemos al concatenar el símbolo vacío "" con el caracter c a buscar
            //devuelve TRUE si la subcadena pertenece al String o FALSE si no
            if(p.getNombre().contains(""+c)){
               System.out.println(p);
            }
        }
        */
    }
}
