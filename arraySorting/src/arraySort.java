
//Author: William Ludwig u0905218

public class arraySort{
	

	
	public static void main(String[] args){
		
		//Create a random array
		int[] sortMe = new int[100];
		for(int i = 0; i < 100; i++)
		{
			sortMe[i] = (int)(Math.random() * ((1000 - 0) + 1)) + 0;
		}
		
		
		
		//Make sure it is not sorted
		isSorted(sortMe);
		
		//Sort it
		
		//Check to see if it is now sorted

		
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
}
	
	
	
