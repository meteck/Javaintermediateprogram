

import java.util.Scanner;

public class Battingaverage {

    public static void main(String[] args) {
        int a,b,run=0,c;

        System.out.println("Please enter the number of matches ");
        Scanner number= new Scanner(System.in);
         a= number.nextInt();
        System.out.println(" Please enter the number of time you batting");
        b= number.nextInt();
        while(b>a){
            System.out.println("Please enter the right time you batting");
            b= number.nextInt();
        }
        System.out.println(" The total number you make ");

        for(int i=0;i<a;i++) {
            run += (c = number.nextInt());

        }
        Average(run, b);


    }
    public static void Average(int a,int b){

        float average=(float) a/b;
        System.out.println(average);


    }
}
