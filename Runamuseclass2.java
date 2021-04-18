package new2;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Runamuseclass2 {
	Inputamuseclass2 inputclass = new Inputamuseclass2();
	Outputamuseclass2 outputclass = new Outputamuseclass2();
	SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
	Date date = new Date();
	String today = sdf.format(date);

	public String calage(String customeridnumber) {
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
		String ageresult = "";
		if (age <= 2) {
			ageresult = "유아";
		} else if (age >= 3 && age <= 12) {
			ageresult = "어린이";
		} else if (age >= 13 && age <= 18) {
			ageresult = "청소년";
		} else if (age >= 19 && age <= 64) {
			ageresult = "어른";
		} else {
			ageresult = "경로";
		}
		return ageresult;
	}

	public int calday(int discountselect, int ordercount) {
		int price = 0;
		int totalprice = 0;
		if (discountselect == 1) {
			for (int i = 0; i < Valueclass2.dayageprice.length; i++) {
				price = Valueclass2.dayageprice[i] * ordercount;
			}
			outputclass.print(price);
			totalprice = totalprice + price;
		} else if (discountselect == 2) {
			for (int i = 0; i < Valueclass2.dayageprice.length; i++) {
				price = (int) (Valueclass2.dayageprice[i] * ordercount * 0.6);
			}
			outputclass.print(price);
			totalprice = totalprice + price;
		} else if (discountselect == 3) {
			for (int i = 0; i < Valueclass2.dayageprice.length; i++) {
				price = (int) (Valueclass2.dayageprice[i] * ordercount * 0.5);
			}
			outputclass.print(price);
			totalprice = totalprice + price;

		} else if (discountselect == 4) {
			for (int i = 0; i < Valueclass2.dayageprice.length; i++) {
				price = (int) (Valueclass2.dayageprice[i] * ordercount * 0.8);
			}
			outputclass.print(price);
			totalprice = totalprice + price;
		} else if (discountselect == 5) {
			for (int i = 0; i < Valueclass2.dayageprice.length; i++) {
				price = (int) (Valueclass2.dayageprice[i] * ordercount * 0.85);
			}
			outputclass.print(price);
			totalprice = totalprice + price;
		}
		return price;
	}

	public int calnight(int discountselect, int ordercount) {
		int price = 0;
		int totalprice = 0;
		if (discountselect == 1) {
			for (int i = 0; i < Valueclass2.nightageprice.length; i++) {
				price = Valueclass2.dayageprice[i] * ordercount;
			}
			outputclass.print(price);
			totalprice = totalprice + price;
		} else if (discountselect == 2) {
			for (int i = 0; i < Valueclass2.nightageprice.length; i++) {
				price = (int) (Valueclass2.dayageprice[i] * ordercount * 0.6);
			}
			outputclass.print(price);
			totalprice = totalprice + price;
		} else if (discountselect == 3) {
			for (int i = 0; i < Valueclass2.nightageprice.length; i++) {
				price = (int) (Valueclass2.dayageprice[i] * ordercount * 0.5);
			}
			outputclass.print(price);
			totalprice = totalprice + price;
		} else if (discountselect == 4) {
			for (int i = 0; i < Valueclass2.nightageprice.length; i++) {
				price = (int) (Valueclass2.dayageprice[i] * ordercount * 0.8);
			}
			outputclass.print(price);
			totalprice = totalprice + price;
		} else if (discountselect == 5) {
			for (int i = 0; i < Valueclass2.nightageprice.length; i++) {
				price = (int) (Valueclass2.dayageprice[i] * ordercount * 0.85);
			}
			outputclass.print(price);
			totalprice = totalprice + price;
		}
		return price;
	}
}