import java.util.*;
class palindrome {

    public static void main(String[] args) {
    String original, reverse = "";
    Scanner in =  new Scanner(System.in);
    System.out.println("Enter a string");
    original = in.nextLine();
    
    int strLen =  original.length();
    
    for (int i = strLen - 1; i >= 0; i--){
    reverse = reverse + original.charAt(i);
    }
    
    if(original.equalsIgnoreCase(reverse)){
    System.out.println("It is a plaindrome");
    }
    else{
    System.out.println("It is not a plaindrome");
    }

    }
    

    
    }