import java.util.Scanner;

public class Averagenumber {
    //main class
    public static void main(String[] args) {

        int n=0,num=0;
        double z=  Average(n,num);
        System.out.println(z);



    }
    // average class of the number class
    public static double Average(int nu1, int num2){
        System.out.println(" How many number do you want to add to find an average number of that numbers");
        Scanner number= new Scanner(System.in);

        int num1= number.nextInt();
        System.out.println("Please add the positive numbers");
        int num,n;
        int sum=0;
        int result=0;

        for(int i=0;i<num1;i++){


            sum=sum+(num= number.nextInt());
             result= sum;

        }
        return result/num1;
    }
}
