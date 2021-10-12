package Assignment1;

public class EkspresGram2 extends PosEkspres {
    private double price;

    public double getPrice() {
        setPrice();
        return price;
    }

    public void setPrice() {
        this.price = gram2Price();
    }

    public double gram2Price() {
        price = 3.71;
        return price;
    }
}