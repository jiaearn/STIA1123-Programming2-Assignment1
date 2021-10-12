package Assignment1;

public class EkspresGram4 extends PosEkspres {
    private double price;

    public double getPrice() {
        setPrice();
        return price;
    }

    public void setPrice() {
        this.price = gram4Price();
    }

    public double gram4Price() {
        price = 7.42;
        return price;
    }
}
