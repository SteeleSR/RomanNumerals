public class RomanNumerals {
    public String convert(int amount) {

        String romanNumeral = "";

        while (amount > 0) {
            if (amount >= 50) {
                romanNumeral += "L";
                amount -= 50;
                continue;
            }
            if (amount >= 10) {
                romanNumeral += "X";
                amount -= 10;
                continue;
            }
            if (amount >= 5) {
                romanNumeral += "V";
                amount -= 5;
                continue;
            }
            romanNumeral += "I";
            amount -= 1;
        }
        return romanNumeral;
    }
}
