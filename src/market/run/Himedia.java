package market.run;


import java.util.Date;


public class Himedia extends Market {

	// 가격을 정하는 메소드
	@Override
	public int[] selectProduct(ProductDTO[] product) {
		ProductDTO[] sProduct = product;

		for (int i = 0; i < sProduct.length; i++) {
			switch (sProduct[i].getIndex()) {
			case 1:
				discount[i] = (int) (sProduct[i].getPrice() * 0.9);
				System.out.println(discount[i]);
			default:
				break;
			}
		}

		return discount;
	}

	@Override
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

}
