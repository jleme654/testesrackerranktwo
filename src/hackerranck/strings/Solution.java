package hackerranck.strings;

import java.util.HashSet;
import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			HashSet<Character> set = new HashSet<Character>();
			HashSet<Character> set2 = new HashSet<Character>();
			for (int j = 0; j < 2; j++) {
				if (j == 0) {
					String s = sc.next();
					for (int j2 = 0; j2 < s.length(); j2++) {
						char c = s.charAt(j2);
						set.add(c);
					}
				} else if (j == 1) {
					String s = sc.next();
					for (int j2 = 0; j2 < s.length(); j2++) {
						char c = s.charAt(j2);
						set2.add(c);

					}
				}
			}
			int yes = 0, no = 0;
			for (Character c : set) {
				if (set2.contains(c))
					yes++;
				else
					no++;
			}
			if (yes >= no) 
				System.out.println("YES");
			else
				System.out.println("NO");
		}

	}

}
