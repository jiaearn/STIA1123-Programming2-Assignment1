package Assignment1;

public class LocalPrice extends SameDayDelivery {
    private double price;

    public double getPrice() {
        setPrice();
        return price;
    }

    public void setPrice() {
        this.price = townPrice();
    }

    public boolean validWeight(int gram) {
        if (gram > 0 && gram <= 1000) {
            return true;
        } else {
            System.out.println("Please enter valid below 1000gram.");
            return false;
        }
    }

    public double townPrice() {
        int gram;
        do {
            System.out.println("What is your shipment weight(gm)?");
            gram = sc.nextInt();
        } while (!validWeight(gram));
        System.out.print("Please enter quantity: ");
        int quantity = sc.nextInt();
        Lgram1 lgram1 = new Lgram1();
        Lgram2 lgram2 = new Lgram2();
        Lgram3 lgram3 = new Lgram3();
        if (gram >= 0 && gram < 500) {
            price = lgram1.getPrice() * quantity;
        } else if (gram >= 500 && gram < 750) {
            price = lgram2.getPrice() * quantity;
        } else if (gram >= 750 && gram <= 1000) {
            price = lgram3.getPrice() * quantity;
        }
        return price;
    }
}

