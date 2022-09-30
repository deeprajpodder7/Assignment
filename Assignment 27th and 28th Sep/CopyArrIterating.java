package Array;

import java.util.Scanner;

public class CopyArrIterating {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the size of array: ");
	int size=sc.nextInt();
    int[] arr=new int[size];
    int[] newarr=new int[size];
    System.out.println("Enter the array elements: ");
    for (int i = 0; i < size; i++) {
			arr[i]=sc.nextInt();
    }
    for (int i = 0; i < size; i++) {
		newarr[i]=arr[i];
} 
    System.out.println("The newly copied array: ");
    for (int i = 0; i < size; i++) {
	System.out.print(newarr[i] + " ");
}
}
}
