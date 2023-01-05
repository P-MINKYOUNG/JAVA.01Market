package market.run;

import java.util.Arrays;
import java.util.List;

public class Sangyong extends Market{

	@Override
	public int[] selectProduct(ProductDTO[] product) {
		int money = (int) (Math.random() * 50 + 1) * 1000;

		ProductDTO[] sProduct = product;


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
