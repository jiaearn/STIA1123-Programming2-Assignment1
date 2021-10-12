package Assignment1;

public class PosEkspres extends CalculatePrice {
    private static double[] price = new double[100];
    private static double totalPrice4;

    public static double getTotalPrice4() {
        return totalPrice4;
    }

    public void calculatePrice(int count) {
        int choice;
        do {
            System.out.println("Do you want Pos Ekspres?" + "\n" + "1 Yes" + "\n" + "2 No");
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
        String format1 = "%-15s%-20s%-20s%-25s%-25s\n";
        System.out.printf("%55s\n\n", "Menu of Pos Ekspres");
        System.out.printf("-----------------------------------------------------------------------------------------------%n");
        System.out.printf(format1, "Type", "LG", "LE(C5)", "LD(B4)", "LK");
        System.out.printf("-----------------------------------------------------------------------------------------------%n");
        System.out.printf(format1, "Size", "220mm x 110mm", "229mm x 162mm", "353mm x 250mm", "340mm x 250mm");
        System.out.printf(format1, "Max Weight", "100gm", "250gm", "500gm", "1000gm");
        System.out.printf(format1, "Max Thickness", "3mm", "5mm", "10mm", "25mm");
        System.out.printf(format1, "Price ", "RM 3.18", "RM 3.71", "RM 4.77", "RM 7.42");
        System.out.printf("-----------------------------------------------------------------------------------------------%n%n");
    }

    public boolean validWeight(double gram) {
        if (gram > 0 && gram <= 1000) {
            return true;
        } else {
            System.out.println("Please enter valid weight below 1000gram.");
            return false;
        }
    }

    public void processPrice(int count) {
        double gram;

        System.out.println("How many Pos Ekspres you want to buy?");
        int size = sc.nextInt();
        for (int i = 0; i < size; i++) {
            do {
                System.out.print("\nPos " + (count + 1) + ":");
                System.out.println();
                System.out.print("Please enter weight(mg): ");
                gram = sc.nextInt();
            } while (!validWeight(gram));
            System.out.print("Please enter quantity: ");
            int quantity = sc.nextInt();
            EkspresGram1 ekspresGram1 = new EkspresGram1();
            EkspresGram2 ekspresGram2 = new EkspresGram2();
            EkspresGram3 ekspresGram3 = new EkspresGram3();
            EkspresGram4 ekspresGram4 = new EkspresGram4();
            if (gram > 0 && gram <= 100) {
                price[count] = ekspresGram1.getPrice() * quantity;
            } else if (gram > 100 && gram <= 250) {
                price[count] = ekspresGram2.getPrice() * quantity;
            } else if (gram > 250 && gram <= 500) {
                price[count] = ekspresGram3.getPrice() * quantity;
            } else if (gram > 500 && gram <= 1000) {
                price[count] = ekspresGram4.getPrice() * quantity;
            }
            totalPrice4 += price[count];
            count++;
        }
        display(count, price);
        loopProgram(count);
    }

    public void loopProgram(int count) {
        System.out.println("\nDo you need another Pos Ekspres Delivery?");
        System.out.println("1. Yes");
        System.out.println("2. No");
        int choice = sc.nextInt();
        if (choice == 1) {
            processPrice(count);
        } else if (choice == 2) {
            System.out.printf("Total Pos Ekspres Price: RM" + "%.2f\n\n", totalPrice4);
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