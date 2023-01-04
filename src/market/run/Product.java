package market.run;

public class Product {

	private int index;
	private String product;
	private int price;
//	private double discount;

	
	public Product() {
		super();
	}
	
	public Product(int index, String product, int price) {
	super();
	this.index = index;
	this.product = product;
	this.price = price;
}

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
	
	public Product[] loadProductList() {

		Product[] productList = new Product[9];

		productList[0] = new Product(1, "라면", 5000);
		productList[1] = new Product(1, "김치", 10000);
		productList[2] = new Product(1, "계란", 10000);
		productList[3] = new Product(2, "삼겹살", 30000);
		productList[4] = new Product(2, "소고기", 40000);
		productList[5] = new Product(2, "항정살", 20000);
		productList[6] = new Product(3, "휴지", 10000);
		productList[7] = new Product(3, "쓰레기통", 3000);
		productList[8] = new Product(3, "비누", 2000);
		
		return productList;
	}

}
	
	
	
	
	

	

