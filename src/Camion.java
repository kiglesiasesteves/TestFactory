
/**
 * La clase Camion implementa la interfaz IComun y representa un tipo de transporte específico: camión.
 *
 * Esta clase proporciona la implementación de los métodos definidos en la interfaz IComun para el transporte por camión.
 */
public class Camion implements IComun {

    /**
     * Constructor por defecto de la clase Camion.
     */
    public Camion() {
    }

    /**
     * Calcula el coste total del envío en base al código postal de destino.
     *
     * @param cp El código postal de destino.
     * @return El coste total del envío como un valor de tipo Float. Devuelve null si el código postal no es válido.
     */
    @Override
    public Float costeTotal(int cp) {
        switch (cp) {
            case VIGO -> {
                return 7.5F;
            }
            case PONTEVEDRA -> {
                return 8.5F;
            }
            case VILAGARCIA -> {
                return 9.5F;
            }
            default -> {
                return null;
            }
        }
    }

    /**
     * Determina el tipo de embalaje requerido para el paquete en base a sus dimensiones y peso.
     *
     * @param x La dimensión X del paquete.
     * @param y La dimensión Y del paquete.
     * @param z La dimensión Z del paquete.
     * @param peso El peso del paquete.
     * @return El tipo de embalaje como un valor de tipo Integer. Puede ser uno de los valores
     *         constantes definidos en la interfaz IComun (PALET, ENVOLTORIO_CARTON, CAJA_MADERA).
     */
    @Override
    public Integer tipoEmbalaje(float x, float y, float z, float peso) {
        if (x > 1.5 && y > 1.5 && z > 1.5 && peso > 1.5) {
            return PALET;
        } else if (x < 1.5 && y < 1.5 && z < 1.5 && peso < 1.5) {
            return ENVOLTORIO_CARTON;
        } else {
            return CAJA_MADERA;
        }
    }
}


