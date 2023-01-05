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

		int count = market.getCount();

		Scanner sc = new Scanner(System.in);
		System.out.print("플레이어의 이름을 입력하세요 : ");
		String name = sc.nextLine();
		
		System.out.println();
		System.out.println("====================================");
		System.out.print(name + "(이)의 장보기 목록 : ");
		market.todayList();
		System.out.println();
		System.out.println("====================================");

		while (true) {
			System.out.println("1. 하이미디어 마트 : 식품코너 10% 할인");
			System.out.println("2. 이젠 마트 : 정육코너 10% 할인");
			System.out.println("3. 쌍용 마트 : 생활용품코너 할인 10% 할인");
			System.out.println("====================================");
			System.out.print("마트를 선택해주세요 : ");
			int select = sc.nextInt();
			System.out.println("====================================");

				switch (select) {
				case 1: {
					market.momChance();
					market.finalMoney();
					System.out.println();
					market.reciept();
					System.out.println();
					System.out.println("====================================");
					break;
				}
	
				case 2: {
					market2.momChance();
					market2.finalMoney();
					System.out.println();
					market2.reciept();
					System.out.println();
					System.out.println("====================================");
					break;
				}
	
				case 3: {
					market3.momChance();
					market3.finalMoney();
					System.out.println();
					System.out.println();
					System.out.println("====================================");
					market3.reciept();
					break;
	
				}
				
				default : {
					System.out.println("존재하는 마트를 선택해주세요.");
					continue;
					}
				}
				
				count--;
			if(count != 0) {
			System.out.println(count + " 회 남았습니다. 다시 도전하시겠습니까? (Y / N)");
			char answer = sc.next().charAt(0);

			answer = Character.toUpperCase(answer);
			if (answer == 'Y') continue;
			else if (answer == 'N') break;
			} else break;
			
			}
		}
	}

