package while_;

import java.util.Scanner;

public class TestClass09 {
public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);

	System.out.print("1. 이름 입력: ");
	String name1=sc.next();

	System.out.print("2. 이름 입력: ");
	String name2=sc.next();

	System.out.println("n1 == n2: "+(name1.equals(name2)));
	if(name1.equals(name2)) {
		System.out.println("이름이 같다.");
	}
	else {
		System.out.println("이름이 다르다.");
	}

}
}
