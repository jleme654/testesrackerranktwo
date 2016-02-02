package worldcodesprint.one;

import java.util.ArrayList;
import java.util.Scanner;

public class Solution8 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s = in.next();
		int count = 0;
		if (s.length() % 3 == 0) {
			for (int i = 0; i < s.length(); i++) {
				if (!String.valueOf(s.charAt(i)).equals("S")) {
					count++;
				}else if (!String.valueOf(s.charAt(i + 1)).equals("O")) {
					count++;
				}else if (!String.valueOf(s.charAt(i + 2)).equals("S")) {
					count++;
				}
				i = i + 2;
			}
		}
		System.out.println(count);
	}

}
