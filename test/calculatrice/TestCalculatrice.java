package calculatrice;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class TestCalculatrice {

    @Test
    public void testAddition() {
        Calculatrice calc = new Calculatrice();
        assertEquals(5, calc.Addition(2, 3));
    }

    @Test
    public void testSoustraction() {
        Calculatrice calc = new Calculatrice();
        assertEquals(1, calc.Soustraction(5, 4));
        assertEquals(-3, calc.Soustraction(2, 5));
    }

    @Test
    public void testMultiplication() {
        Calculatrice calc = new Calculatrice();
        assertEquals(12, calc.Multiplication(3, 4));
        assertEquals(0, calc.Multiplication(0, 5));
    }

    @Test
    public void testDivision() {
        Calculatrice calc = new Calculatrice();
        assertEquals(2, calc.Division(8, 4));
    }

    @Test
    public void testDivisionParZero() {
        Calculatrice calc = new Calculatrice();
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            calc.Division(4, 0);
        });
        assertEquals("Division par zéro !", exception.getMessage());
    }
}
