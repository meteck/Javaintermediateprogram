import java.util.Scanner;

public class commition {
    public static void main(String[] args) {
        System.out.println("Please enter the price ");
        Scanner number = new Scanner(System.in);
        double price= number.nextDouble();
        System.out.println("Please enter the commotion");
        double com= number.nextDouble();

        Commotion(price,com);

    }
    // this Commotion method or we call this a function
    public static void Commotion(double a , double b){

        double price = (100/a)* b;
        System.out.println(" The Price is "+a+" and the commotion is "+b+" and the percentage "+ price+" %");
    }
}
