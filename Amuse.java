package Amusementpark;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Amuse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		ArrayList<String> al = new ArrayList<String>();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
		Date date = new Date();
		int total = 0;
		int num = 0;
		int totalprice = 0;
	
		int isexit = 0;
		do {
			
			while (true) {
				Intputamuseclass inputclass = new Intputamuseclass();
				int choose = inputclass.daynightticket();

				String customeridnumber = inputclass.customeridselect();
				String today = sdf.format(date);

				int today_year = Integer.parseInt(today.substring(0, 4));
				int today_month = Integer.parseInt(today.substring(4, 6));
				int today_day = Integer.parseInt(today.substring(6, 8));
				int id_year = Integer.parseInt(customeridnumber.substring(0, 2));
				int id_month = Integer.parseInt(customeridnumber.substring(2, 4));
				int id_day = Integer.parseInt(customeridnumber.substring(4, 6));
				int age = 0;
				if (customeridnumber.charAt(6) == '1' || customeridnumber.charAt(6) == '2') {
					age = today_year - (1900 + id_year);
				} else if (customeridnumber.charAt(6) == '3' || customeridnumber.charAt(6) == '4') {
					age = today_year - (2000 + id_year);
				}
				if (today_month < id_month) {
					age = age - 1;
				} else if (today_month < id_month) {
					if (today_day < id_day) {
						age = age - 1;
					}
				}

				int ordercount = inputclass.ordercount();
				int discountselect1 = inputclass.discountselect1();

				if (discountselect1 == Valueclass.nothing) {
					if (choose == Valueclass.day && age <= 2) {
						total = Valueclass.baby * ordercount;
					} else if (choose == Valueclass.day && age >= 3 && age <= 12) {
						total = Valueclass.day_child * ordercount;
					} else if (choose == Valueclass.day && age >= 13 && age <= 18) {
						total = Valueclass.day_teen * ordercount;
					} else if (choose == Valueclass.day && age >= 19 && age <= 64) {
						total = Valueclass.day_adult * ordercount;
					} else if (choose == Valueclass.day && age >= 65) {
						total = Valueclass.day_old * ordercount;
					}

					if (choose == Valueclass.night && age <= 2) {
						total = Valueclass.baby * ordercount;
					} else if (choose == Valueclass.night && age >= 3 && age <= 12) {
						total = Valueclass.night_child * ordercount;
					} else if (choose == Valueclass.night && age >= 13 && age <= 18) {
						total = Valueclass.night_teen * ordercount;
					} else if (choose == Valueclass.night && age >= 19 && age <= 64) {
						total = Valueclass.night_adult * ordercount;
					} else if (choose == Valueclass.night && age >= 65) {
						total = Valueclass.night_old * ordercount;
					}

				} else if (discountselect1 == Valueclass.disabled) {
					if (choose == Valueclass.day && age <= 2) {
						total = (int) (Valueclass.baby * ordercount * 0.6);
					} else if (choose == Valueclass.day && age >= 3 && age <= 12) {
						total = (int) (Valueclass.day_child * ordercount * 0.6);
					} else if (choose == Valueclass.day && age >= 13 && age <= 18) {
						total = (int) (Valueclass.day_teen * ordercount * 0.6);
					} else if (choose == Valueclass.day && age >= 19 && age <= 64) {
						total = (int) (Valueclass.day_adult * ordercount * 0.6);
					} else if (choose == Valueclass.day && age >= 65) {
						total = (int) (Valueclass.day_old * ordercount * 0.6);
					}

					if (choose == Valueclass.night && age <= 2) {
						total = (int) (Valueclass.baby * ordercount * 0.6);
					} else if (choose == Valueclass.night && age >= 3 && age <= 12) {
						total = (int) (Valueclass.day_child * ordercount * 0.6);
					} else if (choose == Valueclass.night && age >= 13 && age <= 18) {
						total = (int) (Valueclass.day_teen * ordercount * 0.6);
					} else if (choose == Valueclass.night && age >= 19 && age <= 64) {
						total = (int) (Valueclass.day_adult * ordercount * 0.6);
					} else if (choose == Valueclass.night && age >= 65) {
						total = (int) (Valueclass.day_old * ordercount * 0.6);
					}
				} else if (discountselect1 == Valueclass.national) {
					if (choose == Valueclass.day && age <= 2) {
						total = (int) (Valueclass.baby * ordercount * 0.5);
					} else if (choose == 1 && age >= 3 && age <= 12) {
						total = (int) (Valueclass.day_child * ordercount * 0.5);
					} else if (choose == 1 && age >= 13 && age <= 18) {
						total = (int) (Valueclass.day_teen * ordercount * 0.5);
					} else if (choose == 1 && age >= 19 && age <= 64) {
						total = (int) (Valueclass.day_adult * ordercount * 0.5);
					} else if (choose == 1 && age >= 65) {
						total = (int) (Valueclass.day_old * ordercount * 0.5);
					}

					if (choose == Valueclass.night && age <= 2) {
						total = (int) (Valueclass.baby * ordercount * 0.5);
					} else if (choose == Valueclass.night && age >= 3 && age <= 12) {
						total = (int) (Valueclass.day_child * ordercount * 0.5);
					} else if (choose == Valueclass.night && age >= 13 && age <= 18) {
						total = (int) (Valueclass.day_teen * ordercount * 0.5);
					} else if (choose == Valueclass.night && age >= 19 && age <= 64) {
						total = (int) (Valueclass.day_adult * ordercount * 0.5);
					} else if (choose == Valueclass.night && age >= 65) {
						total = (int) (Valueclass.day_old * ordercount * 0.5);
					}
				} else if (discountselect1 == Valueclass.multi_child) {
					if (choose == Valueclass.day && age <= 2) {
						total = (int) (Valueclass.baby * ordercount * 0.8);
					} else if (choose == Valueclass.day && age >= 3 && age <= 12) {
						total = (int) (Valueclass.day_child * ordercount * 0.8);
					} else if (choose == Valueclass.day && age >= 13 && age <= 18) {
						total = (int) (Valueclass.day_teen * ordercount * 0.8);
					} else if (choose == Valueclass.day && age >= 19 && age <= 64) {
						total = (int) (Valueclass.day_adult * ordercount * 0.8);
					} else if (choose == Valueclass.day && age >= 65) {
						total = (int) (Valueclass.day_old * ordercount * 0.8);
					}

					if (choose == Valueclass.night && age <= 2) {
						total = (int) (Valueclass.baby * ordercount * 0.8);
					} else if (choose == Valueclass.night && age >= 3 && age <= 12) {
						total = (int) (Valueclass.day_child * ordercount * 0.8);
					} else if (choose == Valueclass.night && age >= 13 && age <= 18) {
						total = (int) (Valueclass.day_teen * ordercount * 0.8);
					} else if (choose == Valueclass.night && age >= 19 && age <= 64) {
						total = (int) (Valueclass.day_adult * ordercount * 0.8);
					} else if (choose == Valueclass.night && age >= 65) {
						total = (int) (Valueclass.day_old * ordercount * 0.8);
					}
				} else if (discountselect1 == Valueclass.pregnant) {
					if (choose == Valueclass.day && age <= 2) {
						total = (int) (Valueclass.baby * ordercount * 0.85);
					} else if (choose == Valueclass.day && age >= 3 && age <= 12) {
						total = (int) (Valueclass.day_child * ordercount * 0.85);
					} else if (choose == Valueclass.day && age >= 13 && age <= 18) {
						total = (int) (Valueclass.day_teen * ordercount * 0.85);
					} else if (choose == Valueclass.day && age >= 19 && age <= 64) {
						total = (int) (Valueclass.day_adult * ordercount * 0.85);
					} else if (choose == Valueclass.day && age >= 65) {
						total = (int) (Valueclass.day_old * ordercount * 0.85);
					}

					if (choose == Valueclass.night && age <= 2) {
						total = (int) (Valueclass.baby * ordercount * 0.85);
					} else if (choose == Valueclass.night && age >= 3 && age <= 12) {
						total = (int) (Valueclass.day_child * ordercount * 0.85);
					} else if (choose == Valueclass.night && age >= 13 && age <= 18) {
						total = (int) (Valueclass.day_teen * ordercount * 0.85);
					} else if (choose == Valueclass.night && age >= 19 && age <= 64) {
						total = (int) (Valueclass.day_adult * ordercount * 0.85);
					} else if (choose == Valueclass.night && age >= 65) {
						total = (int) (Valueclass.day_old * ordercount * 0.85);
					}
				}
				totalprice = totalprice + total;

				System.out.println("가격은 " + total + "원 입니다.");
				System.out.println("감사합니다.");
				num = inputclass.askcloseticket();
				String customer = choose + "," + age + "," + ordercount + "," + total + "," + discountselect1;
				al.add(customer);
				if (num == 2) {
					System.out.println("티켓 발권을 종료합니다. 감사합니다.");
					System.out.println("================제리랜드 ============");
					for(String customers : al) {
						System.out.println(customers);
					}
				
					System.out.println("입장료 총액은 " + totalprice + "원 입니다.");
					System.out.println("===================================");
					System.out.println("계속 진행(1: 새로운 주문, 2: 프로그램 종료):");
					isexit = sc.nextInt();
					break;
				}
			}
			
		} while (isexit == 1);
		
	}
}
