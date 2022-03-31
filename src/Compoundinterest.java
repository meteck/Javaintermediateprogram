import java.util.Scanner;

public class Compoundinterest {
    public static void main(String[] args) {
        System.out.println("Please enter the amount");
        Scanner number= new Scanner(System.in);
        float amount= number.nextFloat();
        System.out.println("Please enter the year");
        double year= number.nextDouble();
        System.out.println(" Please enter the no of month");
        double month= number.nextDouble();
        System.out.println("Please enter the no of interest rate");
        double rate = number.nextDouble()/12;
        System.out.println("When did you want to add interest ");
        String name= number.next();
        int n;
//       while statement to take a user input to add month or in the year

        while(true){

            if(name.equals("year")){
                n=1;
                break;
            }
            else if(name.equals("month")){
                n=12;
                break;

            }else
            {
                System.out.println(" Please enter the value year or month");
                name=number.next();
            }

        }





        double time;
        time = (year+month/12);
        compound(amount,rate, (float) time,n);
        System.out.println(time);


    }
    // compound class

    public static void compound(float a ,double b, float c,int d ){
        float compoundinterested= (float) ( a*Math.pow((1+b/100),c*d))- a;



            System.out.println(" The Interested amount was "+compoundinterested);
        System.out.println(" Total amount after adding interest is "+ (compoundinterested+a));
    }

}
