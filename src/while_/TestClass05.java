package while_;

import java.util.Scanner;

public class TestClass05 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int i,temp;
	System.out.print("수 입력: ");
	i=sc.nextInt();
	
	boolean bool = true;
	while(bool) {
		// i : 123
		temp = i%10; // >> 123%10 나머지값은 3
		i=i/10; 	//  123/10 몫은 12 > i 값에 12 대입
		System.out.printf("%2d",temp);
		if(i==0) {
			bool = false;
		}
	}
	System.out.println("\n다음 문장 실행");
}
}
