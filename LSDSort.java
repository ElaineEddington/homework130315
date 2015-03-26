package homework130315;

import java.util.Arrays;
import java.util.Random;

public class LSDSort {
	
	private static final int MAX =1000000;
	
	
	public static void main(final String[] args) {
	
	int [] data = generate();
	
	long start = System.currentTimeMillis();
	Arrays.sort(data);
	long stop = System.currentTimeMillis();
	
	System.out.println("Elapsed ="+ (stop-start));
	//System.out.println(Arrays.toString(data));
	}	

	private static int [] generate() {
		int[] data = new int[MAX];
		Random random = new Random();
		
			for(int i=0; i<data.length; i++){
				
				data[i] = random.nextInt(MAX);				
			}
		return data;
	}
	 
	
public static void sort(final String[] data)
    {  // Sort a[] on leading W characters.
       int N = data.length;
       int R = 256;
              //data[].class =(char)data;
       String[] aux = new String[N];
       for (int d = 4; d >= 0; d--)
       { // Sort by key-indexed counting on d-th char.
          int[] count = new int[R+1];     // Compute frequency counts.
          for (int i = 0; i < N; i++)
              count[data[i].charAt(d) + 1]++;
          for (int r = 0; r < R; r++)     // Transform counts to indices.
             count[r+1] += count[r];
          for (int i = 0; i < N; i++)     // Distribute.
             aux[count[data[i].charAt(d)]++] = data[i];
          for (int i = 0; i < N; i++)     // Copy back.
             data[i] = aux[i];
          
       }
      
       for (int i = 0; i < N-1; i++ ) {
       for (int d = 4; d >= 0; d--) 	  
       {
      	  if (data[i+1].charAt(d) >= data[i].charAt(d)){
      		
     		   		System.out.println("Job's done");
      			}
      	 System.out.println("Incorrect");
       }
       }
    }
   

}
