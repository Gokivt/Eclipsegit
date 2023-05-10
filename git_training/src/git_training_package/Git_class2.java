package git_training_package;

import java.util.Arrays;

public class Git_class2 {
	 public static void main(String[] args) {
		    int Positive=0;
		    int Negative=0;
		    int[] nums = {1,-2, -5,-4,3,-6};
		    System.out.println("Original array of numbers:\n"+Arrays.toString(nums));
		 
		    for(int i=0;i<nums.length;i++)
		    {
		    	 if(nums[i]<0){
		    	        Positive=Positive+1;
		    	        
		    	      }
		    	      if(nums[i]>0){
		    	        Negative=Negative+1;
		    	      }
   
		    	    
		    }
		    if(Positive>Negative){
   	         System.out.println("Array is positive dominant: "+Positive);
   	        
   	      }
   	      else {
   	         System.out.println("Array is neagative dominant: "+Negative);
   	        
   	      }
		  }

}
