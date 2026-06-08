/*
 * Representa la direccion fisica de una persona relacionada con Llanquihue Tours
 * Esta clase se utiliza como parte de la composición dentro de la clase Personas
 */
package model;

/**
 *
 * @author claum
 */
public class Direccion {
    
    // Atributos de la dirección
    private String calle;
    private String ciudad;
    private String region;
    private int numero;

    /**
     * Constructor de la clase Direccion.
     * 
     * @param calle nombre de la calle
     * @param numero número de la dirección
     * @param ciudad ciudad donde vive el cliente
     * @param region región donde vive el cliente
     */
    public Direccion(String calle, int numero, String ciudad, String region) {
        this.calle = calle;
        this.numero = numero;
        this.ciudad = ciudad;
        this.region = region;
    }

    /**
     * Muestra la dirección completa del cliente.
     * 
     * @return dirección formateada como texto
     */
    public String mostrarDireccion() {
        return calle + " #" + numero + ", " + ciudad + ", Region de " + region;
    }

    // Métodos get y set

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }
    
    @Override
    public String toString() {
    return calle + " #" + numero + ", " + ciudad + ", Region de " + region;
}
    
}