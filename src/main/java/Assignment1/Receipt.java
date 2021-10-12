package Assignment1;

public class Receipt extends Main {
    private double totalPrice = NextDayDelivery.getTotalPrice();
    private double totalPrice2 = SameDayDelivery.getTotalPrice2();
    private double totalPrice3 = PrepaidBEnvelope.getTotalPrice3();
    private double totalPrice4 = PosEkspres.getTotalPrice4();

    public void displayReceipt(String myFormat) {
        double total = totalPrice + totalPrice2 + totalPrice3 + totalPrice4;
        System.out.printf("------------------%n");
        System.out.print("------------------------------------");
        System.out.print("\n\t\t\tReceipt:\n");
        System.out.println("------------------------------------");
        System.out.printf(myFormat, "Next Day Delivery: ", "RM", totalPrice);
        System.out.printf(myFormat, "Same Day Delivery: ", "RM", totalPrice2);
        System.out.printf(myFormat, "Prepaid Box & Envelope: ", "RM", totalPrice3);
        System.out.printf(myFormat, "Pos Ekspres: ", "RM", totalPrice4);
        System.out.println("------------------------------------");
        System.out.printf(myFormat, "Total Price: ", "RM", total);
        System.out.println("------------------------------------");
        System.out.println("Thank You!");

    }
}
