
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class testBicicleta {
    @DisplayName("Test Coste Vigo")
    @Test
    public void testCosteTotalVigo() {
        Bicicleta bicicleta = new Bicicleta();
        assertEquals(4.5F, bicicleta.costeTotal(IComun.VIGO));
    }
    @DisplayName("Test Coste Pontevedra")
    @Test
    public void testCosteTotalPontevedra() {
        Bicicleta bicicleta = new Bicicleta();
        assertEquals(6.5F, bicicleta.costeTotal(IComun.PONTEVEDRA));
    }
    @DisplayName("Test Coste Vilagarcia")
    @Test
    public void testCosteTotalVilagarcia() {
        Bicicleta bicicleta = new Bicicleta();
        assertEquals(5.5F, bicicleta.costeTotal(IComun.VILAGARCIA));
    }
    @DisplayName("Test Coste Invalido")
    @Test
    public void testCosteTotalInvalido() {
        Bicicleta bicicleta = new Bicicleta();
        assertNull(bicicleta.costeTotal(9999));
    }
    @DisplayName("Test Tipo Embalaje Caja Madera")
    @Test
    public void testTipoEmbalajePalet() {
        Bicicleta bicicleta = new Bicicleta();
        assertEquals(IComun.PALET, bicicleta.tipoEmbalaje(2.0F, 2.0F, 2.0F, 2.0F));
    }
    @DisplayName("Test Tipo Embalaje Envoltorio Carton")
    @Test
    public void testTipoEmbalajeEnvoltorioCarton() {
        Bicicleta bicicleta = new Bicicleta();
        assertEquals(IComun.ENVOLTORIO_CARTON, bicicleta.tipoEmbalaje(1.0F, 1.0F, 1.0F, 1.0F));
    }
    @DisplayName("Test Objeto Único")
    @Test
    public void testBicicleta() {
        Bicicleta bici1 = new Bicicleta();
        Bicicleta bici2 = new Bicicleta();
        assertNotEquals(bici1, bici2);
    }
    @DisplayName("Test CLASS")
    @Test
    public void testGetClass() {
        Bicicleta bici1 = new Bicicleta();
        assertEquals(Bicicleta.class, bici1.getClass());
    }
}

