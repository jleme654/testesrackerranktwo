package worldcodesprint.three;

import java.util.Scanner;

public class Solution {

	static int op(String s1, String s2) {
		int n1 = s1.length();
		int n2 = s2.length();
		int[] array1 = new int[26];
		int[] array2 = new int[26];
		for (int i = 0; i < n1; i++) {
			char c = s1.charAt(i);
			array1[c - 97]++;
		}
		for (int i = 0; i < n2; i++) {
			char c = s2.charAt(i);
			array2[c - 97]++;
		}
		int sum = 0;
		for (int i = 0; i < 26; i++) {
			sum += Math.abs(array1[i] - array2[i]);
		}
		return sum;

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		String s2 = sc.nextLine();
		System.out.print(op(s, s2));
	}

}
