package annasUppgift2;

import java.util.Scanner;

public class LogicClass2 {
    String logikInput;

    // Konstruktor med tom sträng
    public LogicClass2() {
        logikInput = "";
    }
    // Konstruktor med en sträng logikInput
    public LogicClass2(String input) {
        logikInput = input;
    }

    // Metod som och sparar i logikInput
    public int saveTextInput(Scanner scanner) {
        int lineCount = 0;
        StringBuilder input = new StringBuilder();
        System.out.println("Skriv in text och skriv stopp för att avsluta):");

        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            if (line.equalsIgnoreCase("stopp")) {
                System.out.println("Programmet avslutas.");
                break;
            }
            input.append(line).append("\n");
            lineCount++;
        }

        logikInput = input.toString();
        return lineCount;
    }

    // Metod som räknar antal rader
    public int countLines() {
        if (logikInput == null || logikInput.isEmpty()) {
            return 0;
        }
        String[] lines = logikInput.split("\r\n|\r|\n");
        return lines.length;
    }

    // Metod som räknar antal tecken exklusive mellanslag i logikInput
    public int countCharacters() {
        int count = 0;
        for (int i = 0; i < logikInput.length(); i++) {
            if (logikInput.charAt(i) != ' ') {
                count++;
            }
        }
        return count;
    }
}


