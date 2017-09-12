import java.util.Scanner;
import java.util.*;
public class J2{
 public static void main(String[] args){
 
    Scanner input = new Scanner(System.in);
    int humidity = input.nextInt();
    int maxHours = input.nextInt();
    
    double calc = 0;
    int finalCalc = 0;
    
    for(int i =0; calc >= 0; i++ ){
       calc = -6 * Math.pow(i, 4)  +  humidity * Math.pow(i, 3) +  2 * Math.pow(i, 2) ;
       finalCalc = i;
   }
   
   if(maxHours >= finalCalc || finalCalc == maxHours){
      System.out.println("The balloon first touches the ground at hour:");
      System.out.println(finalCalc);
   }else{
      System.out.println("The balloon does not touch ground in the given time.");
   }
   }
  
}