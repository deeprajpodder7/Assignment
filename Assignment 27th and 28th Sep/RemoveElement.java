package Array;
import java.util.Scanner;

public class RemoveElement
{
   public static void main(String[] args)
   {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the size of array: ");
  	int size=sc.nextInt();
      int[] arr=new int[size];
      System.out.println("Enter the array elements: ");
      for (int i = 0; i < size; i++) {
			arr[i]=sc.nextInt();
		}
      System.out.print("Enter the Element to Remove: ");
      int element = sc.nextInt();
      
      for(int i=0; i<size; i++)
      {
         if(element==arr[i])
         {
           arr[i]=arr[i+1];
            System.out.println("\nRemoved the element successfully!");
            System.out.println("\nThe new array is: ");
            for(i=0; i<(size-1); i++)
               System.out.print(arr[i]+ " ");
            break;
         }
         else {
        	 System.out.println("Element to be removed not found");
        	 break;
         }         
      }
      
   }
}
