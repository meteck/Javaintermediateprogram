import java.util.Scanner;

public class Powerinjava {
    // mainclass
    public static void main(String[] args) {
        System.out.println("Please enter base");
        Scanner number = new Scanner(System.in);
        double base= number.nextDouble();
        System.out.println("Please enter the power");
        double power= number.nextDouble();
        Power(base,power);
    }
    public static void Power(double a,double b){

        float result = (float) Math.pow(a,b);
        System.out.println(" The power of "+a+" to "+b+ "is "+result);

    }

}
