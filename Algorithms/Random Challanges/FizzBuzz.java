class FizzBuzz {
    public static void fizzBuzz(int x) {
        for (int i =1; i <= x; i++){
            if( x % 3 == 0 && x % 5 == 0 ){
                System.out.println("FizzBuzz");
                break;
            }
            else if(x % 3 == 0 ){
                System.out.println("Fizz");
                break;
            }
            else if(x % 5 == 0 ){
                System.out.println("Buzz");
                break;
            }
        } 
    }
    
    public static void main(String[] args) {
	 fizzBuzz(15);	    
    }

}