import java.util.Scanner;
public class calculater_using_enhansedswitch {
    public static void main(String[]args){
        Scanner input= new Scanner(System.in);
        float number_1,number_2,res=1;
        String operation;
        System.out.println("Enter the value A and value B:");
        number_1=input.nextFloat();
        number_2=input.nextFloat();
        System.out.println("Enter the operation(+,-,*,/,%,^) or(addition,subraction,multiplication,division,modules,power)");
        operation=input.next();
        switch (operation) {
            case "+","addition","ADDITION","Addition"-> System.out.println("output : "+number_1+number_2);
            case "-","subraction","Subraction","SUBRACTION"-> System.out.println("output : "+ (number_1-number_2));
            case "*","multiplication","Multiplication","MULTIPLICATION"-> System.out.println("output : "+number_1*number_2);
            case "/","division","Division","DIVISION"-> {
                if(number_2!=0){
                    System.out.println("output : "+number_1/number_2);
                }else{
                    System.out.println("unable to divide if the number_2 value is 0 then it gives infinity");
                }
                }
            case "%","MODULES","modules","Modules"-> System.out.println("output : "+number_1%number_2);
            case "^","power","POWER","Power"-> {
                System.out.println("output : "+Math.pow(number_1, number_2));
            }
            default->System.out.println("invalid operation input please try again..,");
        }
    }    
}
