import org.junit.Test;
import static org.junit.Assert.*;

public class TextChecker {

    @Test
    public void textobien() {
        TextChecker t = new TextChecker("Hola mundo");
        assertTrue(t.isCorrect());
        assertEquals(0, t.numberOfErrors());
    }

    @Test
    public void textodobleespacio() {
        TextChecker t = new TextChecker("Hola  mundo");
        assertFalse(t.isCorrect());
        assertEquals(1, t.numberOfErrors());
    }

    @Test
    public void textoespaciofinal() {
        TextChecker t = new TextChecker("Hola mundo ");
        assertFalse(t.isCorrect());
        assertEquals(1, t.numberOfErrors());
    }

    @Test
    public void textodobleespacioYespaciofinal() {
        TextChecker t = new TextChecker("Hola  mundo  ");
        assertFalse(t.isCorrect());
        assertEquals(2, t.numberOfErrors());
    }

    @Test
    public void textotresespacio() {
        TextChecker t = new TextChecker("Hola   mundo");
        assertFalse(t.isCorrect());
        assertEquals(1, t.numberOfErrors());
    }
}
