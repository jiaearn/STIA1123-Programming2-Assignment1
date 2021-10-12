package Assignment1;

public class EkspresGram1 extends PosEkspres {
    private double price;

    public double getPrice() {
        setPrice();
        return price;
    }

    public void setPrice() {
        this.price = gram1Price();
    }

    public double gram1Price() {
        price = 3.18;
        return price;
    }
}