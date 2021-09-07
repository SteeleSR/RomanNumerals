import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RomanNumeralsTest {

    @Test
    public void shouldReturnIWhenGiven1() {
        RomanNumerals romanNumerals = new RomanNumerals();
        assertEquals("I", romanNumerals.convert(1));
    }

    @Test
    public void shouldReturnIIWhenGiven2() {
        RomanNumerals romanNumerals = new RomanNumerals();
        assertEquals("II", romanNumerals.convert(2));
    }

    @Test
    public void shouldReturnIIIWhenGiven3() {
        RomanNumerals romanNumerals = new RomanNumerals();
        assertEquals("III", romanNumerals.convert(3));
    }

    @Test
    public void shouldReturnVWhenGiven5() {
        RomanNumerals romanNumerals = new RomanNumerals();
        assertEquals("V", romanNumerals.convert(5));
    }

    @Test
    public void shouldReturnVIWhenGiven6() {
        RomanNumerals romanNumerals = new RomanNumerals();
        assertEquals("VI", romanNumerals.convert(6));
    }

    @Test
    public void shouldReturnXWhenGiven10() {
        RomanNumerals romanNumerals = new RomanNumerals();
        assertEquals("X", romanNumerals.convert(10));
    }

    @Test
    public void shouldReturnXIWhenGiven11() {
        RomanNumerals romanNumerals = new RomanNumerals();
        assertEquals("XI", romanNumerals.convert(11));
    }

    @Test
    public void shouldReturnLWhenGiven50() {
        RomanNumerals romanNumerals = new RomanNumerals();
        assertEquals("L", romanNumerals.convert(50));
    }
}
