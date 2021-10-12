package Assignment1;

public class EnvelopeKg3 extends PrepaidBEnvelope {

    private double price;

    public double getPrice() {
        setPrice();
        return price;
    }

    public void setPrice() {
        this.price = gram3Price();
    }

    public double gram3Price() {
        price = 13.78;
        return price;
    }
}
