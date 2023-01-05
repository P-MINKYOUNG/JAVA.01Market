package market.run;

import java.util.Date;

public class Himedia extends Market {

	// 가격을 정하는 메소드
	@Override
	public int selectProduct() {

		// 새로운 객체에 productList의 리턴값을 받아서 저장해준다.
		ProductDTO[] sProduct = productList();

		// 동일 숫자가 아닐 경우
		if (i != i2 || i != i3 || i2 != i3) {
			// 랜덤으로 받은 숫자를 인덱스로 하는 배열의 인덱스로 저장한 숫자가 1일경우 식품에 해당하므로 10프로 할인을 적용한다.
			if (sProduct[i].getIndex() == 1)
				discount1 = (int) ((sProduct[i].getPrice()) * 0.9);
			if (sProduct[i2].getIndex() == 1)
				discount2 = (int) ((sProduct[i2].getPrice()) * 0.9);
			if (sProduct[i3].getIndex() == 1)
				discount3 = (int) ((sProduct[i3].getPrice()) * 0.9);
		}

		// 리턴값으로 할인된 상품들의 가격을 모두 더해준다
		return discount1 + discount2 + discount3;
	}

	// 오늘 장볼 물품들의 가격을 모두 더하고, 가진 돈에서 그것을 뺀 값을 출력하는 메소드(오버라이드)
	@Override
	public int finalMoney() {

		ProductDTO[] allMoney = productList();

		// 랜덤으로 받은 돈
		System.out.println("money : " + money);

		// 만약 배열의 인덱스가 1이 아닐 경우 할인하지 않으므로 그것의 값을 noDiscount에 저장한다.
		if (allMoney[i].getIndex() != 1)
			noDiscount1 = allMoney[i].getPrice();

		if (allMoney[i2].getIndex() != 1)
			noDiscount2 = allMoney[i2].getPrice();
		if (allMoney[i3].getIndex() != 1)
			noDiscount3 = allMoney[i3].getPrice();

		// 할인되지 않은 상품들의 값을 모두 더해준다.
		sumNoDiscount = noDiscount1 + noDiscount2 + noDiscount3;

		System.out.println("sumNoDiscount : " + sumNoDiscount);

		// 할인되지 않은 상품의 가격 + 할인된 상품의 가격
		sumAll = sumNoDiscount + selectProduct();

		System.out.println("sumAll : " + sumAll);

		// 가진 돈에서 상품의 가격을 모두 합한 것 만큼 빼준다.
		int minusMoney = money - sumAll;

		System.out.println("최종 값 : " + minusMoney);

		return minusMoney;
	}

	// 영수증 출력
	@Override
	public void reciept() {

		System.out.print("========== 영수증 =========");
		System.out.println();
		System.out.print("장 본 물건 : ");
		todayList();
		System.out.println();
		System.out.print("물품 가격 :");
		System.out.println();
		System.out.print("--------------------------");
		System.out.println();
		System.out.print("총 금액 :");
		finalMoney();
		System.out.println();
		System.out.print("성공 여부 :");
		System.out.println();
		System.out.print(date);

	}
}
