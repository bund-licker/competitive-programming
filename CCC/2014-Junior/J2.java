import java.util.Scanner;

public class J2{
    public static void main(String[] args){
    int aCount = 0;
    int bCount = 0;
    
    Scanner input = new Scanner(System.in);
    int numIn = input.nextInt();
    input.nextLine();
    String userIn = input.nextLine();
    
    for(int i = 0; i < userIn.length(); i++){
       if(userIn.charAt(i) == 'A'){
          aCount = aCount + 1;
       }else if(userIn.charAt(i) == 'B'){
          bCount = bCount +1;
       }
    }
    
    if(aCount > bCount){
       System.out.println("A");
    }else if(aCount < bCount){
       System.out.println("B");
    }else{
       System.out.println("Tie");
    }

}
}