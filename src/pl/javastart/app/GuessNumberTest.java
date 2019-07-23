package pl.javastart.app;

import pl.javastart.model.GuessNumber;

import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GuessNumber gues = new GuessNumber();
        gues.getNumber(scanner);

        scanner.close();

    }
}
