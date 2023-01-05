package market.run;

import java.util.*;

public class Market {

	public int[] discount = new int[3];
	public Date date = new Date();
	int i = (int) (Math.random() *9);
	int i2 = (int) (Math.random() *9);
	int i3 = (int) (Math.random() *9);
	int money = (int) (Math.random() * 50 + 1) * 1000;
	int sum;
	
	public int getI() {
		return i;
	}

	public void setI(int i) {
		this.i = i;
	}

	public int getI2() {
		return i2;
	}

	public void setI2(int i2) {
		this.i2 = i2;
	}

	public int getI3() {
		return i3;
	}

	public void setI3(int i3) {
		this.i3 = i3;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	// 각 상품명과 가격을 배열에 저장
	public ProductDTO[] productList() {

		ProductDTO[] productList = { new ProductDTO(1, "라면", 5000), new ProductDTO(1, "김치", 8000),
				new ProductDTO(1, "계란", 10000), new ProductDTO(2, "삼겹살", 30000), new ProductDTO(2, "소고기", 40000),
				new ProductDTO(2, "항정살", 20000), new ProductDTO(3, "휴지", 10000), new ProductDTO(3, "쓰레기통", 3000),
				new ProductDTO(3, "비누", 2000) };

		return productList;

	}

	//장 볼 목록을 랜덤으로 골라주는 메소드
	public void todayList() {
		ProductDTO[] productlist = productList();
		
		label:
		while (true) {

			if (i != i2 && i != i3) {
				System.out.print(productlist[i].getProduct() + " ");
				System.out.print(productlist[i2].getProduct() + " ");
				System.out.print(productlist[i3].getProduct());
				break;
			} else {
				continue label;
			}
		}
	}

	// 할인 상품 가격을 정하는 메소드(오버라이드)
	public int[] selectProduct(ProductDTO[] product) {
	
		ProductDTO[] sProduct = product;

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
	
	//오늘 장볼 물품들의 가격을 모두 더하고, 가진 돈에서 그것을 뺀 값을 출력하는 메소드(오버라이드)
	public int finalMoney(int[] discount3) {

		int[] discount2 = discount3;

		for (int i = 0; i < discount2.length; i++) {
			System.out.println("discount[i] : " + discount2[i]);
			sum += discount2[i];
		}

		System.out.println("sum : " + sum);
		
		int minusMoney = money - sum;
		
		System.out.println("최종 값 : " + minusMoney);

		return minusMoney;
	}
	//엄마찬스
	

	// 영수증 출력 메소드(날짜, 가격, 값, 상품 목록)(오버라이드)
	public void reciept() {

		System.out.println("========== 영수증 =========");
		System.out.println("장 본 물품	: ");
		System.out.println("물품 가격		: ");
		System.out.println("--------------------------");
		System.out.println("총 금액		: ");
		System.out.println("성공 여부		: ");
		System.out.println(date);

	}
}
