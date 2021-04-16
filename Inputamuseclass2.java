package new2;
import java.util.Scanner;
public class Inputamuseclass2 {
		Scanner sc = new Scanner(System.in);
		Scanner sb = new Scanner(System.in);

		public String daynightticket() {
			System.out.println("권종을 선택하세요");
			System.out.println("1. 주간권");
			System.out.println("2. 야간권");
			System.out.println("->");
			String choose = sc.nextLine();
			return choose;
		}

		public String customeridselect() {
			System.out.println("주민번호를 입력하세요");
			String customeridnumber = sb.nextLine();
			return customeridnumber;
		}

		public int ordercount() {
			System.out.println("몇개를 주문하시겠습니까? (최대 10개)");
			int ordercount = sc.nextInt();
			return ordercount;
		}

		public int discountselect1() {
			System.out.println("1. 없음 (나이 우대는 자동처리)");
			System.out.println("2. 장애인");
			System.out.println("3. 국가유공자");
			System.out.println("4. 다자녀");
			System.out.println("5. 임산부");
			int discountselect1 = sc.nextInt();
			return discountselect1;
		}

		public int askcloseticket() {
			System.out.println("계속 발권 하시겠습니까?");
			System.out.println("1.티켓 발권");
			System.out.println("2.종료");
			int num = sc.nextInt();
			return num;
		}

		public int continueecheck() {
			System.out.println("계속 진행(1: 새로운 주문, 2: 프로그램 종료):");
			int isexit = sc.nextInt();
			return isexit;
		}
	}

