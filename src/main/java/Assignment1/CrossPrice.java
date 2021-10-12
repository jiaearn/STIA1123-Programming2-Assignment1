package Assignment1;

public class CrossPrice extends SameDayDelivery {
    private double price;

    public double getPrice() {
        setPrice();
        return price;
    }

    public void setPrice() {
        this.price = crossPrice();
    }

    public boolean validWeight(int gram) {
        if (gram > 0 && gram <= 1000) {
            return true;
        } else {
            System.out.println("Please enter valid below 1000gram.");
            return false;
        }
    }

    public double crossPrice() {
        int gram;

        do {
            System.out.println("What is your shipment weight(gm)?");
            gram = sc.nextInt();
        } while (!validWeight(gram));
        System.out.print("Please enter quantity: ");
        int quantity = sc.nextInt();

        Cgram1 cgram1 = new Cgram1();
        Cgram2 cgram2 = new Cgram2();
        Cgram3 cgram3 = new Cgram3();

        if (gram > 0 && gram < 500) {
            price = cgram1.getPrice() * quantity;
        } else if (gram >= 500 && gram < 750) {
            price = cgram2.getPrice() * quantity;
        } else if (gram >= 750 && gram <= 1000) {
            price = cgram3.getPrice() * quantity;
        }
        return price;
    }
}