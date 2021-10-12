package Assignment1;

public class NextDayDelivery extends CalculatePrice {
    private static double[] price = new double[100];
    private static double totalPrice;

    public static double getTotalPrice() {
        return totalPrice;
    }

    public void calculatePrice(int count) {
        int choice;
        do {
            System.out.println("Do you want NextDay Delivery?" + "\n" + "1 Yes" + "\n" + "2 No");
            choice = sc.nextInt();
        } while (!validChoice(choice));
        if (choice == 1) {
            showTable();
            processPrice(count);
        }
    }

    public boolean validType(int type) {
        if (type == 1 || type == 2) {
            return true;
        } else {
            System.out.println("Please enter valid type 1 or 2.\n");
            return false;
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
        String format1 = "%35s%50s%n";
        String format2 = "%20s%25s%25s%25s%n";
        String format3 = "%-10s%7s%23s%26s%22s%n";
        System.out.printf("%60s\n\n", "Menu of NextDay Delivery");
        System.out.printf("------------------------------------------------------------------------------------------------%n");
        System.out.printf(format1, "Document(below 2kg)", "Parcel(above 2kg)");
        System.out.printf("------------------------------------------------------------------------------------------------%n");
        System.out.printf(format2, "First 500gm", "Subsequent 250gm", "2.001-2.5kg", "Subsequent 500gm");
        System.out.printf("------------------------------------------------------------------------------------------------%n");
        System.out.printf(format3, "Zone 1", "4.90", "0.80", "10.50", "0.50");
        System.out.printf(format3, "Zone 2", "5.40", "1.00", "16.00", "2.00");
        System.out.printf(format3, "Zone 3", "6.90", "1.50", "21.00", "3.00");
        System.out.printf(format3, "Zone 4", "7.40", "1.50", "26.00", "3.50");
        System.out.printf(format3, "Zone 5", "7.90", "2.00", "31.00", "4.00");
        System.out.printf("------------------------------------------------------------------------------------------------%n");
        System.out.println("Category each zone:");
        System.out.println("Zone 1: City");
        System.out.println("Zone 2: In Peninsular Malaysia, Sarawak and Sabah");
        System.out.println("Zone 3: Between Sabah and Sarawak");
        System.out.println("Zone 4: Between Peninsular Malaysia and Sarawak");
        System.out.println("Zone 5: Between Peninsular Malaysia and Sabah");
        System.out.printf("------------------------------------------------------------------------------------------------%n%n");

    }

    public void processPrice(int count) {
        int type;

        System.out.println("How many NextDay Delivery you want to buy?");
        int size = sc.nextInt();
        for (int i = 0; i < size; i++) {
            do {
                System.out.print("\nPos " + (count + 1) + ":");
                System.out.println();
                System.out.println("Enter your package type:" + "\n" + "1 Document(below 2kg)" + "\n" + "2 Parcel(above 2kg)");
                type = sc.nextInt();
            } while (!validType(type));

            Document document = new Document();
            Parcel parcel = new Parcel();
            if (type == 1) {
                price[count] = document.getPrice();
            } else if (type == 2) {
                price[count] = parcel.getPrice();
            }
            totalPrice += price[count];
            count++;
        }
        display(count, price);
        loopProgram(count);
    }

    public void loopProgram(int count) {
        System.out.println("\nDo you need another Next-Day Delivery?");
        System.out.println("1. Yes");
        System.out.println("2. No");
        int choice = sc.nextInt();

        if (choice == 1) {
            processPrice(count);
        } else if (choice == 2) {
            System.out.printf("Total Next-Day Delivery Price: RM" + "%.2f\n\n", totalPrice);
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
        System.out.printf("%s%.2f%n", "This time Next-Day Delivery Price: RM", totalThis);

    }
}