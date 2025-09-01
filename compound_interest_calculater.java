import java.util.Scanner;
class compound_interest_calculater{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        double finalamount,CI,A,R,P,value;
        int T;
        System.out.println("initial amount of investment");
        P=input.nextDouble();
        System.out.println("enter the rate of interest");
        R=input.nextDouble();
        System.out.println("enter the time period");
        T=input.nextInt();
        A=P*(Math.pow(1+(R/100),T));
        System.out.println("Final amount after the time is "+ A);
        System.out.println("The compound interest : "+(A-P));

        input.close();
    }
}