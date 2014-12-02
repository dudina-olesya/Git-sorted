package one;

public class BubbleSort implements Sorting {

	@Override
	public int[] sort(int[] arr, int size) {
		 for (int i = 0; i < size; i++) {
	            for (int j = size - 1; j > i; j--) {
	                if (arr[j] < arr[j - 1]) {
	                    int temp = arr[j];
	                    arr[j] = arr[j - 1];
	                    arr[j - 1] = temp;
	                }
	            }
	        }

		 System.out.print("Сортировка пузырьком: " + arr);
	        for (int i = 0; i < size; i++) {
	          System.out.print(arr[i] + " ");
   
	        }
	  return arr;
	}

}
