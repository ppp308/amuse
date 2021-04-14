package Amusementpark;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Amuse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
		Date date = new Date();
		int baby =0;
		int total =0;
		int day_child =44000;
		int day_teen = 47000;
		int day_adult =56000;
		int day_old = 44000;
		int night_child =37000;
		int night_teen = 40000;
		int night_adult =46000;
		int night_old = 37000;
		
		while (true) {	
			
			System.out.println("권종을 선택하세요\n");
			System.out.println("1. 주간권\n");
			System.out.println("2. 야간권\n");
			System.out.println("->");
			int choose = sc.nextInt();
						
			System.out.println("주민번호를 입력하세요");	
			Scanner sb = new Scanner(System.in);
			String customeridnumber = sb.nextLine();		
			String today = sdf.format(date);
			
			int today_year = Integer.parseInt(today.substring(0,4));
			int today_month = Integer.parseInt(today.substring(4,6));
			int today_day = Integer.parseInt(today.substring(6,8));
			int id_year = Integer.parseInt(customeridnumber.substring(0,2));
			int id_month = Integer.parseInt(customeridnumber.substring(2,4));
			int id_day = Integer.parseInt(customeridnumber.substring(4,6));
			int age =0;
			
			if(customeridnumber.charAt(6) =='1'|| customeridnumber.charAt(6)=='2'){ 
				age = today_year - (1900 + id_year);
			} else if(customeridnumber.charAt(6) =='3'|| customeridnumber.charAt(6)=='4'){
				 age = today_year - (2000 + id_year);
			}			
			if(today_month<id_month) {
				age = age -1;
			}else if(today_month<id_month) {
				if(today_day<id_day) {
					age = age -1;
				}
			}
			System.out.println("몇개를 주문하시겠습니까? (최대 10개)");				
			int ordercount = sc.nextInt();
			
			System.out.println("1. 없음 (나이 우대는 자동처리)");
			System.out.println("2. 장애인");
			System.out.println("3. 국가유공자");
			System.out.println("4. 다자녀");
			System.out.println("5. 임산부");			
			int discountselect1 = sc.nextInt();
			if (discountselect1 == 1) {
				if (choose == 1 && age <= 2) {
					total = baby * ordercount;
				} else if (choose == 1 && age >= 3 && age <= 12) {
					total = day_child * ordercount;
				} else if (choose == 1 && age >= 13 && age <= 18) {
					total = day_teen * ordercount;
				} else if (choose == 1 && age >= 19 && age <= 64) {
					total = day_adult * ordercount;
				} else if (choose == 1 && age >= 65) {
					total = day_old * ordercount;
				}

				if (choose == 2 && age <= 2) {
					total = baby * ordercount;
				} else if (choose == 2 && age >= 3 && age <= 12) {
					total = night_child * ordercount;
				} else if (choose == 2 && age >= 13 && age <= 18) {
					total = night_teen * ordercount;
				} else if (choose == 1 && age >= 19 && age <= 64) {
					total = night_adult * ordercount;
				} else if (choose == 1 && age >= 65) {
					total = night_old * ordercount;
				}

			} else if (discountselect1 == 2) {
				if (choose == 1 && age <= 2) {
					total = (int) (baby * ordercount*0.6);
				} else if (choose == 1 && age >= 3 && age <= 12) {
					total =  (int)(day_child * ordercount*0.6);
				} else if (choose == 1 && age >= 13 && age <= 18) {
					total = (int)(day_teen * ordercount*0.6);
				} else if (choose == 1 && age >= 19 && age <= 64) {
					total = (int)(day_adult * ordercount*0.6);
				} else if (choose == 1 && age >= 65) {
					total = (int)(day_old * ordercount*0.6);
				}
				
				if (choose == 2 && age <= 2) {
					total = (int) (baby * ordercount*0.6);
				} else if (choose == 2 && age >= 3 && age <= 12) {
					total =  (int)(day_child * ordercount*0.6);
				} else if (choose == 2 && age >= 13 && age <= 18) {
					total = (int)(day_teen * ordercount*0.6);
				} else if (choose == 2 && age >= 19 && age <= 64) {
					total = (int)(day_adult * ordercount*0.6);
				} else if (choose == 2 && age >= 65) {
					total = (int)(day_old * ordercount*0.6);
				}
			} else if (discountselect1 == 3) {
				if (choose == 1 && age <= 2) {
					total = (int) (baby * ordercount*0.5);
				} else if (choose == 1 && age >= 3 && age <= 12) {
					total =  (int)(day_child * ordercount*0.5);
				} else if (choose == 1 && age >= 13 && age <= 18) {
					total = (int)(day_teen * ordercount*0.5);
				} else if (choose == 1 && age >= 19 && age <= 64) {
					total = (int)(day_adult * ordercount*0.5);
				} else if (choose == 1 && age >= 65) {
					total = (int)(day_old * ordercount*0.5);
				}
				
				if (choose == 2 && age <= 2) {
					total = (int) (baby * ordercount*0.5);
				} else if (choose == 2 && age >= 3 && age <= 12) {
					total =  (int)(day_child * ordercount*0.5);
				} else if (choose == 2 && age >= 13 && age <= 18) {
					total = (int)(day_teen * ordercount*0.5);
				} else if (choose == 2 && age >= 19 && age <= 64) {
					total = (int)(day_adult * ordercount*0.5);
				} else if (choose == 2 && age >= 65) {
					total = (int)(day_old * ordercount*0.5);
				}
			} else if (discountselect1 == 4) {
				if (choose == 1 && age <= 2) {
					total = (int) (baby * ordercount*0.8);
				} else if (choose == 1 && age >= 3 && age <= 12) {
					total =  (int)(day_child * ordercount*0.8);
				} else if (choose == 1 && age >= 13 && age <= 18) {
					total = (int)(day_teen * ordercount*0.8);
				} else if (choose == 1 && age >= 19 && age <= 64) {
					total = (int)(day_adult * ordercount*0.8);
				} else if (choose == 1 && age >= 65) {
					total = (int)(day_old * ordercount*0.8);
				}
				
				if (choose == 2 && age <= 2) {
					total = (int) (baby * ordercount*0.8);
				} else if (choose == 2 && age >= 3 && age <= 12) {
					total =  (int)(day_child * ordercount*0.8);
				} else if (choose == 2 && age >= 13 && age <= 18) {
					total = (int)(day_teen * ordercount*0.8);
				} else if (choose == 2 && age >= 19 && age <= 64) {
					total = (int)(day_adult * ordercount*0.8);
				} else if (choose == 2 && age >= 65) {
					total = (int)(day_old * ordercount*0.8);
				}
			} else if (discountselect1 == 5) {
				if (choose == 1 && age <= 2) {
					total = (int) (baby * ordercount*0.85);
				} else if (choose == 1 && age >= 3 && age <= 12) {
					total =  (int)(day_child * ordercount*0.85);
				} else if (choose == 1 && age >= 13 && age <= 18) {
					total = (int)(day_teen * ordercount*0.85);
				} else if (choose == 1 && age >= 19 && age <= 64) {
					total = (int)(day_adult * ordercount*0.85);
				} else if (choose == 1 && age >= 65) {
					total = (int) (day_old * ordercount * 0.85);
				}

				if (choose == 2 && age <= 2) {
					total = (int) (baby * ordercount * 0.85);
				} else if (choose == 2 && age >= 3 && age <= 12) {
					total = (int) (day_child * ordercount * 0.85);
				} else if (choose == 2 && age >= 13 && age <= 18) {
					total = (int) (day_teen * ordercount * 0.85);
				} else if (choose == 2 && age >= 19 && age <= 64) {
					total = (int) (day_adult * ordercount * 0.85);
				} else if (choose == 2 && age >= 65) {
					total = (int) (day_old * ordercount * 0.85);
				}
			}			
			System.out.println("가격은 "+total+"원 입니다.");
			System.out.println("감사합니다.");
			
		
		if(total<0)break;
		}
	}
}

