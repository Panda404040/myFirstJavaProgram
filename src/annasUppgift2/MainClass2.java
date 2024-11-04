package annasUppgift2;

import java.util.Scanner;

public class MainClass2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LogicClass2 lc = new LogicClass2();


        int totalLineUserInput = lc.saveTextInput(scanner);
        System.out.println("Totalt antal rader: " + totalLineUserInput);

        System.out.println("Antal rader: " + lc.countLines());
        System.out.println("Antal tecken (exklusive mellanslag): " + lc.countCharacters());

        scanner.close();
    }
}
