package market.run;

public class Product {

	private int index;
	private String product;
	private int price;

	// 기본 생성자
	public Product() {
		super();
	}

	// 모든 변수를 초기화 하는 생성자
	public Product(int index, String product, int price) {
		super();
		this.index = index;
		this.product = product;
		this.price = price;
	}

	//getters & setters
	public int getIndex() {
		return index;
	}

	public void setIndex(int index) {
		this.index = index;
	}

	public String getProduct() {
		return product;
	}

	public void setProduct(String product) {
		this.product = product;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Product [index=" + index + ", product=" + product + ", price=" + price + "]";
	}
	
	//제품 리스트
	public Product[] loadProductList() {

		Product[] productList = new Product[9];

		productList[0] = new Product(1, "라면", 5000);
		productList[1] = new Product(1, "김치", 8000);
		productList[2] = new Product(1, "계란", 10000);
		productList[3] = new Product(2, "삼겹살", 30000);
		productList[4] = new Product(2, "소고기", 40000);
		productList[5] = new Product(2, "항정살", 20000);
		productList[6] = new Product(3, "휴지", 10000);
		productList[7] = new Product(3, "쓰레기통", 3000);
		productList[8] = new Product(3, "비누", 2000);

		return productList;
	}

	
	//가격을 정하는 메소드
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
			default:
				break;
			}
		}
	}

}
