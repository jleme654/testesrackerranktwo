package hackerranck.alternative;

import java.util.Scanner;

public class Solution {	
	
	static int getDeletes(String s){
		int count = 0;		
		for (int j = 1; j < s.length(); j++) {
			if (s.charAt(j) == s.charAt(j - 1)) {
				count++; 
			}
		}
		return count;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), count = 0;
		for (int i = 0; i < n; i++) {
			String s = sc.next();
			System.out.println(getDeletes(s));
		}
	}
}
