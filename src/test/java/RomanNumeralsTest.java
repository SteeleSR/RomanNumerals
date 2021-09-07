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

    @Test
    public void shouldReturnCWhenGiven100() {
        RomanNumerals romanNumerals = new RomanNumerals();
        assertEquals("C", romanNumerals.convert(100));
    }

    @Test
    public void shouldReturnDWhenGiven500() {
        RomanNumerals romanNumerals = new RomanNumerals();
        assertEquals("D", romanNumerals.convert(500));
    }

    @Test
    public void shouldReturnMWhenGiven1000() {
        RomanNumerals romanNumerals = new RomanNumerals();
        assertEquals("M", romanNumerals.convert(1000));
    }

    @Test
    public void shouldReturnIVWhenGiven4() {
        RomanNumerals romanNumerals = new RomanNumerals();
        assertEquals("IV", romanNumerals.convert(4));
    }

    @Test
    public void shouldReturnIXWhenGiven9() {
        RomanNumerals romanNumerals = new RomanNumerals();
        assertEquals("IX", romanNumerals.convert(9));
    }

    @Test
    public void shouldReturnXLWhenGiven40() {
        RomanNumerals romanNumerals = new RomanNumerals();
        assertEquals("XL", romanNumerals.convert(40));
    }

    @Test
    public void shouldReturnXCWhenGiven90() {
        RomanNumerals romanNumerals = new RomanNumerals();
        assertEquals("XC", romanNumerals.convert(90));
    }

    @Test
    public void shouldReturnCDWhenGiven400() {
        RomanNumerals romanNumerals = new RomanNumerals();
        assertEquals("CD", romanNumerals.convert(400));
    }

    @Test
    public void shouldReturnCMWhenGiven900() {
        RomanNumerals romanNumerals = new RomanNumerals();
        assertEquals("CM", romanNumerals.convert(900));
    }

    @Test
    public void shouldReturnMMMCDLIWhenGiven3451() {
        RomanNumerals romanNumerals = new RomanNumerals();
        assertEquals("MMMCDLI", romanNumerals.convert(3451));
    }
}
