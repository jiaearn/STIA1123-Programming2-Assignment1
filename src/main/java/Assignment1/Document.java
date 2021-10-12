package Assignment1;

public class Document extends NextDayDelivery {
    int zone;
    double gram;
    private double price;

    public double getPrice() {
        setPrice();
        return price;
    }

    public void setPrice() {
        this.price = documentPrice();
    }

    public void document(int zone) {
        switch (zone) {
            case 1:
                document(4.90, 0.80);
                break;
            case 2:
                document(5.40, 1.00);
                break;
            case 3:
                document(6.90, 1.50);
                break;
            case 4:
                document(7.40, 1.50);
                break;
            case 5:
                document(7.90, 2.00);
                break;
        }
    }

    public void document(double fdPrice, double sdPrice) {
        double totalsdPrice;
        int i;
        do {
            System.out.println("Enter the document's weight in g: ");
            gram = sc.nextInt();
        } while (!validGram(gram));
        if (gram <= 500) {
            totalsdPrice = 0;
        } else {
            if (((gram / 1000) - 0.5) % 0.25 == 0) {
                i = (int) ((gram / 1000 - 0.5) / 0.25);
                totalsdPrice = i * sdPrice;
            } else {
                i = (int) ((gram / 1000 - 0.5) / 0.25);
                totalsdPrice = (i + 1) * sdPrice;
            }
        }
        price = fdPrice + totalsdPrice;
        System.out.printf("Your Next-Day Delivery for document is RM %.2f%n", price);
    }

    public boolean validZone(int zone) {
        if (zone >= 1 && zone <= 5) {
            return true;
        } else {
            System.out.println("Please enter valid zone within 1-5.");
            return false;
        }
    }

    public static boolean validGram(double gram) {
        if (gram > 0 && gram <= 2000) {
            return true;
        } else {
            System.out.println("Please enter valid document's weight below 2000gram.");
            return false;
        }
    }

    public double documentPrice() {
        do {
            System.out.println("Enter your parcel's zone:" + "\n" + "1 Zone 1" + "\n" + "2 Zone 2" + "\n" + "3 Zone 3" + "\n" + "4 Zone 4" + "\n" + "5 Zone 5");
            zone = sc.nextInt();
            document(zone);
        } while (!validZone(zone));
        return price;
    }
}
