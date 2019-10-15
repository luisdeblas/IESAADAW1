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
        Persona[] alumnos = new Persona[13];
        /*
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
        System.out.println(p + "\n\n");
         */
        System.out.println("¿Cuántas personas se han declarado hasta este momento (1)?");
        System.out.println("El valor de la variable static Persona.npersonas es: " + Persona.getNpersonas());

        int edad = 0;
        /*DAW101->David         */ alumnos[0] = new Persona("David", "Díez Vallejo", "75968546M", "942568793", "Narnia", 0);
        /*DAW102->Luis          */ alumnos[1] = new Persona("Luis Jose", "Fernandez Lastra", "NNIF", "Telefono", "Direccion", 21);
        /*DAW104->Alberto Liñan */ alumnos[2] = new Persona("Nombre", "Apellidos", "NNIF", "Telefono", "Direccion", 0);
        /*DAW105->Aidan         */ alumnos[3] = new Persona("Aidan", "LLamosas", "9999999999999999999", "9432131421222", "Polo norte no tiene perdida.", 18);
        /*DAW106->Alberto Maza  */ alumnos[4] = new Persona("Alberto", "Maza", "72182921C", "613623574", "Calle la pantomima", 23);
        /*DAW107->Vindio        */ alumnos[5] = new Persona("Vindio", "Pérez Pérez", "12345678A", "600601602", "Todo recto y al final de la calle a la derecha", 25);
        /*DAW108->Ander         */ alumnos[6] = new Persona("Ander", "Rodriguez", "45915371B", "pa k kieres saber eso?jaja salu2", "C/Falsa 123", 21);
        /*DAW109->Mar           */ alumnos[7] = new Persona("Mar", "Santi", "721060L", "625958485", "Castro", 21);
        /*DAW110->Adrian        */ alumnos[8] = new Persona("Adrian", "Saveli", "74366347U", "394843843", "C/google", 60);
        /*DAW111->Andres        */ alumnos[9] = new Persona("Andres", "Sisniega", "72175444H", "112", "Gibraltar(España)", 0);
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
        for (int i = 0; i < 13; i++) {
            System.out.println(alumnos[i]);
        }

        System.out.println("Recorremos profesores:");
        //Recorremos los profesores
        int j = 0;
        while (j < profesores.size()) {
            System.out.println(profesores.get(j));
            j++;
        }

        System.out.println("Recorremos gente=alumnos+profesores:");
        Persona[] gente = new Persona[alumnos.length + profesores.size()];
        ArrayList<Persona> listaGente = new ArrayList<Persona>();
        int k = 0, indice = 0;
        do {
            if (k < 13) {
                gente[k] = alumnos[k];
            } else {
                gente[k] = profesores.get(indice);
                indice++;
            }
            listaGente.add(gente[k]);
            System.out.println(gente[k]);
        } while (++k < gente.length);

        System.out.println("¿Cuántas personas se han declarado al final?");
        System.out.println("El valor de la variable static Persona.npersonas es: " + Persona.getNpersonas());
        System.out.println("El valor de la variable final Persona.PI es: " + Persona.PI);

        char c;
        System.out.println("Introduzca un caracter:");
        c = in.next().charAt(0);
        int opcion = 0;
        do {
            System.out.println("Pulse 1 para buscar en los alumnos o 2 para buscar en los profesores:");
            opcion = in.nextInt();
        } while (opcion != 1 && opcion != 2);

        switch (opcion) {
            case 1:
                buscar(c, alumnos);
                break;
            case 2:
                buscar(c, profesores);
                break;
            default:
        }

        //Jugamos con las clases Distancia y DistanciaDoblePrecision
        System.out.println("\n\nJugamos con las clases Distancia y DistanciaDoblePrecision");
        //Ej1: Creamos 2 objetos Distancia
        System.out.println("Ej1: Creamos 2 objetos Distancia");
        Distancia distancia = new Distancia(100);
        System.out.println("El valor de distancia es: " + distancia.distancia);
        Distancia distanciaDoblePrecision = new DistanciaDoblePrecision(200);
        System.out.println("El valor de distanciaDoblePrecisiones: " + distanciaDoblePrecision.distancia);

        //Ej2: Creamos un objeto Distancia y otro DistanciaDoblePrecision
        System.out.println("Ej2: Creamos un objeto Distancia y otro DistanciaDoblePrecision");
        Distancia distancia2 = new Distancia(100);
        System.out.println("El valor de distancia2 es: " + distancia2.distancia);
        DistanciaDoblePrecision distanciaDoblePrecision2 = new DistanciaDoblePrecision(200);
        System.out.println("El valor de distanciaDoblePrecision2 es: " + distanciaDoblePrecision2.distancia);

        //Jugamos con las clases Alumno y Profesor
        System.out.println("\n\nJugamos con las clases Alumno y Profesor");
        /*
        //Las siguietes instruccioes pretenden crear ArrayList de Alumnos y de Profesores
        //a partir de los arrays alumnos y profesores que ya se tienen con datos.
        //Sin embargo, todas ellas son erróneas (BORRAR)
        ArrayList<Alumno> arrayAlumnos = new ArrayList<Alumno>(alumnos); //Aqui no se puede crear un ArrayList<Alumno> a partir de un Persona[]
        arrayAlumnos = alumnos; //Aquí no se puede convertir un Persona[] en ArrayList<Alumno>
        arrayAlumnos.addAll(alumnos); //Aquí o podemos añadir los elementos de Persona[] en un ArrayList<Alumno>
        ArrayList<Profesor> arrayProfesores = new ArrayList<Persona>(profesores); //Aquí no podemos crear un ArrayList<Profesor> a partir de un ArrayList<Persona>
        arrayProfesores = profesores; //Aquí no se puede convertir un Persona[] en ArrayList<Profesor>
        arrayProfesores.addAll(profesores); //Aquí o podemos añadir los elementos de Persona[] en un ArrayList<Profesor>
        /**/
        ArrayList<Alumno> arrayAlumnos = new ArrayList<Alumno>();
        ArrayList<Profesor> arrayProfesores = new ArrayList<Profesor>();
        /**/

        System.out.println("Los datos del array Persona[] gente es:");
        for (Persona per : gente) {
            System.out.println(per);
        }
        System.out.println("Los datos de la arrayList<Persona> profesores es:");
        for (Persona per : profesores) {
            System.out.println(per);
        }
        System.out.println("Los datos de la arrayList<Persona> listaGente es:");
        for (Persona per : listaGente) {
            System.out.println(per);
        }

        System.out.println("Copiamos en ArrayList<Alumno> arrayAlumnos cada alumno del array Persona[] alumnos");
        System.out.println("Añadimos a mano los datos propios de Alumno, porque solo tenemos los de Persona");
        for (Persona per : alumnos) {
            arrayAlumnos.add(new Alumno(per, 0, "DAW1"));
        }
        System.out.println("Copiamos en ArrayList<Profesores> arrayProfesores cada profesor del ArrayList<Persona> profesores");
        System.out.println("Añadimos a mano los datos propios de Profesor, porque solo tenemos los de Persona");
        for (Persona per : profesores) {
            arrayProfesores.add(new Profesor(per, "Informatica"));
        }

        System.out.println("Mostramos el ArrayList<Persona> listaGente");
        for (Persona per : listaGente) {
            System.out.println(per);
        }
        listaGente.removeAll(listaGente);
        System.out.println("Borramos todos los elementos de listaGente y luego añadimos los de arrayAlumos y los de arrayProfesores");
        listaGente.addAll(arrayAlumnos);
        listaGente.addAll(arrayProfesores);
        System.out.println("Mostramos el ArrayList<Persona> listaGente de nuevo:");
        for (Persona per : listaGente) {
            System.out.println(per);
        }
        System.out.println("Mostramos el ArrayList<Alumno> arrayAlumnos de nuevo:");
        for (Alumno al : arrayAlumnos) {
            System.out.println(al);
        }
        System.out.println("Mostramos el ArrayList<Profesor> arrayProfesores de nuevo:");
        for (Profesor prof : arrayProfesores) {
            System.out.println(prof);
        }
        System.out.println("FIN");
    }

    /**
     * Recorremos el array de Personas y si el nombre contiene al caracter c,
     * mostramos los datos de la persona por pantalla.
     *
     * @param c caracter a buscar en el nombre de las personas
     * @param array array de personas donde buscar el caracter c
     */
    public static void buscar(char c, Persona[] array) {
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
     * Recorremos la ArrayList de Personas y si el nombre contiene al caracter
     * c, mostramos los datos de la persona por pantalla.
     *
     * @param c caracter a buscar en el nombre de las personas
     * @param lista ArrayList de personas donde buscar el caracter c
     */
    public static void buscar(char c, ArrayList<Persona> lista) {
        /*
        //Una primera forma podría ser transformar la ArrayList<Persona> en un array Persona[]
        //y luego llamar al método buscar(char, Persona[])
         */
        Persona[] array = new Persona[lista.size()];
        for (int i = 0; i < lista.size(); i++) {
            array[i] = lista.get(i);
        }
        buscar(c, array);

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
