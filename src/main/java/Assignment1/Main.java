package Assignment1;

public class Main extends PosMalaysia {

    public static void main(String[] args) {
        String myFormat = "%-25s%2s%8.2f\n";
        Main main = new Main();
        main.processPrice(myFormat);
    }

    @Override
    public void processPrice(String myFormat) {
        CalculatePrice calculatePrice = new CalculatePrice();
        calculatePrice.processPrice(myFormat);
    }

    public void displayReceipt(String myFormat) {
        Receipt receipt = new Receipt();
        receipt.displayReceipt(myFormat);
    }
}