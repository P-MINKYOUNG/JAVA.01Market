package market.run;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class Himedia extends Product {

	// 가격을 정하는 메소드
	@Override
	public int[] selectProduct(Product[] product) {
		int money = (int) (Math.random() * 50 + 1) * 1000;

		Product[] sProduct = product;

		List<Product> list = Arrays.asList(product);

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



}
