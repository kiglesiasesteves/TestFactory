
/**
 * La interfaz IComun define los métodos comunes que deben ser implementados por las clases
 * que representan diferentes tipos de transporte en la aplicación.
 *
 * Esta interfaz proporciona constantes para tipos de embalaje y códigos postales predefinidos.
 */
public interface IComun {
    /**
     * Constante que representa el tipo de embalaje "palet".
     */
    public static final int PALET = 0;

    /**
     * Constante que representa el tipo de embalaje "envoltorio de cartón".
     */
    public static final int ENVOLTORIO_CARTON = 1;

    /**
     * Constante que representa el tipo de embalaje "caja de madera".
     */
    public static final int CAJA_MADERA = 2;

    /**
     * Constantes que representan algunos códigos postales predefinidos.
     */
    public static final int VIGO = 4;
    public static final int PONTEVEDRA = 5;
    public static final int VILAGARCIA = 6;

    /**
     * Calcula el coste total del envío baseandonos en el código postal de destino.
     *
     * @param cp El código postal de destino.
     * @return El coste total del envío como un valor de tipo Float.
     */
    public Float costeTotal(int cp);

    /**
     * Determina el tipo de embalaje requerido para el paquete baseandose en sus dimensiones y peso.
     *
     * @param x La dimensión X del paquete.
     * @param y La dimensión Y del paquete.
     * @param z La dimensión Z del paquete.
     * @param peso El peso del paquete.
     * @return El tipo de embalaje como un valor de tipo Integer. Puede ser uno de los valores
     *         constantes definidos en esta interfaz (PALET, ENVOLTORIO_CARTON, CAJA_MADERA).
     */
    public Integer tipoEmbalaje(float x, float y, float z, float peso);
}

