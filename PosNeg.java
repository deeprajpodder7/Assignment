
//WAJP to get a number from the user and print whether it is positive or negative.

package assignment23aug;

import java.util.*;
public class PosNeg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("Enter a non-decimal number:");
Scanner sc = new Scanner(System.in);
int a = sc.nextInt();
if (a>0) {
System.out.println("The number is positive");
	}
else if (a==0) {
	System.out.println("The number is neither negative nor positive");
}
else {
	System.out.println("The number is negative");
}
}
}