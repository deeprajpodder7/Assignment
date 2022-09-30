package Array;
import java.util.*;

public class FindIndex {
    public static void main(String[] args) {
    	Scanner sc=new Scanner(System.in);
    	System.out.println("Enter the size of array: ");
    	int size=sc.nextInt();
        int[] numbers=new int[size];
        System.out.println("Enter the array elements: ");
        for (int i = 0; i < size; i++) {
			numbers[i]=sc.nextInt();
		}
        System.out.println("Enter the element to be found: ");
        int element = sc.nextInt();
        int index = -1;
        int i = 0;
        while(i < size) {
            if(numbers[i] == element) {
                index = i;
                break;
            }
            i++;
        }  
        System.out.println("Index of "+element+" is : "+index);
    }
}
