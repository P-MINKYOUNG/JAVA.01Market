package market.run;

import java.util.Date;

public class Himedia extends Market {

	// 가격을 정하는 메소드
	@Override
	public int selectProduct() {

		ProductDTO[] sProduct = productList();

		if (sProduct[i].getIndex() == 1 && sProduct[i2].getIndex() == 1 && sProduct[i3].getIndex() == 1) {
			discount1 += (int) (sProduct[i].getPrice());
			discount2 += (int) (sProduct[i2].getPrice());
			discount3 += (int) (sProduct[i3].getPrice());
		}

		return discount1 + discount2 + discount3;

	}

	// 오늘 장볼 물품들의 가격을 모두 더하고, 가진 돈에서 그것을 뺀 값을 출력하는 메소드(오버라이드)
	@Override
	public int finalMoney() {

		ProductDTO[] allMoney = productList();

		if (allMoney[i].getIndex() != 1 || allMoney[i2].getIndex() != 1 || allMoney[i3].getIndex() != 1) {
			sumDiscount = (allMoney[i].getPrice() + allMoney[i2].getPrice() + allMoney[i3].getPrice());
		}
		sumAll = sumDiscount + selectProduct();
		System.out.println("sumAll : " + sumAll);

		int minusMoney = money - sumAll;

		System.out.println("최종 값 : " + minusMoney);

		return minusMoney;
	}

}
