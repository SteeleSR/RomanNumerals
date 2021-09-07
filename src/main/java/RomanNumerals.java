public class RomanNumerals {
    public String convert(int amount) {
        String romanNumeral = "";
            for(Numerals numeral : Numerals.values()) {
                while (amount >= numeral.decimal) {
                    romanNumeral += numeral;
                    amount -= numeral.decimal;
                }
            }
        return romanNumeral;
    }
}
