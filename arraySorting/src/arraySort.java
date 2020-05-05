
//Author: William Ludwig

public class arraySort{
	

	
	public static void main(String[] args){
		
		//Create a random array
		int[] sortMe = new int[100];
		//int[] sorted = new int[100];
		for(int i = 0; i < 100; i++)
		{
			sortMe[i] = (int)(Math.random() * ((1000 - 0) + 1)) + 0;
		}
		
		
		
		//Make sure it is not sorted
		isSorted(sortMe);
		
		//Sort it
		selectionSort(sortMe);
		
		//Check to see if it is now sorted
		isSorted(sortMe);

		
	}
	

	
	
	//Function that determines whether an array is sorted or not.
	//Result is printed to the console
	//Parameter: int[] the array that is to be checked
	public static void isSorted(int[] arr)
	{
		int previous = 0;
		for(int i = 0; i < arr.length; i++)
		{
			if(arr[i] < previous)
			{
				System.out.println("Array is not sorted!");
				return;
			}
			previous = arr[i];
				
		}
		System.out.println("Array is sorted!");
	}
	
	///A function that performs Selection Sort on the passed in Array
	///Parameter: int[] - the array that is to be sorted
	public static void selectionSort(int[] arr)
	{ 
		System.out.println("Performing Selection Sort!");
		int length = arr.length;
		
		//Iterate through the array finding the smallest remaining element and adding it to the end of the sorted portion
		for(int i = 0; i < length-1; i++)
		{
			int indexOfMin = i;
			for(int j = i+1; j<length; j++)
			{
				if(arr[j]<arr[indexOfMin])
					indexOfMin = j;
			}
			
			int tempValue = arr[indexOfMin];
			arr[indexOfMin] = arr[i];
			arr[i] = tempValue;
		}
	}
}
	
	
	
