package hackerranck.loveletter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), count = 0;
		for (int i = 0; i < n; i++) {
			String s = sc.next();
			char[] tcArray = s.toCharArray();
			char[] tcArrayReverse = s.toCharArray();
			ArrayList<Character> list = new  ArrayList<Character>();
			for (int j = 0; j < tcArrayReverse.length; j++) {
				list.add(tcArrayReverse[j]);
			}
			Collections.reverse(list);
			for(int j = 0;j < (tcArray.length/2); j++){
			    count += Math.abs(tcArray[j] - list.get(j));
			}
			System.out.println(count);
			count = 0;
		}
	}

}
