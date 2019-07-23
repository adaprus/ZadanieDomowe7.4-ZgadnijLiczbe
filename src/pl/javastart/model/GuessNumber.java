package pl.javastart.model;

import java.util.Scanner;

public class GuessNumber {

    public void getNumber(Scanner scanner) {
        int number;

        do {
            System.out.println("Podaj liczbę: ");
            number = scanner.nextInt();
            scanner.nextLine();

            if (number < 100) {
                System.out.println("Twoja liczba jest za mała");
            } else if (number > 200) {
                System.out.println("Twoja liczba jest za duża");
            } else if (number % 3 != 0) {
                System.out.println("Twoja liczba nie jest podzielna przez 3");
            } else {
                System.out.println("Twoja liczba jest dobra");
            }
        } while (!((number <= 200 && number >= 100) && number % 3 == 0));
    }
}
