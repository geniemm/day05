package while_;

public class TestClass10 {
public static void main(String[] args) {
	String n1 =null, n2 ="test";
	System.out.println(n2.equals(n1));
	//System.out.println(n1.equals(n2)); 
	// n1이 값을 갖고있지 않아서 equals를 사용할수없다.
	
	if(n1==null) {
		System.out.println("n1에 값 입력먼저 하세요");
	}else {
		System.out.println(n1.equals(n2));
	}
}
}
