public class Solution {
    static int sockMerchant(int n, int[] ar) {
      
        Arrays.sort(ar);
        int count=0;
        for(int i=0; i<n-1; i++){
            if(ar[i]==ar[i+1]){
                count=count+1;
                i=i+1;
            }
        }
        return count;
    }
