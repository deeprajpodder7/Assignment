//WAJP to take three numbers from the user and print the greatest number.

package assignment23aug;

import java.util.*;
public class Greatest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a,b,c;
Scanner sc = new Scanner (System.in);
System.out.println("Enter first number:");
a= sc.nextInt();
System.out.println("Enter second number:");
b= sc.nextInt();
System.out.println("Enter third number:");
c= sc.nextInt();
if(a>b && a>c) {
	System.out.println("The greatest number is:" +a);
}
else if(b>a && b>c) {
	System.out.println("The greatest number is:" +b);
}
else {
	System.out.println("The greatest number is:" +c);
}
	}

}
