package school.mjc.stage0.conditions.task3;

public class AlphabeticCharacters {
    public void vowelDeterminer(char character) {
        if (character == 'a' || character == 'A' || character == 'e' || character == 'E' || character == 'i' || character == 'I' ||
                character == 'o' || character == 'O' || character == 'u' || character == 'U' || character == 'y' || character == 'Y') {
            System.out.println("Vowel");
        } else if (character == 'b' || character == 'B' || character == 'c' || character == 'C' || character == 'd' || character == 'D' ||
                character == 'f' || character == 'F' || character == 'g' || character == 'G' || character == 'h' || character == 'H' ||
                character == 'j' || character == 'J' || character == 'k' || character == 'K' || character == 'l' || character == 'L' ||
                character == 'm' || character == 'M' || character == 'n' || character == 'N' || character == 'p' || character == 'P' ||
                character == 'q' || character == 'Q' || character == 'r' || character == 'R' || character == 's' || character == 'S' ||
                character == 't' || character == 'T' || character == 'v' || character == 'V' || character == 'w' || character == 'W' ||
                character == 'x' || character == 'X' || character == 'z' || character == 'Z') {
            System.out.println("Consonant");
        } else System.out.println("wrong alphabet!");
    }
}
