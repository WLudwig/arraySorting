
//Author: William Ludwig

public class arraySort {

	public static void main(String[] args) {

		// Create a random array
		int[] sortMe = new int[100];
		// int[] sorted = new int[100];
		for (int i = 0; i < 100; i++) {
			sortMe[i] = (int) (Math.random() * ((1000 - 0) + 1)) + 0;
		}

		// Make sure it is not sorted
		isSorted(sortMe);

		// Sort it
		// selectionSort(sortMe);
		// insertionSort(sortMe);
		//bubbleSort(sortMe);
		//bubbleSortRecursive(sortMe, sortMe.length);
		insertionSortRecursive(sortMe, sortMe.length);

		// Check to see if it is now sorted
		isSorted(sortMe);

	}

	// Function that determines whether an array is sorted or not.
	// Result is printed to the console
	// Parameter: int[] the array that is to be checked
	public static void isSorted(int[] arr) {
		int previous = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < previous) {
				System.out.println("Array is not sorted!");
				return;
			}
			previous = arr[i];

		}
		System.out.println("Array is sorted!");
	}

	/// A function that performs Selection Sort on the passed in Array
	/// Parameter: int[] - the array that is to be sorted
	public static void selectionSort(int[] arr) {
		System.out.println("Performing Selection Sort!");
		int length = arr.length;

		// Iterate through the array finding the smallest remaining element and
		// adding it to the end of the sorted portion
		for (int i = 0; i < length - 1; i++) {
			int indexOfMin = i;
			for (int j = i + 1; j < length; j++) {
				if (arr[j] < arr[indexOfMin])
					indexOfMin = j;
			}

			int tempValue = arr[indexOfMin];
			arr[indexOfMin] = arr[i];
			arr[i] = tempValue;
		}
	}

	/// A function that performs Insertion Sort on the passed in Array
	/// Parameter: int[] - the array that is to be sorted
	public static void insertionSort(int[] arr) {
		System.out.println("Performing Insertion Sort!");
		int length = arr.length;

		for (int i = 1; i < length; ++i) {
			int key = arr[i];
			int prev = i - 1;

			// check and see if previous elements are greater then current
			// element and move them ahead
			while (prev >= 0 && arr[prev] > key) {
				arr[prev + 1] = arr[prev];
				prev = prev - 1;
			}
			arr[prev + 1] = key;
		}
	}
	
	/// A function that performs Insertion Sort Recursively on the passed in Array
	/// Parameters: int[] - the array that is to be sorted
	///				int length - the length of the array
	public static void insertionSortRecursive(int[] arr, int length) {
		//System.out.println("Performing a pass of Bubble Sort Recursive!");

		// base case
		if (length <= 1)
			return;

		// sort the first length -1 items
		insertionSortRecursive(arr, length -1);

		//insert las element
		int last = arr[length-1];
		int next = length - 2;
		
		//move elements that are greater than last ahead one spot in array
		while(next >=0 && arr[next] > last)
		{
			arr[next+1]= arr[next];
			next--;
		}
		arr[next+1] = last;
	}

	/// A function that performs Bubble Sort on the passed in Array
	/// Parameter: int[] - the array that is to be sorted
	public static void bubbleSort(int[] arr) {
		System.out.println("Performing Bubble Sort!");
		int length = arr.length;

		for (int i = 0; i < length - 1; i++) {
			for (int j = 0; j < length - i - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
	}

	/// A function that performs Bubble Sort Recursively on the passed in Array
	/// Parameters: int[] - the array that is to be sorted
	///				int length - the length of the array
	public static void bubbleSortRecursive(int[] arr, int length) {
		//System.out.println("Performing a pass of Bubble Sort Recursive!");

		// base case
		if (length == 1)
			return;

		// perform bubble sort once
		for (int i = 0; i < length - 1; i++) {
			if (arr[i] > arr[i + 1]) {
				int temp = arr[i];
				arr[i] = arr[i + 1];
				arr[i + 1] = temp;
			}
		}
		// largest element is good. Continue on
		bubbleSortRecursive(arr, length - 1);

	}
}
