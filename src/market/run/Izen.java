package market.run;

public class Izen extends Product{

	@Override
	public void selectProduct(Product[] prod) {
		int money = (int) (Math.random() * 50 + 1) * 1000;

		Product[] product = prod;

		int result = 0;
		for (int i = 0; i < product.length; i++) {
			switch (product[i].getIndex()) {
			case 2:
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
