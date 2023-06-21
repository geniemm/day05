package while_;

import java.util.Scanner;

public class Test01 {
public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	System.out.print("길이 입력: ");
	int length = sc.nextInt();
	
	int p,b;
	for (p=1;p<=length;p++) {
		System.out.print("P");
		
		for(b=1;b<=length;b++) {
			System.out.print("B");
		}
		if(p%(length)==1) {
			System.out.println();
		}	
	}
}
}
