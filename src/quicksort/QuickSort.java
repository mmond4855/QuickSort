
package quicksort;

import java.util.*;

class qSorting
{
    public int part(int arr[], int left, int right)
{
    int a = left; //For the left side of the array
    int b = right; //For the right side of the array.
    int tmp; //Will hold the temporary index.
    int p = arr[(left + right) / 2];
    //The pivot is the sum of the lowest and highest index divded by two.

     

      while (a <= b)//Looping from the lowest index to the highest index.
      {

            while (arr[a] < p)//while the first index is less than the pivot
            {
                  a++; // checks the next lower index
            }
            while (arr[b] > p)// while the last index is more than the pivot

                  b--;// checks the next higher index

            if (a <= b) {

                  tmp = arr[a];

                  arr[a] = arr[b];

                  arr[b] = tmp;

                  a++;

                  b--;

            }

      };

     

      return a;
}

    public void quickieSort(int arr[], int left, int right)
    {
          
      int index = part(arr, left, right);

      if (left < index - 1)

            quickieSort(arr, left, index - 1);

      if (index < right)

            quickieSort(arr, index, right);
		
                
               
    }


}






public class QuickSort {

	/* A utility function to print array of size n */
	static void printArray(int arr[])
	{
		int n = arr.length;
		for (int i=0; i<n; ++i)
			System.out.print(arr[i]+" ");
		System.out.println();
	}
        
        
 
    public static void main(String[] args) {
 	// Driver program
	
		int nums[] = {10, 7, 8, 9, 1, 5};
		int n = nums.length;

		QuickSort ob = new QuickSort();
		
                ob.quickieSort(nums, 0, n - 1 );

		System.out.println("sorted array");
		printArray(nums);
	}

    private void quickieSort(int[] nums, int i, int i0) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    

}

