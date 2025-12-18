package atcoder_practice;

import java.util.Scanner;

public class ABC083B_SomeSums {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();
		int count = 0;
		
		for(int i = 1;i<=n;i++) {
			int sum = 0;
			int temp = i;
			while (temp > 0) {
			    int digit = temp % 10;  // 右端の桁
			    sum += digit;
			    temp = temp / 10;           // 右端を取り除く
			}
			if(a<=sum && sum<=b) {
				count+= i;
			}
		}
		
		System.out.println(count);
	}
}
