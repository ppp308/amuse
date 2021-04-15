package Amusementpark;

import java.util.ArrayList;
import java.util.Scanner;

public class Amuse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		ArrayList<String> al = new ArrayList<String>();
		
		int total = 0;
		int num = 0;
		int totalprice = 0;
		int isexit = 0;
		do {

			while (true) {
				Intputamuseclass inputclass = new Intputamuseclass();
				int choose = inputclass.daynightticket();
				Runamuseclass runclass = new Runamuseclass();
				String customeridnumber = inputclass.customeridselect();
				int ordercount = inputclass.ordercount();
				int discountselect1 = inputclass.discountselect1();
				
				if (discountselect1 == Valueclass.nothing) {
					if (choose == Valueclass.day && runclass.dividage(customeridnumber)=="유아") {
						total = Valueclass.baby * ordercount;
					} else if (choose == Valueclass.day && runclass.dividage(customeridnumber)=="어린이") {
						total = Valueclass.day_child * ordercount;
					} else if (choose == Valueclass.day && runclass.dividage(customeridnumber)=="청소년") {
						total = Valueclass.day_teen * ordercount;
					} else if (choose == Valueclass.day && runclass.dividage(customeridnumber)=="어른") {
						total = Valueclass.day_adult * ordercount;
					} else if (choose == Valueclass.day && runclass.dividage(customeridnumber)=="경로") {
						total = Valueclass.day_old * ordercount;
					}

					if (choose == Valueclass.night && runclass.dividage(customeridnumber)=="유아") {
						total = Valueclass.baby * ordercount;
					} else if (choose == Valueclass.night && runclass.dividage(customeridnumber)=="어린이") {
						total = Valueclass.night_child * ordercount;
					} else if (choose == Valueclass.night && runclass.dividage(customeridnumber)=="청소년") {
						total = Valueclass.night_teen * ordercount;
					} else if (choose == Valueclass.night && runclass.dividage(customeridnumber)=="어른") {
						total = Valueclass.night_adult * ordercount;
					} else if (choose == Valueclass.night && runclass.dividage(customeridnumber)=="경로") {
						total = Valueclass.night_old * ordercount;
					}

				} else if (discountselect1 == Valueclass.disabled) {
					if (choose == Valueclass.day && runclass.dividage(customeridnumber)=="유아") {
						total = (int) (Valueclass.baby * ordercount * 0.6);
					} else if (choose == Valueclass.day && runclass.dividage(customeridnumber)=="어린이") {
						total = (int) (Valueclass.day_child * ordercount * 0.6);
					} else if (choose == Valueclass.day && runclass.dividage(customeridnumber)=="청소년") {
						total = (int) (Valueclass.day_teen * ordercount * 0.6);
					} else if (choose == Valueclass.day && runclass.dividage(customeridnumber)=="어른") {
						total = (int) (Valueclass.day_adult * ordercount * 0.6);
					} else if (choose == Valueclass.day && runclass.dividage(customeridnumber)=="경로") {
						total = (int) (Valueclass.day_old * ordercount * 0.6);
					}

					if (choose == Valueclass.night && runclass.dividage(customeridnumber)=="유아") {
						total = (int) (Valueclass.baby * ordercount * 0.6);
					} else if (choose == Valueclass.night && runclass.dividage(customeridnumber)=="어린이") {
						total = (int) (Valueclass.day_child * ordercount * 0.6);
					} else if (choose == Valueclass.night && runclass.dividage(customeridnumber)=="청소년") {
						total = (int) (Valueclass.day_teen * ordercount * 0.6);
					} else if (choose == Valueclass.night && runclass.dividage(customeridnumber)=="어른") {
						total = (int) (Valueclass.day_adult * ordercount * 0.6);
					} else if (choose == Valueclass.night && runclass.dividage(customeridnumber)=="경로") {
						total = (int) (Valueclass.day_old * ordercount * 0.6);
					}
				} else if (discountselect1 == Valueclass.national) {
					if (choose == Valueclass.day && runclass.dividage(customeridnumber)=="유아") {
						total = (int) (Valueclass.baby * ordercount * 0.5);
					} else if (choose == 1 && runclass.dividage(customeridnumber)=="어린이") {
						total = (int) (Valueclass.day_child * ordercount * 0.5);
					} else if (choose == 1 && runclass.dividage(customeridnumber)=="청소년") {
						total = (int) (Valueclass.day_teen * ordercount * 0.5);
					} else if (choose == 1 && runclass.dividage(customeridnumber)=="어른") {
						total = (int) (Valueclass.day_adult * ordercount * 0.5);
					} else if (choose == 1 && runclass.dividage(customeridnumber)=="경로") {
						total = (int) (Valueclass.day_old * ordercount * 0.5);
					}

					if (choose == Valueclass.night && runclass.dividage(customeridnumber)=="유아") {
						total = (int) (Valueclass.baby * ordercount * 0.5);
					} else if (choose == Valueclass.night && runclass.dividage(customeridnumber)=="어린이") {
						total = (int) (Valueclass.day_child * ordercount * 0.5);
					} else if (choose == Valueclass.night && runclass.dividage(customeridnumber)=="청소년") {
						total = (int) (Valueclass.day_teen * ordercount * 0.5);
					} else if (choose == Valueclass.night && runclass.dividage(customeridnumber)=="어른") {
						total = (int) (Valueclass.day_adult * ordercount * 0.5);
					} else if (choose == Valueclass.night && runclass.dividage(customeridnumber)=="경로") {
						total = (int) (Valueclass.day_old * ordercount * 0.5);
					}
				} else if (discountselect1 == Valueclass.multi_child) {
					if (choose == Valueclass.day && runclass.dividage(customeridnumber)=="유아") {
						total = (int) (Valueclass.baby * ordercount * 0.8);
					} else if (choose == Valueclass.day && runclass.dividage(customeridnumber)=="어린이") {
						total = (int) (Valueclass.day_child * ordercount * 0.8);
					} else if (choose == Valueclass.day && runclass.dividage(customeridnumber)=="청소년") {
						total = (int) (Valueclass.day_teen * ordercount * 0.8);
					} else if (choose == Valueclass.day && runclass.dividage(customeridnumber)=="어른") {
						total = (int) (Valueclass.day_adult * ordercount * 0.8);
					} else if (choose == Valueclass.day && runclass.dividage(customeridnumber)=="경로") {
						total = (int) (Valueclass.day_old * ordercount * 0.8);
					}

					if (choose == Valueclass.night && runclass.dividage(customeridnumber)=="유아") {
						total = (int) (Valueclass.baby * ordercount * 0.8);
					} else if (choose == Valueclass.night && runclass.dividage(customeridnumber)=="어린이") {
						total = (int) (Valueclass.day_child * ordercount * 0.8);
					} else if (choose == Valueclass.night && runclass.dividage(customeridnumber)=="청소년") {
						total = (int) (Valueclass.day_teen * ordercount * 0.8);
					} else if (choose == Valueclass.night && runclass.dividage(customeridnumber)=="어른") {
						total = (int) (Valueclass.day_adult * ordercount * 0.8);
					} else if (choose == Valueclass.night && runclass.dividage(customeridnumber)=="경로") {
						total = (int) (Valueclass.day_old * ordercount * 0.8);
					}
				} else if (discountselect1 == Valueclass.pregnant) {
					if (choose == Valueclass.day && runclass.dividage(customeridnumber)=="유아") {
						total = (int) (Valueclass.baby * ordercount * 0.85);
					} else if (choose == Valueclass.day && runclass.dividage(customeridnumber)=="어린이") {
						total = (int) (Valueclass.day_child * ordercount * 0.85);
					} else if (choose == Valueclass.day && runclass.dividage(customeridnumber)=="청소년") {
						total = (int) (Valueclass.day_teen * ordercount * 0.85);
					} else if (choose == Valueclass.day && runclass.dividage(customeridnumber)=="어른") {
						total = (int) (Valueclass.day_adult * ordercount * 0.85);
					} else if (choose == Valueclass.day && runclass.dividage(customeridnumber)=="경로") {
						total = (int) (Valueclass.day_old * ordercount * 0.85);
					}

					if (choose == Valueclass.night && runclass.dividage(customeridnumber)=="유아") {
						total = (int) (Valueclass.baby * ordercount * 0.85);
					} else if (choose == Valueclass.night && runclass.dividage(customeridnumber)=="어린이") {
						total = (int) (Valueclass.day_child * ordercount * 0.85);
					} else if (choose == Valueclass.night && runclass.dividage(customeridnumber)=="청소년") {
						total = (int) (Valueclass.day_teen * ordercount * 0.85);
					} else if (choose == Valueclass.night && runclass.dividage(customeridnumber)=="어른") {
						total = (int) (Valueclass.day_adult * ordercount * 0.85);
					} else if (choose == Valueclass.night && runclass.dividage(customeridnumber)=="경로") {
						total = (int) (Valueclass.day_old * ordercount * 0.85);
					}
				}
				totalprice = totalprice + total;
				System.out.println("가격은 " + total + "원 입니다.");
				System.out.println("감사합니다.");
				num = inputclass.askcloseticket();
				String customer = choose + "," + runclass.dividage(customeridnumber) + "," + ordercount + "," + total + "," + discountselect1;
				al.add(customer);
				if (num == 2) {
					System.out.println("티켓 발권을 종료합니다. 감사합니다.");
					System.out.println("================제리랜드 ============");
					for (String customers : al) {
						System.out.println(customers);
					}
					String[] size = customer.split(",");

					switch (size[1]) {
					case "1":
						System.out.println("주간권");
						break;
					case "2":
						System.out.println("야간권");
						break;
					default:
						break;
					}

					System.out.println("입장료 총액은 " + totalprice + "원 입니다.");
					System.out.println("===================================");
					isexit =inputclass.continueecheck();
					break;
				}
			}

		} while (isexit == 1);

	}
}
