### Read the instruction at `INSTRUCTION.md`

## Student Info:
  NAME: TAN JIA EARN

  MATRIC NUMBER: 269509
  
  ![photo1](https://github.com/STIA1123-A192/assignment-1-jiaearn/blob/master/images/earn.JPG)


## Introduction:
   This assignment is about the calculation price of the Pos Laju Malaysia that user required. In this program, Pos Laju Malaysia are provided 4 service to user, which is next-day delivery, same-day delivery, prepaid boxes and envelopes and pos ekspress. Then after user choose the service , the program will calcutale the total price of the service charge and print out the receipt for user know the total price that need to pay. For assignment 1, We need to use the code have been given and improve the program by using the concept of object-oriented Programming. The concept of object oriented Programming is Abstraction, Encapsulation, Polymorphism and Inheritance.

## Screenshot all the Output/Result:
   
   Next Day Delivery
   
   ![Output1](https://github.com/STIA1123-A192/assignment-1-jiaearn/blob/master/images/output1.PNG)
   
   ![Output2](https://github.com/STIA1123-A192/assignment-1-jiaearn/blob/master/images/output2.PNG)
   
   Same Day Delivery
   
   ![Output3](https://github.com/STIA1123-A192/assignment-1-jiaearn/blob/master/images/output3.PNG)
   
   ![Output4](https://github.com/STIA1123-A192/assignment-1-jiaearn/blob/master/images/output4.PNG)
   
   
   Prepaid Box& Envelope
   
   ![Output5](https://github.com/STIA1123-A192/assignment-1-jiaearn/blob/master/images/output5.PNG)
   
   ![Output6](https://github.com/STIA1123-A192/assignment-1-jiaearn/blob/master/images/output6.PNG)
   
   Pos Ekspres
   
   ![Output7](https://github.com/STIA1123-A192/assignment-1-jiaearn/blob/master/images/output7.PNG)
   
   Receipt
   
   ![Output8](https://github.com/STIA1123-A192/assignment-1-jiaearn/blob/master/images/output8.PNG)
   
   Exit
   
   ![Output9](https://github.com/STIA1123-A192/assignment-1-jiaearn/blob/master/images/output9.PNG)

## UML Class Diagram:

   ![Diagram1](https://github.com/STIA1123-A192/assignment-1-jiaearn/blob/master/images/UmlClassDiagram.PNG)
   
## How to run this program?
   
   Menu Page
   1. Choose the service by using int which is '1', '2', '3' and '4'.
   
      Press '1' go to the Next Day Delivery service.
      
      Press '2' go to the Same Day Delivery service.
      
      Press '3' go to the Prepaid Box & Envelope service.
      
      Press '4' go to the Pos Ekspres service.
      
   2. Press '5' to print receipt.
   3. Press '0' to exit the program.
   
   (can refer to the image name 'output1.PNG' )
  
   Next Day Delivery
   1. If want to enter Next Day Delivery press '1', if dont want this service can press '2' and back to the menu page.
   2. Key in the quantity of Next Day Delivery that you want to purchase.
   3. Choose the package type.
   4. Choose the zone.
   5. Key in the weight.
   6. System will calculate the price.
   7. If you need another Next Day Delivery package press '1', if dont want press '2' and back to the menu page
   
   (can refer to the image name 'output1.PNG','output2.PNG' )
   
   Same Day Delivery
   1. If want to enter Same Day Delivery press '1', if dont want this service can press '2' and back to the menu page.
   2. Key in the quantity of Same Day Delivery that you want to purchase.
   3. Choose the town that you want to delivery.
   4. Key in the weight.
   5. Enter the quantity of this shipment.
   6. System will calculate the price.
   7. If you need another Next Day Delivery package press '1', if dont want press '2' and back to the menu page.
   
   (can refer to the image name 'output3.PNG','output4.PNG')
   
   Prepaid Box & Envelope
   1. If want to enter Prepaid Box & Envelope press '1', if dont want this service can press '2' and back to the menu page.
   2. Key in the quantity of Prepaid Box & Envelope that you want to purchase.
   3. Key in the weight.
   4. Enter the quantity of this shipment.
   5. System will calculate the price.
   6. If you need another Prepaid Box & Envelope package press '1', if dont want press '2' and back to the menu page.
   
   (can refer to the image name 'output5.PNG','output6.PNG' )
   
   Pos Ekspres
   1. If want to enter Pos Ekspres press '1', if dont want this service can press '2' and back to the menu page.
   2. Key in the quantity of Pos Ekspres that you want to purchase.
   3. Key in the weight.
   4. Enter the quantity of this shipment.
   5. System will calculate the price.
   6. If you need another Pos Ekspres package press '1', if dont want press '2' and back to the menu page.
   
   (can refer to the image name 'output7.PNG' )

## Example of your program:

1. Abstraction 
```java
public abstract class PosMalaysia {
    public abstract void processPrice(String myFormat);
    public abstract void displayReceipt(String myFormat);
}
``` 
```java
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
```

2. Encapsulation  
```java
public class Cgram1 extends CrossPrice {
    private double price;

    @Override
    public double getPrice() {
        setPrice();
        return price;
    }

    public void setPrice() {
        this.price = gram1Price();
    }

    public double gram1Price() {
        double doCharge2 = 5.40;
        double surCharge2 = 7.50;
        price = doCharge2 + surCharge2;
        return price;
    }
}
```

3. Polymorphism  

Overloading
```java
public class Parcel extends NextDayDelivery {
    
    public void parcel(int zone) {
        switch (zone) {
            case 1:
                parcel(10.50, 0.50);
                break;
            case 2:
                parcel(16.00, 2.00);
                break;
            case 3:
                parcel(21.00, 3.00);
                break;
            case 4:
                parcel(26.00, 3.50);
                break;
            case 5:
                parcel(31.00, 4.00);
                break;
        }
    }

    public void parcel(double fpPrice, double spPrice) {
        double totalspPrice;
        int j;
        do {
            System.out.println("Enter the parcel's weight in kg: ");
            kg = sc.nextDouble();
        } while (!validWeight(kg));
        if (kg >= 2 && kg <= 2.5) {
            totalspPrice = 0;
        } else {
            if ((kg - 2.5) % 0.5 == 0) {
                j = (int) ((kg - 2.5) / 0.5);
                totalspPrice = j * spPrice;

            } else {
                j = (int) ((kg - 2.5) / 0.5);
                totalspPrice = (j + 1) * spPrice;
            }
        }
        price = fpPrice + totalspPrice;
        System.out.printf("Your Next-Day Delivery for parcel is RM %.2f%n", price);
    }
}
```
Overridding
```java
public abstract class PosMalaysia {
    public abstract void processPrice(String myFormat);
    public abstract void displayReceipt(String myFormat);
}
```  
```java
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
```  
 
4. Inheritance    
```java
public class Main extends PosMalaysia  {}
public class CalculatePrice extends Main {}
public class NextDayDelivery extends CalculatePrice {}
public class SameDayDelivery extends CalculatePrice {}
public class PrepaidBEnvelope extends CalculatePrice {}
public class PosEkspres extends CalculatePrice {}
```  
