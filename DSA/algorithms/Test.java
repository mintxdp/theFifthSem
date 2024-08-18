/*
Testing the programs : 
*/
import java.util.*;
class Test {

 Searching search = new Searching();

 public static int [] generate_random_array() {

   int [] arr = new int [20];

   for(int i=0;i<arr.length;i++){

         arr[i] = (int)(Math.random()*20);
	 
   }

   System.out.println("Random Array : ");

   for(int j=0;j<arr.length;j++){
    
    if(j==0 )
    System.out.print("[ "+arr[j]+",");
    else if(j==arr.length-1)
    System.out.print(arr[j]+" ]\n");
    else
    System.out.print(arr[j]+",");

   }

   return arr;

 }

 public static void main(String [] args){
 

   generate_random_array();   


 }


}
