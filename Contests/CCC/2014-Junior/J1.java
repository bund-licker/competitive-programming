import java.util.Scanner;

public class J1{
    public static void main(String[] args){
    
    Scanner input = new Scanner(System.in);
    int num1 = input.nextInt();
    int num2 = input.nextInt();
    int num3 = input.nextInt();
    
    
    
    
    if(num1+num2+num3 == 180){
        if(num1 == num2 && num2 == num3 && num1 == num3){
            System.out.println("Equilateral");
        }else if(num1 == num2 || num1 == num3 || num2 == num3){
            System.out.println("Isosceles");
        }else{
            System.out.println("Scalene");
        }
    }else{
       System.out.println("Error");
    }

}
}