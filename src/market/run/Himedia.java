package market.run;

import java.util.Arrays;

public class Himedia extends Product {

	public void selectProduct(Product[] prod) {
		int money = (int)(Math.random()*50 + 1)*1000;
		
		Product[] product = prod;
		
		for(int i = 0 ; i < product.length ; i++) {
			int result = money - product[i].getPrice();
			
			System.out.println(result);
			
		}	
	}
}
