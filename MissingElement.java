package week2.day2;


import java.util.Arrays;

public class MissingElement {

	public static void main(String[] args) {
	
		int[] a = { 1,2,3,4,6,7,8,99 };
		Arrays.sort(a);
	
		for (int i = a[0]; i < a[a.length-1]; i++)
		{
			int k = 0;
			for (int j = 0; j <a.length;j++) {
				if (i == a[j]) {
					k=1;
					break;
				}
			}
			if(k == 0) {
				System.out.println("Number "+i+" is mising in array");
			}
			
			
			
		}

	}

}

