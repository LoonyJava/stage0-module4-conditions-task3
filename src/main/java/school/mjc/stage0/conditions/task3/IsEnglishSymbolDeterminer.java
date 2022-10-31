package school.mjc.stage0.conditions.task3;

public class IsEnglishSymbolDeterminer {
    public void isEnglishSymbol(char symbol) {
        if (symbol == 'a' || symbol == 'A' || symbol == 'b' || symbol == 'B' || symbol == 'c' || symbol == 'C' || symbol == 'd' || symbol == 'D' || symbol == 'e'
                || symbol == 'E' || symbol == 'f' || symbol == 'F' || symbol == 'g' || symbol == 'G' || symbol == 'h' || symbol == 'H' || symbol == 'i' ||
                symbol == 'I' || symbol == 'j' || symbol == 'J' || symbol == 'k' || symbol == 'K' || symbol == 'l' || symbol == 'L' || symbol == 'm' ||
                symbol == 'M' || symbol == 'n' || symbol == 'N' || symbol == 'o' || symbol == 'O' || symbol == 'p' || symbol == 'P' || symbol == 'q' ||
                symbol == 'Q' || symbol == 'r' || symbol == 'R' || symbol == 's' || symbol == 'S' || symbol == 't' || symbol == 'T' || symbol == 'u' || symbol == 'U' ||
                symbol == 'v' || symbol == 'V' || symbol == 'w' || symbol == 'W' || symbol == 'x' || symbol == 'X' || symbol == 'y' || symbol == 'Y' || symbol == 'z' ||
                symbol == 'Z') {
            System.out.println("English");
        } else System.out.println("Non English");
    }
}
