package hackerranck.loveletter;

import java.util.Scanner;

public class Solution2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), count = 0;
		for (int i = 0; i < n; i++) {
			String s = sc.next();
			for (int i2 = 0, j = s.length() - 1; i2 < j; i2++, j--) {
				if (s.charAt(j) == s.charAt(i2))
					count = 0;
				else
					count += Math.abs(s.charAt(j) - s.charAt(i2));
			}
			System.out.println(count);
			count = 0;
		}
	}

}
