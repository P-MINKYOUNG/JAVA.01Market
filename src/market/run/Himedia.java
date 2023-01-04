package market.run;

import java.util.Arrays;

public class Himedia extends Product {

	@Override
	public void selectProduct(Product[] prod) {
		int money = (int) (Math.random() * 50 + 1) * 1000;
		
		System.out.println(money);

		Product[] product = prod;

		int result = 0;
		for (int i = 0; i < product.length; i++) {
			switch (product[i].getIndex()) {
			case 1:
				result = product[i].getPrice();
				double discount = (result * 0.9);
				
				System.out.println("price : " +result);
				System.out.println("할인된 값 : " + discount);
				
				double result2 = money - discount;
				System.out.println("남은 돈 : " + result2);

			default:
				break;
			}
		}

	}
}
