package market.run;

import java.util.*;

public class Market {

	protected int discount1, discount2, discount3;
	protected Date date = new Date();
	protected int i = (int) (Math.random() * 9);
	protected int i2 = (int) (Math.random() * 9);
	protected int i3 = (int) (Math.random() * 9);
	protected int money = (int) (Math.random() * 50 + 1) * 1000;
	protected int noDiscount1, noDiscount2, noDiscount3, sumNoDiscount;
	protected int sumAll;

	// getters & setters
	public int getDiscount1() {
		return discount1;
	}

	public void setDiscount1(int discount1) {
		this.discount1 = discount1;
	}

	public int getDiscount2() {
		return discount2;
	}

	public void setDiscount2(int discount2) {
		this.discount2 = discount2;
	}

	public int getDiscount3() {
		return discount3;
	}

	public void setDiscount3(int discount3) {
		this.discount3 = discount3;
	}

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

	public int getNoDiscount1() {
		return noDiscount1;
	}

	public void setNoDiscount1(int noDiscount1) {
		this.noDiscount1 = noDiscount1;
	}

	public int getNoDiscount2() {
		return noDiscount2;
	}

	public void setNoDiscount2(int noDiscount2) {
		this.noDiscount2 = noDiscount2;
	}

	public int getNoDiscount3() {
		return noDiscount3;
	}

	public void setNoDiscount3(int noDiscount3) {
		this.noDiscount3 = noDiscount3;
	}

	public int getSumNoDiscount() {
		return sumNoDiscount;
	}

	public void setSumNoDiscount(int sumNoDiscount) {
		this.sumNoDiscount = sumNoDiscount;
	}

	public int getSumAll() {
		return sumAll;
	}

	public void setSumAll(int sumAll) {
		this.sumAll = sumAll;
	}

	// 각 상품명과 가격을 배열에 저장
	public ProductDTO[] productList() {

		ProductDTO[] productList = { new ProductDTO(1, "라면", 5000), new ProductDTO(1, "김치", 8000),
				new ProductDTO(1, "계란", 10000), new ProductDTO(2, "삼겹살", 30000), new ProductDTO(2, "소고기", 40000),
				new ProductDTO(2, "항정살", 20000), new ProductDTO(3, "휴지", 10000), new ProductDTO(3, "쓰레기통", 3000),
				new ProductDTO(3, "비누", 2000) };

		return productList;

	}

	// 장 볼 목록을 랜덤으로 골라주는 메소드
	public void todayList() {
		ProductDTO[] productlist = productList();

		label: while (true) {
			// 랜덤으로 저장한 숫자를 인덱스로 가지는 배열의 상품명을 가져온다.(동일 숫자인 경우 반복문으로 돌아가 다시 숫자 출력)
			if (i != i2 || i != i3 || i2 != i3) {
				System.out.print(productlist[i].getProduct() + " ");
				System.out.print(productlist[i2].getProduct() + " ");
				System.out.print(productlist[i3].getProduct());
				break;
			} else {
				continue label;
			}
		}
	}

	// 선택한 상품에 해당하는 할인 상품 가격의 합계를 정하는 메소드(오버라이드)
	public int setProductPrice() {
		return 0;
	}

	// 오늘 장볼 물품들의 가격을 모두 더하고, 가진 돈에서 그것을 뺀 값을 출력하는 메소드(오버라이드)
	public int finalMoney() {
		return 0;
	}
	// 엄마찬스

	// 영수증 출력 메소드(날짜, 가격, 값, 상품 목록)(오버라이드)
	public void reciept() {
	}
}
