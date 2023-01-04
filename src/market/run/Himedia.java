package market.run;

import java.util.Arrays;

public class Himedia extends Product {

//	public void selectProduct(Product[] prod) {
//		int money = (int) (Math.random() * 50 + 1) * 1000;
//
//		Product[] product = prod;
//
//		int result = 0;
//		for (int i = 0; i < product.length; i++) {
//			switch (product[i].getIndex()) {
//			case 1:
//				result = product[i].getPrice();
//				double discount = (result * 0.9);
//
//				System.out.println(discount);
//
//				double result2 = money - discount;
//
//				System.out.println(result2);
//			default:
//				break;
//			}
//		}
//
//	}

	@Override
	public void selectProduct(Product[] prod) {
		int money = (int) (Math.random() * 50 + 1) * 1000;

		Product[] product = prod;

		int result = 0;
		for (int i = 0; i < product.length; i++) {
			switch (product[i].getIndex()) {
			case 1:
				result = product[i].getPrice();
				double discount = (result * 0.9);

				System.out.println(discount);
				
				double result2 = money - discount;
				System.out.println(result2);

			default:
				break;
			}
		}

	}
}
