package hackerranck.pangram;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String st = sc.nextLine();
		st = st.replaceAll(" ", "").toLowerCase();
		List list = Arrays.asList('a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's',
				't', 'u', 'v', 'w', 'x', 'y', 'z' );
		HashSet<Character> list2 = new HashSet<Character>();
		for (int i = 0; i < st.length(); i++) {
			list2.add(st.charAt(i));
		}
		if (list.size() > list2.size())
			System.out.println("not pangram");

		else
			System.out.println("pangram");
	}
}
