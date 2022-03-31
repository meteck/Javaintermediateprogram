//import java.util.Scanner;

public class Electrictybill {

    // The main classs
    public static void main(String[] args) {
        System.out.println("Please enter the unit of the electricity");
//        Scanner number= new Scanner(System.in);
//        int a= number.nextInt();
//        String a;
//        This code was done to make a command line arguments..
        int b =Integer.parseInt(args[0]);
        unit(b);

    }
    // the unit class

    public static void unit(int a){

        // check unit is less then 100
        double bill;

        if(a<0){
            System.out.println(" The Electricty bill was zero rupee");
        }
        else if (a>0&&a<=100){
             bill= a*1.2;
            System.out.println("The Electricity bill is "+ bill+" rupee");
        }
        else if(a>101&&a<=300){

        bill =100*1.2+(a-100)*1.5;
            System.out.println("The Electricity bill is "+bill+ "rupee");


        }
        else if(a>300){
            bill = 100*1.2+200*1.5+(a-300)*2;

            System.out.println("The Electricity bill is "+bill+ "rupee");

        }




    }

}
