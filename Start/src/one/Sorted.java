package one;

import java.util.Scanner;

public class Sorted {

Scanner sc = new Scanner(System.in);
private int size;
int[] arr;

	void InputSizeOfTheArray(){
	System.out.println("¬ведите размер массива: ");
	size = sc.nextInt();
	arr = new int[size];
	}

  public int[] InputArrayOfNumbers(){  
	   InputSizeOfTheArray();
	   System.out.print("¬ведите элементы массива: ");
       for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
		return arr;
		
	}

     public int GetSize(){
	  return size;
}
  
	public static void main(String[] args) {
		Sorted sort_mass = new Sorted();
		Bubble_sort bubble_sort = new Bubble_sort();
		bubble_sort.sort(sort_mass.InputArrayOfNumbers(), sort_mass.GetSize());
		Quick_sort quick_sort = new Quick_sort();
		quick_sort.sort(sort_mass.InputArrayOfNumbers(), sort_mass.GetSize());
		
	}
	
}
