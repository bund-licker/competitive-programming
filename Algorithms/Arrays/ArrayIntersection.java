class ArrayIntersection {

    public static void intersection(int[] nums1, int[] nums2) {
         for(int i = 0; i<nums1.length; i++){
             for (int j = 0; j<nums2.length; j++){
                 if (nums1[i] == nums2[j]){
                  System.out.print(nums1[i] + " ");
                 }
             }
         }
       
    }
    
    public static void main(String[] args) {
	    int [] arr1= {1, 2, 2, 1} ;
       int [] arr2= {2,1};
	    intersection(arr1,arr2);
	    
    }
}