
/**
 * La clase TransporteFactory proporciona un método estático para obtener instancias de diferentes tipos de transporte.
 */
public class TransporteFactory {
    /**
     * Constante que representa el tipo de transporte "camión".
     */
    public static final int CAMION = 1;

    /**
     * Constante que representa el tipo de transporte "bicicleta".
     */
    public static final int BICICLETA = 2;

    /**
     * Devuelve una instancia de un objeto que implementa la interfaz IComun según el tipo especificado.
     *
     * @param tipo El tipo de transporte deseado. Debe ser una de las constantes definidas en esta clase.
     *             CAMION para obtener un camión, BICICLETA para obtener una bicicleta.
     * @return Una instancia de un objeto que implementa la interfaz IComun, o null si el tipo de transporte no es válido.
     */
    public static IComun getTransporte(int tipo) {
        return switch (tipo) {
            case CAMION ->  new Camion();
            case BICICLETA -> new Bicicleta();
            default -> null;
        };
    }
}


