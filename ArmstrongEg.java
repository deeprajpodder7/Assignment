package Rough;

public class ArmstrongEg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 370, a, temp, sum = 0;

        a = n;
        while (a != 0)
        {
            temp = a % 10;
            sum = sum + temp*temp*temp;
            a /= 10;
        }

        if(sum == n)
            System.out.println(n + " is an Armstrong a");
        else
            System.out.println(n + " is not an Armstrong a");
	}

}
