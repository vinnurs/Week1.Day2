package week2.day2;

import java.util.Arrays;

public class FindMissingelement {

	public static void main(String[] args) {
	
		int[] a = { 1,2,3,4,6,7,8};
		Arrays.sort(a);
	
		for (int i = 0; i < a.length; i++) {
			if (i+1 != a[i]) {
				System.out.println(i+1);
				break;
			}

}
	}
	
}

