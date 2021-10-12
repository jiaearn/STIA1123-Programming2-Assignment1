package Assignment1;

public class PrepaidBEnvelope extends CalculatePrice {
    private static double[] price = new double[100];
    private static double totalPrice3;

    public static double getTotalPrice3() {
        return totalPrice3;
    }

    public void calculatePrice(int count) {
        int choice;
        do {
            System.out.println("Do you want Prepaid Box & Envelope?" + "\n" + "1 Yes" + "\n" + "2 No");
            choice = sc.nextInt();
        } while (!validChoice(choice));
        if (choice == 1) {
            showTable();
            processPrice(count);
        }
    }

    public boolean validChoice(int choice) {
        if (choice == 1 || choice == 2) {
            return true;
        } else {
            System.out.println("Please enter valid choice 1 or 2.");
            return false;
        }
    }

    public void showTable() {
        String format1 = "%-15s%-20s%-20s%-25s%-25s%-25s\n";
        System.out.printf("%80s\n\n", "Menu of Prepaid Box & Envelope");
        System.out.printf("-------------------------------------------------------------------------------------------------------------------------------%n");
        System.out.printf(format1, "Type", "Envelope S (ES)", "Envelope L (EL)", "Prepaid Box S (PBS)", "Prepaid Box M (PBM)", "Prepaid Box L (PBL)");
        System.out.printf("-------------------------------------------------------------------------------------------------------------------------------%n");
        System.out.printf(format1, "Size", "280mm x 200mm", "380mm x 320mm", "380mm x 250mm x 80mm", "340mm x 250mm x 150mm", "380mm x 320mm x 200mm");
        System.out.printf(format1, "Max Weight", "0 - 0.50Kg", "0.51 - 1.00Kg", "1.01 - 2.00Kg", "2.01 - 5Kg", "5.01 - 10Kg");
        System.out.printf(format1, "Price", "RM 7.31", "RM 10.49", "RM 13.78", "RM 21.20", "RM 31.80");
        System.out.printf("-------------------------------------------------------------------------------------------------------------------------------%n%n");
    }

    public boolean validWeight(double kg) {
        if (kg > 0 && kg <= 10) {
            return true;
        } else {
            System.out.println("Please enter valid weight below 10KG.");
            return false;
        }
    }

    public void processPrice(int count) {
        double kg;

        System.out.println("How many Prepaid Box & Envelope you want to buy?");
        int size = sc.nextInt();
        for (int i = 0; i < size; i++) {
            do {
                System.out.print("\nPos " + (count + 1) + ":");
                System.out.println();
                System.out.print("Please enter weight(kg): ");
                kg = sc.nextDouble();
            } while (!validWeight(kg));
            System.out.print("Please enter quantity: ");
            int quantity = sc.nextInt();
            EnvelopeKg1 envelopeKg1 = new EnvelopeKg1();
            EnvelopeKg2 envelopeKg2 = new EnvelopeKg2();
            EnvelopeKg3 envelopeKg3 = new EnvelopeKg3();
            EnvelopeKg4 envelopeKg4 = new EnvelopeKg4();
            EnvelopeKg5 envelopeKg5 = new EnvelopeKg5();
            if (kg >= 0 && kg <= 0.5) {
                price[count] = envelopeKg1.getPrice() * quantity;
            } else if (kg > 0.5 && kg <= 1) {
                price[count] = envelopeKg2.getPrice() * quantity;
            } else if (kg > 1 && kg <= 2) {
                price[count] = envelopeKg3.getPrice() * quantity;
            } else if (kg > 2 && kg <= 5) {
                price[count] = envelopeKg4.getPrice() * quantity;
            } else if (kg > 5 && kg <= 10) {
                price[count] = envelopeKg5.getPrice() * quantity;
            }
            totalPrice3 += price[count];
            count++;
        }
        display(count, price);
        loopProgram(count);
    }

    public void loopProgram(int count) {
        System.out.println("\nDo you need another Prepaid Box & Envelope?");
        System.out.println("1. Yes");
        System.out.println("2. No");
        int choice = sc.nextInt();
        if (choice == 1) {
            processPrice(count);
        } else if (choice == 2) {
            System.out.printf("Total Prepaid Box & Envelope Price: RM" + "%.2f\n\n", totalPrice3);
        } else {
            System.out.println("Invalid. Please enter 1 or 2");
            loopProgram(count);
        }
    }

    public void display(int count, double[] price) {
        double totalThis = 0;
        System.out.println();
        for (int i = 0; i < count; i++) {
            System.out.printf("%s%s%.2f%n", "For the price of pos ", (i + 1) + " is ", price[i]);
            totalThis += price[i];
        }
        System.out.printf("%s%.2f%n", "This time Pos Ekspres Price: RM", totalThis);
    }
}