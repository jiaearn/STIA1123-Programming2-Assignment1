package Assignment1;

public class EnvelopeKg4 extends PrepaidBEnvelope {

    private double price;

    public double getPrice() {
        setPrice();
        return price;
    }

    public void setPrice() {
        this.price = gram4Price();
    }

    public double gram4Price() {
        price = 21.20;
        return price;
    }
}
