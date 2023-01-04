package market.run;

import java.util.Scanner;

public class Application {

	public static void main(String[] args) {

		Application app = new Application();
		Product[] productList = app.loadProductList();

		Scanner sc = new Scanner(System.in);
		System.out.print("이름을 입력하세요 : ");
		String name = sc.next();

		System.out.println("==================");
		System.out.println("오늘의 장보기 : ");

	}

	public Product[] loadProductList() {

		Product[] productList = new Product[9];

		productList[0] = new Product(1, "라면", 5000);
		productList[1] = new Product(1, "김치", 10000);
		productList[2] = new Product(1, "계란", 10000);
		productList[3] = new Product(2, "삼겹살", 30000);
		productList[4] = new Product(2, "소고기", 40000);
		productList[5] = new Product(2, "항정살", 20000);
		productList[6] = new Product(3, "휴지", 10000);
		productList[7] = new Product(3, "쓰레기통", 3000);
		productList[8] = new Product(3, "비누", 2000);

		for (Product p : productList) {
			System.out.println(p);

			return productList;

		}

	}
}
