public class RomanNumerals {
    public String convert(int amount) {

        String romanNumeral = "";

        while (amount > 0) {

            for(Numerals numeral : Numerals.values()) {
                if (amount >= numeral.decimal) {
                romanNumeral += numeral;
                amount -= numeral.decimal;
            }
            }
        }
        return romanNumeral;
    }

    enum Numerals {
        L(50),
        X(10),
        V(5),
        I(1);

        private int decimal;

        Numerals(int decimal) {
            this.decimal = decimal;
        }
    }
}
