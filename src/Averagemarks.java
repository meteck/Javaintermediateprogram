import java.util.Scanner;

public class Averagemarks {
    public static void main(String[] args) {
        System.out.println("Please enter the number subject from you want to find an average");
        Scanner total= new Scanner(System.in);
        int subject= total.nextInt();

        // average methods or functions
        averagemarks(subject);

    }
    public static void averagemarks(int a){
        int totalmarks=0,return_num=0;
        int d=a;
        if(a<=0){
            System.out.println("Please enter the right subject");
        }
        System.out.println("Please add the marks of the subjects ");
        int i=0;
        while(i < a){

            Scanner number= new Scanner(System.in);
            int n=number.nextInt();
            if(n>=0){
            totalmarks += (n);

            return_num= totalmarks;

            i++;}
            else
                System.out.println("Please enter the right marks");



        }
        System.out.println(return_num);
        float r= (float) return_num/a;
        System.out.println(" The total number for the " + a + " is " + r);
    }
}
