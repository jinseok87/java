package sec2;

import java.util.Scanner;

public class Condition5 {

	public static void main(String[] args) {
		Scanner text = new Scanner(System.in);
		boolean sc = true;
		int money =0, balance =0;
		while(sc){
			System.out.println("1.입금  2.출금 3.잔액조회 4.시스템종료");
			int num = text.nextInt();
			
			switch(num){
				case 1:
					System.out.print("입금액 : ");
					money = text.nextInt();
					balance +=money;
					System.out.println("현재 잔액은"+balance+"입니다");
					break;
				case 2:
					System.out.print("출금액 : ");
					money = text.nextInt();
					balance -=money;
					System.out.println("현재 잔액은 "+balance+"입니다");
					break;
				case 3:
					System.out.println("잔액조회 :" +balance);
					break;
				default:
					System.out.println("시스템을 종료합니다.");
					sc = false;
					
			}
			
		}
	}

}
