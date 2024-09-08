import com.mycompany.biblioteca.java.Publicacion;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PublicacionTest {

    @Test
    void testMostrarInfo() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        
        Publicacion publicacion = new Publicacion("Test Publicación", 2023);
        publicacion.mostrarInfo();
        
        String expectedOutput = "Título: Test Publicación\n" +
                                "Año de publicación: 2023\n";
        assertEquals(expectedOutput, outContent.toString());
        
        System.setOut(System.out);
    }

    @Test
    void testConstructor() {
        Publicacion publicacion = new Publicacion("Test Publicación", 2023);
        assertEquals("Test Publicación", publicacion.titulo);
        assertEquals(2023, publicacion.anioPublicacion);
    }
}
