package Assignment1;

public class Parcel extends NextDayDelivery {
    int zone;
    double kg;
    private double price;

    public double getPrice() {
        setPrice();
        return price;
    }

    public void setPrice() {
        this.price = parcelPrice();
    }

    public void parcel(int zone) {
        switch (zone) {
            case 1:
                parcel(10.50, 0.50);
                break;
            case 2:
                parcel(16.00, 2.00);
                break;
            case 3:
                parcel(21.00, 3.00);
                break;
            case 4:
                parcel(26.00, 3.50);
                break;
            case 5:
                parcel(31.00, 4.00);
                break;
        }
    }

    public void parcel(double fpPrice, double spPrice) {
        double totalspPrice;
        int j;
        do {
            System.out.println("Enter the parcel's weight in kg: ");
            kg = sc.nextDouble();
        } while (!validWeight(kg));
        if (kg >= 2 && kg <= 2.5) {
            totalspPrice = 0;
        } else {
            if ((kg - 2.5) % 0.5 == 0) {
                j = (int) ((kg - 2.5) / 0.5);
                totalspPrice = j * spPrice;

            } else {
                j = (int) ((kg - 2.5) / 0.5);
                totalspPrice = (j + 1) * spPrice;
            }
        }
        price = fpPrice + totalspPrice;
        System.out.printf("Your Next-Day Delivery for parcel is RM %.2f%n", price);
    }

    public boolean validWeight(double kg) {
        if (kg >= 2.001) {
            return true;
        } else {
            System.out.println("Please enter valid parcel's weight above 2.001kg.");
            return false;
        }
    }

    public boolean validZone(int zone) {
        if (zone >= 1 && zone <= 5) {
            return true;
        } else {
            System.out.println("Please enter valid zone within 1-5.");
            return false;
        }
    }

    public double parcelPrice() {
        do {
            System.out.println("Enter your parcel's zone:" + "\n" + "1 Zone 1" + "\n" + "2 Zone 2" + "\n" + "3 Zone 3" + "\n" + "4 Zone 4" + "\n" + "5 Zone 5");
            zone = sc.nextInt();
            parcel(zone);
        } while (!validZone(zone));
        return price;
    }
}
