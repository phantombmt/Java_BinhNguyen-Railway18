
public class ArraysDemo {

	public static void main(String[] args) {

		// int arr[5];

		// int arr[] = {10,20,30,40,50};

		int arr[] = new int[5];

		arr[0] = 10;

		arr[1] = new Integer(20);

		// arr[2] = 30.54;

		arr[2] = 30;

		// arr[7] = 70;

		System.out.println("Elements of array : ");
		
		//Print array starting from the first element
		
		for (int i = 0; i < arr.length; i++) {

			System.out.println(arr[i]);

		}
		
		//Print array starting from the last element
		for (int i = arr.length -1 ; i >=0 ; i--) {
			
			System.out.println(arr[i]);
			
		}
		
		//Print all the element in arr if exists , but can't print in the reverse direction, just only starting from arr[0]
		
		for (int element : arr) {
			
			System.out.println(element);
		}
	}

}
