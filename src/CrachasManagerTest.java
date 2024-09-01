import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CrachasManagerTest {

    @Test
    public void testSingletonInstance() {
        CrachasManager instance1 = CrachasManager.getInstance();
        CrachasManager instance2 = CrachasManager.getInstance();

        assertSame(instance1, instance2, "As instâncias devem ser iguais.");
    }

    @Test
    public void testSetAndGetNomeFuncionario() {
        CrachasManager manager = CrachasManager.getInstance();

        String expectedNome = "Ana Oliveira";
        manager.setNomeFuncionario(expectedNome);

        assertEquals(expectedNome, manager.getNomeFuncionario(), "O nome do funcionário deve ser o mesmo que foi definido.");
    }

    @Test
    public void testSetAndGetCodigoCracha() {
        CrachasManager manager = CrachasManager.getInstance();

        String expectedCodigo = "987654";
        manager.setCodigoCracha(expectedCodigo);

        assertEquals(expectedCodigo, manager.getCodigoCracha(), "O código do crachá deve ser o mesmo que foi definido.");
    }

    @Test
    public void testSingletonThreadSafety() throws InterruptedException {
        Runnable task = () -> {
            CrachasManager instance = CrachasManager.getInstance();
            assertNotNull(instance, "A instância não deve ser nula.");
        };

        Thread thread1 = new Thread(task);
        Thread thread2 = new Thread(task);
        Thread thread3 = new Thread(task);

        thread1.start();
        thread2.start();
        thread3.start();

        thread1.join();
        thread2.join();
        thread3.join();
    }
}
