
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class testTransporteFactory {

    //Uso de .getClass() para comparar clases
    @DisplayName("Test Bicicleta")
    @Test
    public void testGetTransporteBicicleta() {
        IComun bicicleta = TransporteFactory.getTransporte(TransporteFactory.BICICLETA);
        assertNotNull(bicicleta);
        assertEquals(bicicleta.getClass(), Bicicleta.class);
    }
    //Uso de instanceof para comparar clases
    @DisplayName("Test Camion")
    @Test
    public void testGetTransporteCamion() {
        IComun camion = TransporteFactory.getTransporte(TransporteFactory.CAMION);
        assertNotNull(camion);
        assertTrue(camion instanceof Camion);
    }

    @DisplayName("Test Invalido")
    @Test
    public void testGetTransporteInvalido() {
        IComun transporteInvalido = TransporteFactory.getTransporte(9999);
        assertNull(transporteInvalido);
    }
}
