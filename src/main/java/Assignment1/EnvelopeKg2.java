package Assignment1;

public class EnvelopeKg2 extends PrepaidBEnvelope {

    private double price;

    public double getPrice() {
        setPrice();
        return price;
    }

    public void setPrice() {
        this.price = gram2Price();
    }

    public double gram2Price() {
        price = 10.49;
        return price;
    }
}
