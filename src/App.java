
/**
 * La clase com.DAM2024.factoryTransporte.App es la clase principal de la aplicación.
 * En esta clase se prueba el funcionamiento de la fábrica de transporte.
 */
public class App {
    static IComun transporte;

    /**
     * El método main es el punto de entrada de la aplicación.
     *
     * @param args Los argumentos de la línea de comandos (no se utilizan en este caso).
     */
    public static void main(String[] args) {
        // Obtener una instancia de camión desde la fábrica de transporte
        transporte = TransporteFactory.getTransporte(TransporteFactory.CAMION);
        if (transporte != null) {
            // Si se pudo obtener la instancia del camión, realizar operaciones con él
            float costeTotalCamion = transporte.costeTotal(5);
            int tipoEmbalajeCamion = transporte.tipoEmbalaje(1.5f, 2.0f, 1.0f, 50f);

            // Mostrar los resultados
            System.out.println("Coste total de la carga del camión: " + costeTotalCamion + "Є");
            System.out.println("Tipo de embalaje para el camión: " + tipoEmbalajeCamion);
        } else {
            // Si no se pudo obtener la instancia del camión, mostrar un mensaje de error
            System.out.println("No se pudo crear el camión.");
        }
    }
}
