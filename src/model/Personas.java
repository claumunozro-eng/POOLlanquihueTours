package model;

/**
 * Clase principal de una persona donde contamos con todos los datos 
 * necesarios para el registro de una nueva persona
 * Esta clase utiliza composición, ya que un Cliente tiene una Dirección.
 */
public class Personas {

    // Atributos de las personas
    private String nombre;
    private String rut;
    private String correo;

    // Composición: una persona tiene una dirección
    private Direccion direccion;

    /**
     * Constructor de la clase Personas.
     * 
     * @param nombre nombre de una persona
     * @param rut RUT de una persona
     * @param correo correo electrónico de una persona
     * @param direccion dirección asociada a una persona
     */
    public Personas(String nombre, String rut, String correo, Direccion direccion) {
        this.nombre = nombre;
        this.rut = rut;
        this.correo = correo;
        this.direccion = direccion;
    }

    /**
     * Muestra la información completa de la persona.
     */
    public void mostrarInformacion() {
        System.out.println("===== DATOS DE LA PERSONA =====");
        System.out.println("Nombre : " + nombre);
        System.out.println("RUT    : " + rut);
        System.out.println("Correo : " + correo);
        System.out.println("Direccion: " + direccion.mostrarDireccion());
    }

    // Métodos get y set

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }
    
    @Override
    public String toString() {
    return "Nombre: " + nombre +
           "\nRUT: " + rut +
           "\nCorreo: " + correo +
           "\nDireccion: " + direccion;
    }

}