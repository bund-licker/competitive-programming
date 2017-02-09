import java.util.Scanner;
import java.util.*;
public class J2{
    public static void main (String[] args){
    
    Scanner input = new Scanner(System.in);
        String userIn = input.nextLine();
        /*if(userInput.contains(":-)")){
        System.out.println(count);
        }*/
        int happyCount = userIn.length() - userIn.replace(":-)", "").length();
        happyCount = happyCount/3;
        int sadCount = userIn.length() - userIn.replace(":-(", "").length();
        sadCount = sadCount/3;
        
        if(sadCount> happyCount){
        System.out.println("sad");
        }
        else if(sadCount < happyCount){
        System.out.println("happy");
        }else if(sadCount == happyCount && happyCount != 0 && sadCount !=0){
        System.out.println("unsure");
        }else{
        System.out.println("none");
        }    
    }

}