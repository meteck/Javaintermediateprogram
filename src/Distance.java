import java.util.Scanner;

public class Distance {
    // main class

    public static void main(String[] args) {
        System.out.println("Please enter the point one");
        Scanner number= new Scanner(System.in);

        int p1= number.nextInt();
        System.out.println("Please enter the second point");
        int p2= number.nextInt();
        int max= Integer.max(p1,p2);
        int min= Integer.min(p1,p2);

        Double z= Differnce(max,min);
        System.out.println(z);
    }
    // Scanner class
    public  static double Differnce(int a,int b){


        double diff= a-b;

        return  diff;
    }
}
