package Array;

public class MaxElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int arr[]= {20,60,70};
	System.out.println(findmax(arr));
	}
	
	public static int findmax(int arr[]){
		int max=0;
		for(int i=0;i<3;i++) {
			if(arr[i]>max) 
			{
				max=arr[i];
			}
		}
		return max;
	}
	
	}


