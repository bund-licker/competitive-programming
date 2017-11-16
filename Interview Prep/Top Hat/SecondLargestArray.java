class SecondLargestArray {

    public static void main(String[] args) {
	System.out.println(secondHighest(19,24,12,11));
   System.out.println(secondHighest(21,31,31,33));
    }
    
     static int secondHighest(int... nums) {
    int high1 = Integer.MIN_VALUE;
    int high2 = Integer.MIN_VALUE;
    for (int num : nums) {
      if (num > high1) {
        high2 = high1;
        high1 = num;
      } else if (num > high2) {
        high2 = num;
      }
    }
    return high2;
 }
    
    }