package atcoder_practice;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class ABC085B_KagamiMochi {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();

		Set<Integer> a = new LinkedHashSet<>();
		for (int i = 0; i < N; i++) {
		    a.add(sc.nextInt());
		}

		int count =a.size();
		System.out.println(count);
    }
}

