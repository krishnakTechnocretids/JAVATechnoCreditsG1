package saket;

import java.util.Scanner;

public class Arraycontains {

	boolean flag = false;

	public static void main(String[] args) {

		Arraycontains as = new Arraycontains();

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter number of Element");

		int size = sc.nextInt();

		int[] a = new int[size];

		System.out.println("Enter the input for array");

		for (int i = 0; i < a.length; i++) {

			a[i] = sc.nextInt();

		}
		System.out.println("Enter the number you want to search in given array");
		int num = sc.nextInt();

		as.numberpresent(num, a);

		as.display();

	}

	boolean numberpresent(int num, int[] a) {

		for (int i = 0; i < a.length; i++) {

			if (a[i] == num) {
				flag = true;
				// System.out.println(a[i]);
				// System.out.println("Given number is Present in the given
				// array");
			}

		}
		return flag;
	}

	void display() {
		if (flag == true) {
			System.out.println("Given number is Present in the given array");
		}
		if (flag == false) {
			System.out.println("Given number is not present in the given array");
		}

	}

}