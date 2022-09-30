package Array;

import java.util.*;
public class SecondLargest {
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		    System.out.println("Enter the size of array: ");
			int size=sc.nextInt();
		    int[] arr=new int[size];
		    System.out.println("Enter the array elements: ");
		    for (int i = 0; i < size; i++) {
					arr[i]=sc.nextInt();
		    }
        Arrays.sort(arr);
     System.out.println(arr[size-2]);
	}
}

