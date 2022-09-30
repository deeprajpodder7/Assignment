package Array;

import java.util.*;

public class DuplicateElement {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    System.out.println("Enter the size of array: ");
		int size=sc.nextInt();
	    int[] arr=new int[size];
	    System.out.println("Enter the array elements: ");
	    for (int i = 0; i < size; i++) {
				arr[i]=sc.nextInt();
	    }
		for (int i = 0; i < size; i++) {
		     for (int j = i + 1 ; j < size; j++) {
		          if (arr[i]==arr[j]) {
		               System.out.println("The duplicate element is: " +arr[j]);
		          }
		     }
		 }
	}

}
