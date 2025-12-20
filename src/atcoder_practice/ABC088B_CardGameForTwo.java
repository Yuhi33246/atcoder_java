package atcoder_practice;

import java.util.Arrays;
import java.util.Scanner;

public class ABC088B_CardGameForTwo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		for(int i = 0;i < n;i++) {
			a[i] = sc.nextInt();
		}
		Arrays.sort(a);
		int count=0;
		int frag=0;
		for(int i = a.length-1;i >=0;i--) {
			if(frag%2 ==0) {
				count+=a[i];
			}else {
				count-=a[i];
			}
			frag++;
		}
		System.out.println(count);
    }
}
