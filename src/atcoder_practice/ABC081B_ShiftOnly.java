package atcoder_practice;

import java.util.Scanner;

public class ABC081B_ShiftOnly {
	public static void main(String[] args) {
		int count = Integer.MAX_VALUE;
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];
		for(int i = 0;i < n; i++) {
			a[i] = sc.nextInt();
			int x = 0;
			//a[i]について何回2で割れるか計算
			while(a[i] % 2 == 0) {
				a[i] = a[i]/2;
				x++;
			}
			if(x<count) {
				count = x;
			}
			//もしcountより多かったら更新
		}
		
		System.out.println(count);
    }
}
