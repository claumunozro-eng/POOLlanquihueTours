/*
 *  
 * Rol de clientes que adquieren algun servicio ofrecido a traves de Llanquihue Tours 
 */
package model;

/**
 *
 * @author claum
 */
public class Clientes extends Personas {
    
    public Clientes(String nombre, String rut, String correo, Direccion direccion) {
        super(nombre, rut, correo, direccion);
    }
    
     @Override
    public void mostrarInformacion() {
    super.mostrarInformacion();
    System.out.println("Tipo: Cliente");
    }

    @Override
    public String toString() {
    return "===== CLIENTE =====\n" +
           super.toString() +
           "\nTipo: Cliente";
    }
    
}
