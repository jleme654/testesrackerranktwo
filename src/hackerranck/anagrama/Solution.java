package hackerranck.anagrama;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Solution {

	static int getAnagram(String s) {
		int count = 0, i = 0;
		if (s.length() % 2 == 1) {
			return -1;
		}
		String sLeft = s.substring(0, s.length() / 2);
		String sRight = s.substring(s.length() / 2, s.length());
		if (sLeft.equals(sRight)) {
			return 0;
		}
		ArrayList<Character> list = new ArrayList<Character>();
		for (i = 0; i <sRight.length(); i++) {
			list.add(sRight.charAt(i));
		}
		for (i = 0; i < sLeft.length(); i++) {
			if (!list.contains(sLeft.charAt(i))) {
				count++;
			}	
		}
		return count;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			String s = sc.next();
			System.out.println(getAnagram(s));
		}
	}

}
