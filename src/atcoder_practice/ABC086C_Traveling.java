package atcoder_practice;

import java.util.Scanner;

public class ABC086C_Traveling {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[]t = new int[N];
		int[]x = new int[N];
		int[]y = new int[N];
		for(int i = 0;i < N ;i++) {
			t[i] = sc.nextInt();
			x[i] = sc.nextInt();
			y[i] = sc.nextInt();
			
			if(i == 0) {
				//初期処理
				int dt = t[i];
				//System.out.println("dt"+dt);
				int dist = Math.abs(x[i])+Math.abs(y[i]);
				//System.out.println("dist"+dist);
				if(dt<dist || (dt-dist)%2 != 0) {
					System.out.println("No");
					return;
				}
			}else {
				//通常処理
				int dt = t[i]-t[i-1];
				//System.out.println("dt"+dt);
				int dist = Math.abs(x[i]-x[i-1])+Math.abs(y[i]-y[i-1]);
				//System.out.println("dist"+dist);
				if(dt<dist || (dt-dist)%2 != 0) {
					System.out.println("No");
					return;
				}
					
				
			}
		}
		System.out.println("Yes");
		
	}
}
