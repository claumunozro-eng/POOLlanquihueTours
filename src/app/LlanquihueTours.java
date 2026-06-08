/*
 * Clase principal del sistema Llanquihue Tours
 * Crea instancias de clientes y colaboradores, validando el rut que funciona como ID 
 * Nos muestra la informacion por consola.
 */
package app;

import model.Clientes;
import model.Colaboradores;
import model.Direccion;
import util.RutInvalidoException;
import util.Validadores;

/**
 *
 * @author claum
 */
public class LlanquihueTours {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        try {
            String rutCliente1 = "12.345.678-5";
            String rutCliente2 = "11.111.111-1";
            String rutColaborador1 = "22.222.222-2";

            Validadores.validarRut(rutCliente1);
            Validadores.validarRut(rutCliente2);
            Validadores.validarRut(rutColaborador1);

            Direccion direccionCliente1 = new Direccion(
                    "Av. Costanera",
                    1234,
                    "Puerto Varas",
                    "Los Lagos");
            

            Direccion direccionCliente2 = new Direccion(
                    "Calle San Martin",
                    987,
                    "Frutillar",
                    "Los Lagos");
            

            Direccion direccionColaborador1 = new Direccion(
                    "Camino Ensenada",
                    111,
                    "Puerto Montt",
                    "Los Lagos");
            

            Clientes cliente1 = new Clientes(
                    "Camila Torres",
                    rutCliente1,
                    "camila@gmail.com",
                    direccionCliente1);
            

            Clientes cliente2 = new Clientes(
                    "Diego Vargas",
                    rutCliente2,
                    "diego@gmail.com",
                    direccionCliente2);
            

            Colaboradores colaborador1 = new Colaboradores(
                    "Sofia Munoz",
                    rutColaborador1,
                    "sofia@gmail.com",
                    direccionColaborador1,
                    250000.0);
            

            System.out.println(cliente1);
            System.out.println();

            System.out.println(cliente2);
            System.out.println();

            System.out.println(colaborador1);

        } catch (RutInvalidoException e) {
            System.out.println("Error al validar RUT: " + e.getMessage());
        }
    }
    
}
