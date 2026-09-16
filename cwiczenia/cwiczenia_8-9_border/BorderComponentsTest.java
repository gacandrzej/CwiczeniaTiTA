package pad.border;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BorderComponentsTest {

    private BorderComponents okno;

    @BeforeEach
    void setUp() {
        okno = new BorderComponents();
    }

    @AfterEach
    void tearDown() {
        if (okno != null) {
            okno.dispose();
        }
    }

    @Test
    void testWindowTitleIsNotNull() {
        assertNotNull(okno.getTitle(), "Tytuł okna nie może być null");
    }

    @Test
    void testWindowTitleIsNotEmpty() {
        assertFalse(okno.getTitle().trim().isEmpty(), "Tytuł okna nie może być pusty");
    }

    @Test
    void testWindowTitleMatchesExpected() {
        assertEquals("--------- test border -------", okno.getTitle());
    }

    @Test
    void testWindowIconIsPresent() {
        assertNotNull(okno.getIconImage(), "Ikona okna (setIconImage) powinna być ustawiona");
    }
}