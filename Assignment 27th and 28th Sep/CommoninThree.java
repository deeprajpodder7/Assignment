package Array;

public class CommoninThree {
	public static void main(String[] args) {
		int arr1[] = { 2, 4, 8 };
		int arr2[] = { 2, 3, 4, 8, 10, 16 };
		int arr3[] = { 4, 8, 14, 40 };
		int i = 0, j = 0, k = 0;
		System.out.println("Common elements: ");
		while (i < arr1.length && j < arr2.length && k < arr3.length) {
			if (arr1[i] == arr2[j] && arr2[j] == arr3[k]) {
				System.out.println(arr1[i] + " ");
				i++;
				j++;
				k++;
			} else if (arr1[i] < arr2[j])
				i++;

			else if (arr2[j] < arr3[k])
				j++;

			else
				k++;
		}
	}
}
