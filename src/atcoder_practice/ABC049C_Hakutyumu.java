package atcoder_practice;

import java.util.Scanner;

public class ABC049C_Hakutyumu {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		String[] words = {"dreamer", "eraser", "dream", "erase"};
		while(!S.isEmpty()) {
			boolean frag = false;
			for (String word : words) {
			    if (S.endsWith(word)) {
			        S = S.substring(0, S.length() - word.length());
			        frag = true;
			        break;
			    } 
			}
			if(!frag) {
		    	System.out.println("NO");
		    	return;
		    }
		}
		System.out.println("YES");
	}
}
