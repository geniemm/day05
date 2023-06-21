package while_;

public class TestClass08 {
public static void main(String[] args) {
//	for(int i=0;i<3;i++) {
//		for(int k=0;k<5;k++) {
//			System.out.println(i+","+k);
//		}
//	}

	for(int i=2;i<10;i++) {
		for(int k=1;k<10;k++) {
			System.out.println(i+"X"+k+"="+(i*k));
		}
		System.out.println();
	}
	
	for(int i=1;i<10;i++){
		for(int k=2;k<10;k++) {
			System.out.print(k+"X"+i+"="+(k*i)+"\t");
		}
		System.out.println("");
	}
}
}
