package one;

import java.util.Scanner;

public class Sorted {

Scanner sc = new Scanner(System.in);
private int size;
int[] arr;

	void inputSize(){
	System.out.println("Input size of array: ");
	size = sc.nextInt();
	arr = new int[size];
	}

  public int[] inputArray(){  
	   inputSize();
	   System.out.print("Input array elements: ");
       for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
		return arr;
		
	}

     public int GetSize(){
	  return size;
}
  
	public static void main(String[] args) {
		Sorted sortMass = new Sorted();
		Sorting bubbleSort = new BubbleSort();
		bubbleSort.sort(sortMass.inputArray(), sortMass.GetSize());
		Sorting quickSort = new QuickSort();
		quickSort.sort(sortMass.inputArray(), sortMass.GetSize());
		
	}
	
}
