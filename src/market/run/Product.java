package market.run;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class Product {

	private int index;
	private String product;
	private int price;
	public Date date = new Date();
	public int[] discount = new int[3];

	// 기본 생성자
	public Product() {
		super();
	}

	// 모든 변수를 초기화 하는 생성자
	public Product(int index, String product, int price) {
		super();
		this.index = index;
		this.product = product;
		this.price = price;
	}

	// getters & setters

	public int getIndex() {
		return index;
	}

	public int[] getDiscount() {
		return discount;
	}

	public void setDiscount(int[] discount) {
		this.discount = discount;
	}

	public void setIndex(int index) {
		this.index = index;
	}

	public String getProduct() {
		return product;
	}

	public void setProduct(String product) {
		this.product = product;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Product [index=" + index + ", product=" + product + ", price=" + price + "]";
	}

	// 제품 리스트
	public Product[] loadProductList() {

		Product[] productList = new Product[9];

		productList[0] = new Product(1, "라면", 5000);
		productList[1] = new Product(1, "김치", 8000);
		productList[2] = new Product(1, "계란", 10000);
		productList[3] = new Product(2, "삼겹살", 30000);
		productList[4] = new Product(2, "소고기", 40000);
		productList[5] = new Product(2, "항정살", 20000);
		productList[6] = new Product(3, "휴지", 10000);
		productList[7] = new Product(3, "쓰레기통", 3000);
		productList[8] = new Product(3, "비누", 2000);

		return productList;
	}

	// 가격을 정하는 메소드
	public int[] selectProduct(Product[] product) {
		int money = (int) (Math.random() * 50 + 1) * 1000;

		Product[] sProduct = product;

		List<Product> list = Arrays.asList(product);

		for (int i = 0; i < sProduct.length; i++) {
			switch (sProduct[i].getIndex()) {
			case 1:
				discount[i] = (int) (sProduct[i].getPrice() * 0.9);
			default:
				break;
			}
		}

		return discount;
	}

	// 영수증 출력 메소드(날짜, 가격, 값, 상품 목록)
	public void reciept(int[] discount) {

		int[] discount2 = discount;

		int sum = 0;
		for (int i = 0; i < discount2.length; i++) {
			sum += discount2[i];
		}
		
		System.out.println("========== 영수증 =========");
		System.out.println("장 본 물품	: ");
		System.out.println("물품 가격		: ");
		System.out.println("--------------------------");
		System.out.println("총 금액		: " + sum);
		System.out.println("성공 여부		: ");
		System.out.println(date);

	}
}
