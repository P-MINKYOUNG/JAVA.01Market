package market.run;

import java.util.Scanner;

public class Application {

	public static void main(String[] args) {

//		Scanner sc = new Scanner(System.in);
//		System.out.print("이름을 입력하세요 : ");
//		String name = sc.next();
//
//		System.out.println("==================");
//		System.out.println("오늘의 장보기 : ");
		
		Himedia hi = new Himedia();
		Product pro = new Product();
		
		hi.selectProduct(pro.loadProductList());

	}

	
}
