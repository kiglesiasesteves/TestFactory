
/**
 * La clase Bicicleta implementa la interfaz IComun y representa un tipo de transporte específico: bicicleta.
 *
 * Esta clase proporciona la implementación de los métodos definidos en la interfaz IComun para el transporte en bicicleta.
 */
public class Bicicleta implements IComun {

    /**
     * Constructor por defecto de la clase Bicicleta.
     */
    public Bicicleta() {
    }

    /**
     * Calcula el coste total del envío baseandonos en el código postal de destino.
     *
     * @param cp El código postal de destino.
     * @return El coste total del envío como un valor de tipo Float. Devuelve null si el código postal no es válido.
     */
    @Override
    public Float costeTotal(int cp) {
        switch (cp) {
            case VIGO -> {
                return 4.5F;
            }
            case PONTEVEDRA -> {
                return 6.5F;
            }
            case VILAGARCIA -> {
                return 5.5F;
            }
            default -> {
                return null;
            }
        }
    }

    /**
     * Determina el tipo de embalaje requerido para el paquete baseandonos en sus dimensiones y peso.
     *
     * @param x    La dimensión X del paquete.
     * @param y    La dimensión Y del paquete.
     * @param z    La dimensión Z del paquete.
     * @param peso El peso del paquete.
     * @return El tipo de embalaje como un valor de tipo Integer. Puede ser uno de
     */

    @Override
    public Integer tipoEmbalaje(float x, float y, float z, float peso) {
        if (x > 1.5 && y > 1.5 && z > 1.5 && peso > 1.5) {
            return PALET;
        } else {
            return ENVOLTORIO_CARTON;
        }
    }
}
