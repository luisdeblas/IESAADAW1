package programacero;

/**
 *
 * @author LBB
 * @version 1.0
 */
public class Persona {
    
    private String nombre;
    private String apellidos;
    private String NIF;
    private String telefono;
    private String direccion;
    private int edad;

    //Constructor por defecto
    public Persona() {
    }

    //Constructor con argumentos
    public Persona(String nombre, String apellidos, String NIF, String telefono, String direccion, int edad) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.NIF = NIF;
        this.telefono = telefono;
        this.direccion = direccion;
        this.edad = edad;
    }

    //Constructor de copia
    public Persona(Persona p) {
        this.nombre = p.getNombre();
        this.apellidos = p.getApellidos();
        this.NIF = p.getNIF();
        this.telefono = p.getTelefono();
        this.direccion = p.getDireccion();
        this.edad = p.getEdad();
    }
    
    //getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getNIF() {
        return NIF;
    }

    public void setNIF(String NIF) {
        this.NIF = NIF;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    //Otros métodos propios de Persona
    
    
    //Otros métodos sobreescritos
    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", apellidos=" + apellidos + ", NIF=" + NIF + ", telefono=" + telefono + ", direccion=" + direccion + ", edad=" + edad + '}';
    }
    
    
}
