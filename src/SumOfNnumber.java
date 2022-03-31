//import java.nio.channels.ScatteringByteChannel;
import java.util.Scanner;
//import java.util.concurrent.SynchronousQueue;

public class SumOfNnumber
{
    public static void main(String[] args) {
//         main method
        System.out.println("Please enter the number ");
        Scanner number= new Scanner(System.in);

        int num = number.nextInt();

        Total(num);

    }

    public static void Total(int a ){
        int sum=0,sum1=0,sum3=0;
        int sum2=0;
        if(a==0){
            System.out.println(" The Total number is 0");

        }
        else if(a>0){
        for(int i=0;i<=a;i++){
            sum +=i;

            sum1=sum;

        }
            System.out.println(sum1);


    }
        else{



            for(int i=0;i>=a;i--){
                sum3 +=i;
                sum2 =sum3;

            }
            System.out.println(sum2);
        }

}}
