package saket;

public class Differindex {

	public static void main(String[] args) {

		int[] arr1 = { 10, 2, 9, 14, 3 };

		int[] arr2 = { 10, 2, 18, 14, 3 };

		for (int i = 0; i < arr1.length; i++) {
			if (arr1[i] != arr2[i]) {
				System.out.println("Values are not matching at index " + i);
			}
		}
	}

}
