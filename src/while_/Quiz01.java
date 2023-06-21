package while_;

import java.util.Scanner;

public class Quiz01 {
public static void main(String[] args) {
	
	

			/******************************
			※ 출력결과
			1 0 0 0 0 0 0
			0 2 0 0 0 0 0
			0 0 3 0 0 0 0
			0 0 0 4 0 0 0
			0 0 0 0 5 0 0
			0 0 0 0 0 6 0
			0 0 0 0 0 0 7
			******************************/
	
		Scanner sc = new Scanner(System.in);
		
		int i,j,num;
		System.out.print("수 입력: ");
		num =sc.nextInt();
		
		for (i=1;i<=num;i++) {
			System.out.println(i);
			for(j=0;j<=i;j++) {
				if(i==j) {
					System.out.print(i);
				}else
					System.out.print(0);
			}
		}
		
		
		
}
}
