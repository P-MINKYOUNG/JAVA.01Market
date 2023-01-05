package market.run;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Izen extends Market {

	// 가격을 정하는 메소드
	@Override
	public int setProductPrice() {

		// 새로운 객체에 productList의 리턴값을 받아서 저장해준다.
		ProductDTO[] sProduct = productList();

		// 동일 숫자가 아닐 경우
		if (i != i2 && i != i3 && i2 != i3) {
			// 랜덤으로 받은 숫자를 인덱스로 하는 배열의 인덱스로 저장한 숫자가 1일경우 식품에 해당하므로 10프로 할인을 적용한다.
			if (sProduct[i].getIndex() == 2)
				discount1 = (int) ((sProduct[i].getPrice()) * 0.9);
			if (sProduct[i2].getIndex() == 2)
				discount2 = (int) ((sProduct[i2].getPrice()) * 0.9);
			if (sProduct[i3].getIndex() == 2)
				discount3 = (int) ((sProduct[i3].getPrice()) * 0.9);
		}

		// 리턴값으로 할인된 상품들의 가격을 모두 더해준다
		return discount1 + discount2 + discount3;
	}

	// 오늘 장볼 물품들의 가격을 모두 더하고, 가진 돈에서 그것을 뺀 값을 출력하는 메소드(오버라이드)
	@Override
	public int finalMoney() {

		ProductDTO[] allMoney = productList();

		// 만약 배열의 인덱스가 1이 아닐 경우 할인하지 않으므로 그것의 값을 noDiscount에 저장한다.
		if (allMoney[i].getIndex() != 2)
			noDiscount1 = allMoney[i].getPrice();
		if (allMoney[i2].getIndex() != 2)
			noDiscount2 = allMoney[i2].getPrice();
		if (allMoney[i3].getIndex() != 2)
			noDiscount3 = allMoney[i3].getPrice();

		// 할인되지 않은 상품들의 값을 모두 더해준다.
		sumNoDiscount = noDiscount1 + noDiscount2 + noDiscount3;

		// 할인되지 않은 상품의 가격 + 할인된 상품의 가격
		sumAll = sumNoDiscount + setProductPrice();

		// 가진 돈에서 상품의 가격을 모두 합한 것 만큼 빼준다.
		finalMoney = money - sumAll + momMoney;

		return finalMoney;
	}


	// 엄마찬스
	@Override
	public void momChance() {
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.print("잠깐 ! 엄마찬스를 원하시나요? ( Y / N )");
			System.out.println();
			char answer = sc.next().charAt(0);
			answer = Character.toUpperCase(answer);
			if (answer == 'Y') {
				System.out.println("\n+++++++++++++++++++++++++++++++++++++++");
				System.out.println("엄마찬스 성공 : " + momMoney+" 원 추가 !");
				System.out.println("+++++++++++++++++++++++++++++++++++++++");
				break;
			} else if (answer == 'N') {
				// 반복문을 빠져나가는 공식
				momMoney = 0;
				break;
			} else {
				// 알맞은 문자를 입력하라는 안내문구
				System.out.println("알맞은 내용을 입력해주세요.");
				continue;
			}
		}
	}

	// 영수증 출력
	@Override
	public void reciept() {
		System.out.println("장 볼 물품 가격은 " + sumAll + "원 입니다.");
		System.out.println();
		System.out.print("=============== 영수증 ===============");
		System.out.println();
		System.out.print("구매한 물건 : ");
		todayList();
		System.out.println();
		System.out.println("내가 가지고 있는 돈 : " + money);
		System.out.print("상품 총 가격 : " + sumAll);
		System.out.println();
		System.out.print("-----------------------------------");
		System.out.println();
		System.out.print("Total : " + finalMoney());
		System.out.println();
		System.out.print("성공 여부 : ");
		success();
		System.out.println();
		System.out.print(date);
		System.out.println();

	}
}

