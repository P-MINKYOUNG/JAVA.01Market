package market.run;

import java.util.Arrays;
import java.util.List;

public class Sangyong extends Product {

	@Override
	public int[] selectProduct(Product[] product) {
		int money = (int) (Math.random() * 50 + 1) * 1000;

		Product[] sProduct = product;

		List<Product> list = Arrays.asList(product);

		for (int i = 0; i < sProduct.length; i++) {
			switch (sProduct[i].getIndex()) {
			case 3:
				discount[i] = (int) (sProduct[i].getPrice() * 0.9);
				System.out.println(discount[i]);
			default:
				break;
			}
		}

		return discount;
	}

}
