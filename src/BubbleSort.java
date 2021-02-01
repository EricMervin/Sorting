
public class BubbleSort {
	static void bubbleSort(int[] arr) {
		int len = arr.length;
		int tempInt = 0, i, j;
		
		for(i = 0; i < len; i++) {
			for(j = 1; j < (len-i); j++) {
				if(arr[j-1] > arr[j]) {
					tempInt = arr[j-1];
					arr[j-1] = arr[j];
					arr[j] = tempInt;
				}
			}
		}
	}
	

	public static void main(String[] args) {
		int intArr[] = {1,3,6,22,5,8,10,4,2};
		int i;
		
		System.out.println("Array Before Sort: ");
		
		for(i = 0; i < intArr.length; i++) {
			System.out.print(intArr[i] + " ");
		}
		
		System.out.println();
		
		//Sorting the array elements
		bubbleSort(intArr);
		
		System.out.println("Array After Sort: ");
		
		for(i = 0; i < intArr.length; i++) {
			System.out.print(intArr[i] + " ");
		}
	}

}
