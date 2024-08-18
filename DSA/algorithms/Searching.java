class Searching {

  
 public static boolean linear_search(int [] arr, int k){
   
      
       for(int i=0;i<arr.length;i++){

             if(arr[i]==k)
	     return true;


       }

       return false;

 }
 public static boolean binary_search(int [] arr, int k){


     int high=arr.length-1,low=0;
     int mid=0;
     for ( int i=0;;i++ ){
 
       mid = (high+low)/2;

         if(arr[mid]==k) 
	 return true;
	 else if(arr[mid]<k) low=mid+1;
	 else if(arr[mid]>k) high=mid-1;

   if(mid==arr.length-1 || mid==0){
   return false;}

   }


 }
  public static boolean jump_search(int [] arr , int k){
         
         int n = arr.length;
	 int jump = (int)Math.sqrt(arr.length);

	 if(arr[0]==k)
	 return true;
	 else
	 {

          for (int i=1;i<n;i*jump){
            
           
	  }
	 }

  }
 //public static void interpolation_search(){}
 //public static void exponential_search(){}
  public static void fibonacci_search(){}


   public static void main (String [] args) {

           int arr [] = {1,2,3,4,5,6};
           System.out.println("Array : [1,2,3,4,5,6] ");

	   System.out.println("Linear Search result for 3 : " + linear_search(arr,3));
	   System.out.println("Linear Search result for 7 : "+ linear_search(arr,7));
	   System.out.println("Binary Search result for 4 : "+ binary_search(arr,4));
	   System.out.println("Binary Search result for 7 : "+ binary_search(arr,7));
           

   }

}
