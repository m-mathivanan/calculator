import java.util.Scanner;
public class day1 {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter the value 1 and value 2:");
        int value1=scanner.nextInt();
        int value2=scanner.nextInt();
        System.out.println("calcular :");
        System.out.println("type:");
        System.out.println("addtion press 1");
        System.out.println("subtrection press 2");
        System.out.println("multiplication press 3");
        System.out.println("division press 4");
        System.out.println("enter the type:");
        int type=scanner.nextInt();
        switch(type){
            case 1: System.out.println("Addtion :"+(value1+value2));
            break;
            case 2: System.out.println("subtraction :"+(value1-value2));
            break;
            case 3: System.out.println("multiplication :"+(value1*value2));
            break;
            case 4: {
                if(value2!=0){
                System.out.println("division :"+(value1/value2));
                break;}
                else{
                    System.out.println("error");
                    break;
                }
            }default : System.out.println("invalid input");
                       
            
        }scanner.close();

    }
    
}
