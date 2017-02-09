import java.util.Scanner;
public class J1 {
   public static void main(String[] args){
   
   Scanner input = new Scanner(System.in);
   int month = input.nextInt();
   int day = input.nextInt();
   
   final int setDay = 18;
   final int setMonth = 2;
   
   if(month<=2){
       if(month == 1){
       System.out.println("Before");
       }   
       else if(month == 2 && day<setDay){
       System.out.println("Before");
       }
       else if (month == setMonth && day == setDay){
       System.out.println("Special");
       }
       else if(month == 2 && day>setDay){
       System.out.println("After");
       }
   }
   else if(month > setMonth){
       System.out.println("After");
   }

   }
      
   
   }

