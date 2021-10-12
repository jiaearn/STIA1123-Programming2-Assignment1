package Assignment1;

public class EkspresGram3 extends PosEkspres {
    private double price;

    public double getPrice() {
        setPrice();
        return price;
    }

    public void setPrice() {
        this.price = gram3Price();
    }

    public double gram3Price() {
        price = 4.77;
        return price;
    }
}
