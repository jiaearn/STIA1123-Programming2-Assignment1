package Assignment1;

import java.util.Scanner;

public class CalculatePrice extends Main {
    static Scanner sc = new Scanner(System.in);
    int count;

    public void showMainMenu() {
        System.out.println("\nWelcome to Pos Laju Malaysia.");
        System.out.println("~~~~~~~~~~Main Menu~~~~~~~~~~");
        System.out.println("1. Next-Day Delivery");
        System.out.println("2. Same-Day Delivery");
        System.out.println("3. Prepaid Box & Envelope");
        System.out.println("4. Pos Ekspres");
        System.out.println("5. Receipt");
        System.out.println("0. Quit");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }

    public void processPrice(String myFormat) {
        int choice = -1;
        while (choice != 0) {
            showMainMenu();
            System.out.print("Please enter your choice: ");
            choice = sc.nextInt();

            while (choice < 0 || choice > 5) {
                System.out.println("Invalid selection");
                System.out.print("Please enter your choice: ");
                choice = sc.nextInt();
            }

            if (choice == 1) {
                NextDayDelivery nextDayDelivery = new NextDayDelivery();
                nextDayDelivery.calculatePrice(count);
            } else if (choice == 2) {
                SameDayDelivery sameDayDelivery = new SameDayDelivery();
                sameDayDelivery.calculatePrice(count);
            } else if (choice == 3) {
                PrepaidBEnvelope prepaidBEnvelope = new PrepaidBEnvelope();
                prepaidBEnvelope.calculatePrice(count);
            } else if (choice == 4) {
                PosEkspres posEkspres = new PosEkspres();
                posEkspres.calculatePrice(count);
            } else if (choice == 5) {
                Receipt receipt = new Receipt();
                receipt.displayReceipt(myFormat);
            }
        }
        System.out.println("Thank You and Bye.");
    }
}
