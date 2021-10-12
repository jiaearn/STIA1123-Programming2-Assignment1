package Assignment1;

public class SameDayDelivery extends CalculatePrice {

    private static double[] price = new double[100];
    private static double totalPrice2;

    public static double getTotalPrice2() {
        return totalPrice2;
    }

    public void calculatePrice(int count) {
        int choice;
        do {
            System.out.println("Do you want SameDay Delivery?" + "\n" + "1 Yes" + "\n" + "2 No");
            choice = sc.nextInt();
        } while (!validChoice(choice));
        if (choice == 1) {
            showTable();
            processPrice(count);
        }
    }

    public boolean validTown(int town) {
        if (town == 1 || town == 2) {
            return true;
        } else {
            System.out.println("Please enter valid town 1 or 2.\n");
            return false;
        }
    }

    public boolean validChoice(int choice) {
        if (choice == 1 || choice == 2) {
            return true;
        } else {
            System.out.println("Please enter valid choice 1 or 2\n");
            return false;
        }
    }

    public void showTable() {
        String myFormat = "%-12s%17s%17s%17s%17s%17s%17s\n";
        System.out.printf("%80s\n\n", "Menu of SameDay Delivery");
        System.out.printf("--------------------------------------------------------------------------------------------------------------------------%n");
        System.out.printf("%8s%45s%45s\n", "WEIGHT", "LOCAL TOWN", "CROSS TOWN");
        System.out.printf("--------------------------------------------------------------------------------------------------------------------------%n");
        System.out.printf(myFormat, "", "Domestic Charge", "Surcharge", "Total", "Domestic Charge", "Surcharge", "Total");
        System.out.printf("--------------------------------------------------------------------------------------------------------------------------%n");
        System.out.printf(myFormat, "Below 500gm", "4.90", "6.00", "10.90", "5.40", "7.50", "12.90");
        System.out.printf(myFormat, "500gm-750gm", "5.70", "6.00", "11.70", "6.40", "7.50", "13.90");
        System.out.printf(myFormat, "750gm-1kg", "6.50", "6.00", "12.50", "7.40", "7.50", "14.90");
        System.out.printf("--------------------------------------------------------------------------------------------------------------------------%n%n");
    }

    public void processPrice(int count) {
        int town;

        System.out.println("How many Same Delivery you want to buy?");
        int size = sc.nextInt();
        for (int i = 0; i < size; i++) {
            do {
                System.out.print("\nPos " + (count + 1) + ":");
                System.out.println();
                System.out.println("Which town you want to delivery?");
                System.out.println("1. Local Town");
                System.out.println("2. Cross Town");
                town = sc.nextInt();
            } while (!validTown(town));

            LocalPrice localPrice = new LocalPrice();
            CrossPrice crossPrice = new CrossPrice();
            if (town == 1) {
                price[count] = localPrice.getPrice();
            } else if (town == 2) {
                price[count] = crossPrice.getPrice();
            }
            totalPrice2 += price[count];
            count++;
        }
        display(count, price);
        loopProgram(count);
    }

    public void loopProgram(int count) {
        System.out.println("\nDo you need another Same-Day Delivery?");
        System.out.println("1. Yes");
        System.out.println("2. No");
        int choice = sc.nextInt();
        if (choice == 1) {
            processPrice(count);
        } else if (choice == 2) {
            System.out.printf("Total Same-Day Delivery Price: RM" + "%.2f\n\n", totalPrice2);
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
        System.out.printf("%s%.2f%n", "This time Same-Day Delivery Price: RM", totalThis);
    }
}