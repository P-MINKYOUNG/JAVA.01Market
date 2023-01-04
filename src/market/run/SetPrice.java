package market.run;

public class SetPrice<T, T2, T3> {

	private int price;

//	물건의 값을 각 배열에 저장해주는 메소드 
	public void setPrice() {

		Product[] parents = new Product[9];

		parents[0] = new Product(1, "라면", 5000);
		parents[1] = new Product(1, "김치", 10000);
		parents[2] = new Product(1, "계란", 10000);
		parents[3] = new Product(2, "삼겹살", 30000);
		parents[4] = new Product(2, "소고기", 40000);
		parents[5] = new Product(2, "항정살", 20000);
		parents[6] = new Product(3, "휴지", 10000);
		parents[7] = new Product(3, "쓰레기통", 3000);
		parents[8] = new Product(3, "비누", 2000);

		for (Product p : parents) {
			System.out.println(p);
		}

	}
}