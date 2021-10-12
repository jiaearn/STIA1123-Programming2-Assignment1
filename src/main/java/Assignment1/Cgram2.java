package Assignment1;

public class Cgram2 extends CrossPrice {
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
        double doCharge2 = 5.40;
        double surCharge2 = 7.50;
        price = (doCharge2 + 1.0) + surCharge2;
        return price;
    }
}
