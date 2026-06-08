/*
 *  Rol de colaboradores que prestan servicio a Llanquihue Tours
 *  
 */
package model;

/**
 *
 * @author claum
 */
public class Colaboradores extends Personas {
    private Double pagos;

    public Colaboradores(String nombre, String rut, String correo, Direccion direccion, Double pagos) {
        super(nombre, rut, correo, direccion);
        this.pagos = pagos;
    }
    
    
      @Override
    public void mostrarInformacion() {
    super.mostrarInformacion();
    System.out.println("Tipo: Colaborador");
    System.out.println("Pagos: " + pagos);
    }
      
    @Override
    public String toString() {
    return "===== COLABORADOR =====\n" +
           super.toString() +
           "\nTipo: Colaborador" +
           "\nPagos: " + pagos;
    }
    
}