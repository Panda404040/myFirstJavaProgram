package annasUppgift2;

import static org.junit.jupiter.api.Assertions.assertEquals;

import annasUppgift1.LogicClass;
import org.junit.jupiter.api.Test;

import java.util.Scanner;

public class LogicClass2Test {

    @Test
    void testCountLines() {
        // Arrange
        String input = "Hello\nusers!\n";
        LogicClass2 lc = new LogicClass2(input);
        int expectedLineCount = 2;

        // Act
        int actualLineCount = lc.countLines();

        // Assert
        assertEquals(expectedLineCount, actualLineCount, "Räknar rader korrekt.");
    }


    @Test
    void testCountCharacters() {
        // Arrange
        String input = "Hi user!";
        LogicClass2 lc = new LogicClass2(input);
        int expectedCharacterCount = 7;

        // Act
        int actualCharacterCount = lc.countCharacters();

        // Assert
        assertEquals(expectedCharacterCount, actualCharacterCount, "Räknar tecken korrekt exklusive mellanslag.");
    }
    @Test
    void testCountEmptyLines() {
        //Arrange
        String input = "\n\n\n\n";
        LogicClass2 logicClass2 = new LogicClass2(input);
        int expectedLineCount = 0;
        //Act
        int actualLineCount = logicClass2.countLines();
        //Assert
        assertEquals(expectedLineCount, actualLineCount, "Räknar tomma rader");

    }


}







