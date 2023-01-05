package market.run;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Application {

	public static void main(String[] args) {

		Market market = new Himedia();
		Market market2 = new Izen();
		Market market3 = new Sangyong();

		Scanner sc = new Scanner(System.in);
		System.out.print("이름을 입력하세요 : ");
		String name = sc.next();
		System.out.println();
		System.out.println("=============================");
		System.out.print(name + "(이)의 장 볼 목록 : ");
		market.todayList();
		System.out.println();
		System.out.println("=============================");
		
		while (true) {
			System.out.println("1. 하이미디어 마트 : 식품 10프로 할인");
			System.out.println("2. 이젠 마트 : 정육 10프로 할인");
			System.out.println("3. 쌍용 마트 : 생활용품 할인 10프로 할인");
			System.out.println("=============================");
			System.out.print("마트를 선택해주세요 : ");
			int select = sc.nextInt();
			System.out.println("=============================");

			if (select == 1) {
				market.momChance();
				market.finalMoney();
				System.out.println();
				market.reciept();
				break;
			} else if (select == 2) {
				market2.momChance();
				market2.finalMoney();
				System.out.println();
				market2.reciept();
				break;
			} else if (select == 3) {
				market3.momChance();
				market3.finalMoney();
				System.out.println();
				market3.reciept();
				break;
			} else {
				System.out.println("존재하는 마트를 선택해주세요.");
				continue;
			}

		}
	}
}
