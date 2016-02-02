package worldcodesprint.three;

import java.util.ArrayList;
import java.util.Scanner;

public class Solution2 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		String s2 = sc.nextLine();
		ArrayList<Character> list = new ArrayList<Character>();
		ArrayList<Character> list2 = new ArrayList<Character>();
		int count = 0;
		for (int i = 0; i < s.length(); i++) {
			list.add(s.charAt(i));
		}
		System.out.println(list);
		for (int i = 0; i < s2.length(); i++) {
			list2.add(s2.charAt(i));
		}
		System.out.println(list2);
		for (Character c : list) {
			if (!list2.contains(c)) {
				count++;
			}
		}
		System.out.println(count);
		for (Character c : list2) {
			if (!list.contains(c)) {
				count++;
			}
		}
		System.out.println(count);
	}

}
