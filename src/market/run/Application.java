package market.run;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Application {

	public static void main(String[] args) {

		Himedia hi = new Himedia();
		Izen izen = new Izen();
		Sangyong sangyong = new Sangyong();
		Application app = new Application();
		Market market = new Market();

		Scanner sc = new Scanner(System.in);
		System.out.print("이름을 입력하세요 : ");
		String name = sc.next();
		System.out.println();
		System.out.println("=============================");
		System.out.print("오늘의 장보기 : ");
		market.todayList();
		System.out.println();
		System.out.println("=============================");

		while (true) {
			System.out.println("1. 하이미디어 마트 : 식품 10프로 할인");
			System.out.println("2. 이젠 마트 : 정육 10프로 할인");
			System.out.println("3. 쌍용 마트 : 생활용품 할인 10프로 할인");
			System.out.println();
			System.out.print("마트를 선택해주세요 : ");
			char select = sc.next().charAt(0);

			if (select == '1') {
				hi.selectProduct(market.productList());
				break;
			}
			else if (select == '2') {
				izen.selectProduct(market.productList());
				break;
			} else if (select == '3') {
				sangyong.selectProduct(market.productList());
				break;
			} 
			else {
				System.out.println("존재하는 마트를 선택해주세요.");
				continue;
			}

		}
		
		hi.finalMoney(market.selectProduct(market.productList()));

// 그 마트에서 고른 상품의 가격을 다 더하고 내가 가지고 있는 돈에서 뺀다
// > 프로덕트에 영수증을 출력하는 메소드를 짜서 오버라이드 > 아예 다 끝나고 엄마찬스를 돌려서 남은 돈에 선택한 금액만큼
// 추가 해주고 > 그게 0보다 크면 성공! 0보다 작으면 실패!

	}
}
