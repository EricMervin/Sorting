
public class NewSort {

	public static void main(String[] args) {
		int intArr[] = {1,3,6,22,5,8,10,4,2};
		int tempInt = 0, i, j;
		int len = intArr.length;
		
		System.out.println("Array Before Sort: ");
		
		for(i = 0; i < len; i++) {
			System.out.print(intArr[i] + " ");
		}
		
		System.out.println();
		
		//Sorting the array elements
		for(i = 0; i < len; i++) {
			for(j = 1; j < (len-i); j++) {
				if(intArr[j-1] > intArr[j]) {
					tempInt = intArr[j-1];
					intArr[j-1] = intArr[j];
					intArr[j] = tempInt;
				}
			}
		}
		
		System.out.println("Array After Sort: ");
		
		for(i = 0; i < len; i++) {
			System.out.print(intArr[i] + " ");
		}
	}

}
