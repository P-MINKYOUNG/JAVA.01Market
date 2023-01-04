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

}
	
	
	
	
	

	

