package market.run;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class ProductDTO {

	private int index;
	private String product;
	private int price;

	
	// 기본 생성자
	public ProductDTO() {
		super();
	}

	// 모든 변수를 초기화 하는 생성자
	public ProductDTO(int index, String product, int price) {
		super();
		this.index = index;
		this.product = product;
		this.price = price;
	}

	// getters & setters

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
