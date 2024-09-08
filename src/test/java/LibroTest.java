import com.mycompany.biblioteca.java.Libro;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LibroTest {

    @Test
    void testMostrarInfo() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        
        Libro libro = new Libro("Test Libro", 2023, "Autor Test", 200);
        libro.mostrarInfo();
        
        String expectedOutput = "Título: Test Libro\n" +
                                "Año de publicación: 2023\n" +
                                "Autor: Autor Test\n" +
                                "Número de páginas: 200\n";
        assertEquals(expectedOutput, outContent.toString());
        
        System.setOut(System.out);
    }

    @Test
    void testConstructor() {
        Libro libro = new Libro("Test Libro", 2023, "Autor Test", 200);
        assertEquals("Test Libro", libro.titulo);
        assertEquals(2023, libro.anioPublicacion);
        assertEquals("Autor Test", libro.autor);
        assertEquals(200, libro.numeroPaginas);
    }
}
