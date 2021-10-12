package Assignment1;

public class EnvelopeKg5 extends PrepaidBEnvelope {

    private double price;

    public double getPrice() {
        setPrice();
        return price;
    }

    public void setPrice() {
        this.price = gram5Price();
    }

    public double gram5Price() {
        price = 31.80;
        return price;
    }
}

