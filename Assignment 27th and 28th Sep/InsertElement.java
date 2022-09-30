package Array;

import java.util.*;

public class InsertElement {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements:");
		int n = sc.nextInt();
		int[] arr = new int[n + 1];
		System.out.println("Enter the elements");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Enter position to insert: ");
		int position = sc.nextInt();
		System.out.println("Enter element to insert: ");
		int element = sc.nextInt();
		for (int i = n - 1; i >= position; i--) {
			arr[i + 1] = arr[i];
		}
		n = n + 1;
		arr[position] = element;
		System.out.println("	On inserting new array we get is\n");
		for (int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
