package Amusementpark;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Runamuseclass {
	Intputamuseclass inputclass = new Intputamuseclass();

	SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
	Date date = new Date();
	String today = sdf.format(date);

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
}
