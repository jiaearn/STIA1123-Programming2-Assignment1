package Assignment1;

public class EnvelopeKg1 extends PrepaidBEnvelope {

    private double price;

    public double getPrice() {
        setPrice();
        return price;
    }

    public void setPrice() {
        this.price = gram1Price();
    }

    public double gram1Price() {
        price = 7.31;
        return price;
    }
}