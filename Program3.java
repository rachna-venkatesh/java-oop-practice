import java.util.Scanner;

class Industry
{
    private float price;
    private float gstAmount;
    private float totalPrice;
    static float gst=18;

    void acceptInputCar(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the car price:");
        price=sc.nextFloat();
    }

    void acceptInputBike(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the bike price:");
        price=sc.nextFloat();
    }

    void calcGst(){
        gstAmount=(price*gst)/100;
        totalPrice=price+gstAmount;
    }

    void display(){
        System.out.println("The total price is:"+totalPrice);
    }
}

public class Program3{
    public static void main(String[] args)
    {
       Industry car=new Industry();
       car.acceptInputCar();
       car.calcGst();
       car.display();

       Industry bike=new Industry();
       bike.acceptInputBike();
       bike.calcGst();
       bike.display();
    }
}