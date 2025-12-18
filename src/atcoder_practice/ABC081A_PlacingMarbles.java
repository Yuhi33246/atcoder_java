package atcoder_practice;

import java.util.Scanner;

public class ABC081A_PlacingMarbles {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int count = 0;
		for (char c : s.toCharArray()) {
		    if (c == '1') count++;
		}
		System.out.println(count);
    }
}
