package hackerranck.palindrome;

import java.util.Scanner;

public class Solution {
	
	static int verifyIndex(char[] arr){
		int index = 0, j = 0, pal = 0;
		for (index = 0; index < arr.length; index++) {
			if (index == arr.length - 1) {
				return index;
			}
			for (j = index + 1; j < arr.length - 1; j++) {
				for (int j2 = arr.length - 1; j2 > j; j2--) {
					if (j == j2) { break; }
					if (arr[j] != arr[j2]){
						break;
					} pal++;
				}	
			}
			if (pal > 0) { return index; }
		}		
		return index;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			String s = sc.next();
			char[] arr = new char[s.length()];
			for (int j = 0; j < s.length(); j++) {
				char c = s.charAt(j);
				arr[j] = c;
			}
			System.out.println(verifyIndex(arr));
		}

	}

}
