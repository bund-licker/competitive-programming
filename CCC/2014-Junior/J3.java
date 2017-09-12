import java.util.Scanner;

public class J3{
    public static void main(String[] args){
    
    Scanner input = new Scanner(System.in);
    int rollNum = input.nextInt();
    
    int p1Score = 100;
    int p2Score = 100;
    
    for(int i = 0; i< rollNum; i++){
        int p1Roll= input.nextInt();
        int p2Roll = input.nextInt();
        
        if(p1Roll > p2Roll){
           p2Score = p2Score-p1Roll;
        }else if(p1Roll < p2Roll){
           p1Score = p1Score-p2Roll;
        }
    }
    
    System.out.println(p1Score);
    System.out.println(p2Score);
  }
}