import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        System.out.println(" Please enter the number to find a factorial number");
        Scanner number = new Scanner(System.in);
        int num = number.nextInt();
        int n1=0,n2=1,n3;
        if(num<=0){
            System.out.println("Please enter the valid number");

        }
//        while(tmp>0){
//
//            System.out.print(" "+n1);
//            n3=n1+n2;
//            n1=n2;
//            n2=n3;
//            tmp--;
//        }

        for(int i=0;i<num;i++){

            System.out.print(" "+n1);
            n3= n1+n2;
            n1=n2;
            n2=n3;

        }


    }
}
