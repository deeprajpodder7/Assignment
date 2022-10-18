package Assignment18Oct;

import java.util.Scanner;

public class MultipleCatch {

    public static void main(String[] args) {
        int x, y, z;
        int[] arr = null;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st number: ");
        x = sc.nextInt();
        System.out.println("Enter 2nd Number: ");
        y = sc.nextInt();
        try {
            z = x / y; 
            System.out.println(arr[0]);
        }
        catch (ArithmeticException e) {
            z = 0;
            System.out.println(e);
        }
        catch (NullPointerException e) {
            System.out.println(e);
        }
    }
    
}
