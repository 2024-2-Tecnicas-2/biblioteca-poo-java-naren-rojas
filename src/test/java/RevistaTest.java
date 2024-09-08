import com.mycompany.biblioteca.java.Revista;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class RevistaTest {

    @Test
    void testMostrarInfo() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        
        Revista revista = new Revista("Test Revista", 2023, 42, "Nombre Revista Test");
        revista.mostrarInfo();
        
        String expectedOutput = "Título: Test Revista\n" +
                                "Año de publicación: 2023\n" +
                                "Número de revista: 42\n" +
                                "Nombre de revista: Nombre Revista Test\n";
        assertEquals(expectedOutput, outContent.toString());
        
        System.setOut(System.out);
    }

    @Test
    void testConstructor() {
        Revista revista = new Revista("Test Revista", 2023, 42, "Nombre Revista Test");
        assertEquals("Test Revista", revista.titulo);
        assertEquals(2023, revista.anioPublicacion);
        assertEquals(42, revista.numeroRevista);
        assertEquals("Nombre Revista Test", revista.nombreRevista);
    }
}
