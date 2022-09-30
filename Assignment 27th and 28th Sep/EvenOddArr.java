package Array;

import java.util.Scanner;

public class EvenOddArr {
	public static void main(String[] args) {
		int countOdd=0;
		int countEven=0;
	Scanner sc = new Scanner(System.in);
    System.out.println("Enter the size of array: ");
	int size=sc.nextInt();
    int[] arr=new int[size];
    System.out.println("Enter the array elements: ");
    for (int i = 0; i < size; i++) {
			arr[i]=sc.nextInt();
    }
    for (int i = 0; i < size; i++) { System.out.print(arr[i] + " ");
		if(arr[i]%2==0) {
			countEven++;
		   System.out.println("Even numbers: " +arr[i]);
		}
		else {
			System.out.println("Odd numbers: " +arr[i]);
			countOdd++;
		}
}
   System.out.println("Number of Even numbers: " +countEven); 
   System.out.println("Number of Odd numbers: " +countOdd);
}}
