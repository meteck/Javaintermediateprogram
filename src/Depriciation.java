import java.util.Scanner;

public class Depriciation {
    public static void main(String[] args) {
        System.out.println(" Enter the actual value of the item");
        Scanner number= new Scanner(System.in);
        double price= number.nextDouble();
        System.out.println("Please enter the number of deprecated percentage");
        double value= number.nextDouble();
        System.out.println("Please enter the year that you want to find the value of the Item");
        int year= number.nextInt();

        DipricationValue(price,value,year);

    }
    public static void DipricationValue(double a, double b,int c){

        float R1=0;
        while(c>0) {


            float result = (float) ((100 - b) *a)/100 ;

            c--;
            R1= result;
        }

        System.out.println(R1);
    }

}
