package while_;

public class TestClass06 {
public static void main(String[] args) {
	
	/*
	  do - while 문
	  - 무조건 한번은 실행된다.
	  do{
	  	종속문장
	  }while(조건식);
	   
	 */
	int i=10;
	int su =5;
	do {
		System.out.println(i);
		i++;
		//거짓이지만 한번은 실행된다
	}while(i<su);
	System.out.println("다음문장 실행");
	
}
}
