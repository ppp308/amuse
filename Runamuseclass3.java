package new2;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Runamuseclass3 {
	private static final String choose = null;
	Inputamuseclass2 inputclass = new Inputamuseclass2();
	SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
	Date date = new Date();
	String today = sdf.format(date);
	
	public String dividdaynight(String choose) {
		String chooseresult = String.valueOf(choose);
		switch (choose) {
		case "1":
			chooseresult = "주간권";
			break;
		case "2":
			chooseresult = "야간권";
			break;
		default:
			break;
		}
		return chooseresult;
	}

	public String dividage(String customeridnumber) {

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
		String age1 = String.valueOf(age);
		if (age <= 2) {
			age1 = "유아";
		} else if (age >= 3 && age <= 12) {
			age1 = "어린이";
		} else if (age >= 13 && age <= 18) {
			age1 = "청소년";
		} else if (age >= 19 && age <= 64) {
			age1 = "어른";
		} else {
			age1 = "경로";
		}
		return age1;
	}
	public int totalprice(int total) {
		int totalprice =0;
		totalprice = totalprice + total;
		System.out.println("입장료 총액은 " + totalprice + "원 입니다.");
		System.out.println("===================================");		
		return totalprice;
	}
	

	public int calculpricenothing(String choose, String age1, int ordercount) {
		int total = 0;
		if (choose.equals("주간권") && age1.equals("유아")) {		
			total = Valueclass2.baby * ordercount;
		} else if (choose.equals("주간권") && age1.equals("어린이")) {
			total = Valueclass2.day_child * ordercount;
		} else if (choose.equals("주간권") && age1.equals("청소년")) {
			total = Valueclass2.day_teen * ordercount;
		} else if (choose.equals("주간권") && age1.equals("어른")) {
			total = Valueclass2.day_adult * ordercount;
		} else if (choose.equals("주간권") && age1.equals("경로")) {
			total = Valueclass2.day_old * ordercount;
		}
		if (choose.equals("야간권") && age1.equals("유아")) {
			total = Valueclass2.baby * ordercount;
		} else if (choose.equals("야간권") && age1.equals("어린이")) {
			total = Valueclass2.night_child * ordercount;
		} else if (choose.equals("야간권") && age1.equals("청소년")) {
			total = Valueclass2.night_teen * ordercount;
		} else if (choose.equals("야간권") && age1.equals("어른")) {
			total = Valueclass2.night_adult * ordercount;
		} else if (choose.equals("야간권") && age1.equals("경로")) {
			total = Valueclass2.night_old * ordercount;
		}
		return total;
	}

	public int calculpricedisabled(String choose, String age1, int ordercount) {
		int total = 0;
		if (choose.equals("주간권") && age1.equals("유아")) {
			total = (int) (Valueclass2.baby * ordercount * 0.6);
		} else if (choose.equals("주간권") && age1.equals("어린이")) {
			total = (int) (Valueclass2.day_child * ordercount * 0.6);
		} else if (choose.equals("주간권") && age1.equals("청소년")) {
			total = (int) (Valueclass2.day_teen * ordercount * 0.6);
		} else if (choose.equals("주간권") && age1.equals("어른")) {
			total = (int) (Valueclass2.day_adult * ordercount * 0.6);
		} else if (choose.equals("주간권") && age1.equals("경로")) {
			total = (int) (Valueclass2.day_old * ordercount * 0.6);
		}

		if (choose.equals("야간권") && age1.equals("유아")) {
			total = (int) (Valueclass2.baby * ordercount * 0.6);
		} else if (choose.equals("야간권") && age1.equals("어린이")) {
			total = (int) (Valueclass2.day_child * ordercount * 0.6);
		} else if (choose.equals("야간권") && age1.equals("청소년")) {
			total = (int) (Valueclass2.day_teen * ordercount * 0.6);
		} else if (choose.equals("야간권") && age1.equals("어른")) {
			total = (int) (Valueclass2.day_adult * ordercount * 0.6);
		} else if (choose.equals("야간권") && age1.equals("경로")) {
			total = (int) (Valueclass2.day_old * ordercount * 0.6);
		}
		return total;
	}

	public int calculpricenational(String choose, String age1, int ordercount) {
		int total = 0;
		if (choose.equals("주간권") && age1.equals("유아")) {
			total = (int) (Valueclass2.baby * ordercount * 0.5);
		} else if (choose.equals("주간권") && age1.equals("어린이")) {
			total = (int) (Valueclass2.day_child * ordercount * 0.5);
		} else if (choose.equals("주간권") && age1.equals("청소년")) {
			total = (int) (Valueclass2.day_teen * ordercount * 0.5);
		} else if (choose.equals("주간권") && age1.equals("어른")) {
			total = (int) (Valueclass2.day_adult * ordercount * 0.5);
		} else if (choose.equals("주간권") && age1.equals("경로")) {
			total = (int) (Valueclass2.day_old * ordercount * 0.5);
		}

		if (choose.equals("야간권") && age1.equals("유아")) {
			total = (int) (Valueclass2.baby * ordercount * 0.5);
		} else if (choose.equals("야간권") && age1.equals("어린이")) {
			total = (int) (Valueclass2.day_child * ordercount * 0.5);
		} else if (choose.equals("야간권") && age1.equals("청소년")) {
			total = (int) (Valueclass2.day_teen * ordercount * 0.5);
		} else if (choose.equals("야간권") && age1.equals("어른")) {
			total = (int) (Valueclass2.day_adult * ordercount * 0.5);
		} else if (choose.equals("야간권") && age1.equals("경로")) {
			total = (int) (Valueclass2.day_old * ordercount * 0.5);
		}
		return total;
	}

	public int calculpricemulti_child(String choose, String age1, int ordercount) {
		int total = 0;
		if (choose.equals("주간권") && age1.equals("유아")) {
			total = (int) (Valueclass2.baby * ordercount * 0.8);
		} else if (choose.equals("주간권") && age1.equals("어린이")) {
			total = (int) (Valueclass2.day_child * ordercount * 0.8);
		} else if (choose.equals("주간권") && age1.equals("청소년")) {
			total = (int) (Valueclass2.day_teen * ordercount * 0.8);
		} else if (choose.equals("주간권") && age1.equals("어른")) {
			total = (int) (Valueclass2.day_adult * ordercount * 0.8);
		} else if (choose.equals("주간권") && age1.equals("경로")) {
			total = (int) (Valueclass2.day_old * ordercount * 0.8);
		}

		if (choose.equals("야간권") && age1.equals("유아")) {
			total = (int) (Valueclass2.baby * ordercount * 0.8);
		} else if (choose.equals("야간권") && age1.equals("어린이")) {
			total = (int) (Valueclass2.day_child * ordercount * 0.8);
		} else if (choose.equals("야간권") && age1.equals("청소년")) {
			total = (int) (Valueclass2.day_teen * ordercount * 0.8);
		} else if (choose.equals("야간권") && age1.equals("어른")) {
			total = (int) (Valueclass2.day_adult * ordercount * 0.8);
		} else if (choose.equals("야간권") && age1.equals("경로")) {
			total = (int) (Valueclass2.day_old * ordercount * 0.8);
		}
		return total;
	}

	public int calculpricepregnant(String choose, String age1, int ordercount) {
		int total = 0;
		if (choose.equals("주간권") && age1.equals("유아")) {
			total = (int) (Valueclass2.baby * ordercount * 0.85);
		} else if (choose.equals("주간권") && age1.equals("어린이")) {
			total = (int) (Valueclass2.day_child * ordercount * 0.85);
		} else if (choose.equals("주간권") && age1.equals("청소년")) {
			total = (int) (Valueclass2.day_teen * ordercount * 0.85);
		} else if (choose.equals("주간권") && age1.equals("어른")) {
			total = (int) (Valueclass2.day_adult * ordercount * 0.85);
		} else if (choose.equals("주간권") && age1.equals("경로")) {
			total = (int) (Valueclass2.day_old * ordercount * 0.85);
		}

		if (choose.equals("야간권") && age1.equals("유아")) {
			total = (int) (Valueclass2.baby * ordercount * 0.85);
		} else if (choose.equals("야간권") && age1.equals("어린이")) {
			total = (int) (Valueclass2.day_child * ordercount * 0.85);
		} else if (choose.equals("야간권") && age1.equals("청소년")) {
			total = (int) (Valueclass2.day_teen * ordercount * 0.85);
		} else if (choose.equals("야간권") && age1.equals("어른")) {
			total = (int) (Valueclass2.day_adult * ordercount * 0.85);
		} else if (choose.equals("야간권") && age1.equals("경로")) {
			total = (int) (Valueclass2.day_old * ordercount * 0.85);
		}
		return total;
	}
}
