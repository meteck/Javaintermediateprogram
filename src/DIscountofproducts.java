import java.util.Scanner;

public class DIscountofproducts {
    // the Main class
    public static void main(String[] args) {
        System.out.println("Please enter the product name:;");
        Scanner number= new Scanner(System.in);
        double product1= number.nextInt();
        double discount= number.nextInt();
        System.out.println(" The price after the discount is "+ finalprice(product1,discount));

    }
    // finalprice class

    public static double finalprice(double a,double b){

        double Discount=0;

        Discount= a*b/100;
        Double Finalprice= a-Discount;

        return Finalprice;

    }

}
