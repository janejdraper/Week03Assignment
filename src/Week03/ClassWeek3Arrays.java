package Week03;

import java.util.*;

public class ClassWeek3Arrays {

	public static void main(String[] args) {
		char [] a = {'a','b','c','d','e','f'};
		String[] b = {"February", "March","April"};
		int [] c = {1,2,3,4,5};
		
		for (int i=0; i< a.length; i++) {
			System.out.println(a[i]);
		} //a[0] is the first item in the array
		// If you set the iterations beyond the size of the array, you'll get an error when sysout
		for (int i=0; i<b.length; i++) {
			System.out.println(b[i]);
		}
		
		for (int i=0; i<c.length; i++) {
			System.out.println(c[i]);
			for (int j=0; j< a.length; j++) {
				System.out.println(a[j]);
			}
		}
	}

}
