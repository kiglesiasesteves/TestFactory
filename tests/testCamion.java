
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class testCamion {
    @DisplayName("Test Coste Vigo")
    @Test
    public void testCosteTotalVigo() {
        Camion camion = new Camion();
        assertEquals(7.5F, camion.costeTotal(IComun.VIGO));
    }

    @DisplayName("Test Coste Pontevedra")
    @Test
    public void testCosteTotalPontevedra() {
        Camion camion = new Camion();
        assertEquals(8.5F, camion.costeTotal(IComun.PONTEVEDRA));
    }

    @DisplayName("Test Coste Vilagarcia")
    @Test
    public void testCosteTotalVilagarcia() {
        Camion camion = new Camion();
        assertEquals(9.5F, camion.costeTotal(IComun.VILAGARCIA));
    }

    @DisplayName("Test Coste Invalido")
    @Test
    public void testCosteTotalInvalido() {
        Camion camion = new Camion();
        assertNull(camion.costeTotal(9999));
    }

    @DisplayName("Test Tipo Embalaje Palet")
    @Test
    public void testTipoEmbalajePalet() {
        Camion camion = new Camion();
        assertEquals(IComun.PALET, camion.tipoEmbalaje(2.0F, 2.0F, 2.0F, 2.0F));
    }

    @DisplayName("Test Tipo Embalaje Envoltorio Carton")
    @Test
    public void testTipoEmbalajeEnvoltorioCarton() {
        Camion camion = new Camion();
        assertEquals(IComun.ENVOLTORIO_CARTON, camion.tipoEmbalaje(1.0F, 1.0F, 1.0F, 1.0F));
    }
    @DisplayName("Test Objeto Único")
    @Test
    public void testBicicleta() {
        Camion camion1 = new Camion();
        Camion camion2 = new Camion();
        assertNotEquals(camion1, camion2);
    }
    @DisplayName("Test CLASS")
    @Test
    public void testGetClass() {
        Camion camion1 = new Camion();
        assertEquals(Camion.class, camion1.getClass());
    }
}