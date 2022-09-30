package Array;
import java.util.*;
//Write a Java Program to reverse the array contents.
public class ReverseArray {
	public static void main(String[] args) {  
Scanner sc=new Scanner(System.in);
System.out.println("Enter array size: ");
int size = sc.nextInt();
int [] arr = new int [size];
        System.out.print("Enter numbers: ");  
        for (int i = 0; i < arr.length; i++) {  
            arr[i]=sc.nextInt();
        }  
        System.out.println("Original array: ");  
        for (int i = 0; i < arr.length; i++) {  
            System.out.print(arr[i] + " ");  
        }  
        System.out.println();  
        System.out.println("Array in reverse order: ");  
         
        for (int i = arr.length-1; i >= 0; i--) {  
            System.out.print(arr[i] + " ");  
        }  
    }  
}

