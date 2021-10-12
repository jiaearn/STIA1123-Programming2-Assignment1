package Assignment1;

public class Lgram3 extends LocalPrice {
    private double price;

    @Override
    public double getPrice() {
        setPrice();
        return price;
    }

    public void setPrice() {
        this.price = gram1Price();
    }

    public double gram1Price() {
        double doCharge = 4.90;
        double surCharge = 6.00;
        price = (doCharge + 1.6) + surCharge;
        return price;
    }
}