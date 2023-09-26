package Arrays;

import java.util.Arrays;

public class Arrayexm {

	public static void main(String[] args) {
		
		// the main purpose is to sort the arrays
		
		int[] a = {5,4,7,87,94};
		for(int a1 : a) {
			System.out.println(a1);
		}
		System.out.println("==================");
		Arrays.sort(a);
		for(int a1 : a) {
			System.out.println(a1);
		}
		System.out.println(Arrays.binarySearch(a, 94));

		System.out.println("=================");
		String[] s = {"a","z","b","c"};
		Arrays.sort(s);
		for(String s1 : s) {
			System.out.println(s1);
		}
		System.out.println(Arrays.binarySearch(s, "b"));
	}

}
