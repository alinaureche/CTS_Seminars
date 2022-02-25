package eu.ase.ro.classes;

public class Utils {
	public static int aparitii(int[] nr) {
		int min = nr[0];
		int apar = 0;
		
		for (int i = 0; i < nr.length; i ++) {
			if (min == nr[i]) {
				apar ++;
			}
			
			if (min > nr[i]) {
				min = nr[i];
				apar = 1;
			}
				
		}
		
		return apar; 
		
	}
}
