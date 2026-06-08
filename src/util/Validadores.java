package util;

/**
 * Clase auxiliar que contiene métodos de validación para Llanquihue Tours.
 */
public class Validadores {

    /**
     * Valida si un texto no está vacío.
     * 
     * @param texto texto que se desea validar
     * @return true si el texto tiene contenido, false si está vacío
     */
    public static boolean textoValido(String texto) {
        return texto != null && !texto.trim().isEmpty();
    }

    /**
     * Valida si un precio es mayor que cero.
     * 
     * @param precio precio del videojuego
     * @return true si el precio es válido
     */
    public static boolean precioValido(double precio) {
        return precio > 0;
    }

    /**
     * Valida si el stock es igual o mayor que cero.
     * 
     * @param stock cantidad disponible
     * @return true si el stock es válido
     */
    public static boolean stockValido(int stock) {
        return stock >= 0;
   
    }
    /**
     * Valida que el ingreso del rut sea valido
     * @param rut Rol Unico Tributario de las personas para componer en las clases
     * @throws util.RutInvalidoException
     */
    public static void validarRut(String rut) throws RutInvalidoException {
        if (rut == null || rut.trim().isEmpty()) {
            throw new RutInvalidoException("El RUT no puede estar vacío");
        }

        rut = rut.replace(".", "")
                 .replace("-", "")
                 .trim()
                 .toUpperCase();

        if (!rut.matches("\\d{7,8}[0-9K]")) {
            throw new RutInvalidoException("El formato del RUT no es válido");
        }

        String cuerpo = rut.substring(0, rut.length() - 1);
        char dvIngresado = rut.charAt(rut.length() - 1);

        char dvCalculado = calcularDigitoVerificador(cuerpo);

        if (dvIngresado != dvCalculado) {
            throw new RutInvalidoException("El dígito verificador del RUT no es válido");
        }
    }

    private static char calcularDigitoVerificador(String cuerpoRut) {
        int suma = 0;
        int multiplicador = 2;

        for (int i = cuerpoRut.length() - 1; i >= 0; i--) {
            suma += Character.getNumericValue(cuerpoRut.charAt(i)) * multiplicador;
            multiplicador++;

            if (multiplicador > 7) {
                multiplicador = 2;
            }
        }

        int resto = suma % 11;
        int resultado = 11 - resto;

        if (resultado == 11) {
            return '0';
        }

        if (resultado == 10) {
            return 'K';
        }

        return (char) (resultado + '0');
    }

      
    }
    
