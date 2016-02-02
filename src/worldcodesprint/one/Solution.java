package worldcodesprint.one;

import java.util.ArrayList;
import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s = in.next();
		String strExp = "";
		int count = 0;
		if (s.length() % 3 == 0) {
			int n = s.length()/3;
			for (int i = 0; i < n; i++) {
				strExp = "SOS".concat(strExp);
			}
		}
		for (int i = 0; i < s.length(); i++) {
			if (i > 0) { break; }
			for (int j = 0 ; j < strExp.length(); j++) {
				if (s.charAt(i) != strExp.charAt(j) ) {
					count++;
				}
				i++;
			}
		}
		System.out.println(count);
	}

}
