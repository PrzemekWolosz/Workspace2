import java.util.Scanner;

// 2:07:45

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean shouldConitnue = true;

        Party party = new Party();

        while (shouldConitnue) {
            System.out.println("Wybierz opcję");
            System.out.println("1. Wyświetl gości");
            System.out.println("2. Dodaj gościa");
            System.out.println("3. Wyświetl potrawy");
            System.out.println("4. Znajdź po numerze telefonu");
            System.out.println("5. Wyjście");

            int userChoice = scanner.nextInt();

            switch (userChoice) {
                case 1:
                    party.displayGuests();
                    break;
                case 2:
                    party.addGuest();
                    break;
                case 3:
                    System.out.println("wybrano 3");
                    break;
                case 4:
                    System.out.println("wybrano 4");
                    break;
                case 5:
                    shouldConitnue = false;
                    break;
            }
        }
    }
}
