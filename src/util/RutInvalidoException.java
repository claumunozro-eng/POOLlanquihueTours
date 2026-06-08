/*
 * Clase de excepción heredada desde Exception
 * Excepcion personalizada que informa si el rut no es valido.
 */
package util;

/**
 *
 * @author claum
 */
public class RutInvalidoException extends Exception {
    
    public RutInvalidoException (String mensaje){

super (mensaje); 
    }
}