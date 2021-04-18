package new2;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Outputamuseclass3 throws IOException{
	private static final int choose = 0;
	SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
	 BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(
			 "C:\\Users\\박재현\\Desktop\\file.txt", true), "MS949"));
	Date date = new Date();
	String today = sdf.format(date);
	String time1 = sdf.format(date);
	ArrayList<String> al = new ArrayList<String>();
	ArrayList<String> als = new ArrayList<String>();
	Inputamuseclass2 inputclass = new Inputamuseclass2();

	public void printarray(int chooseresult, String ageresult, int ordercount, int price, int discountresult) {
		String customer = chooseresult + " " + ageresult + "*" + ordercount + " " + price + "원" + " * "
				+ discountresult;
		al.add(customer);

	}
	public void printcsv(String time1,int chooseresult, String ageresult, int ordercount, int price, int discountresult) {
		
		String customer1 = time1 + "," + chooseresult + "," + ageresult + "," + ordercount + "," + price + ","
				+ discountresult;
		als.add(customer1);
		
	}

	public void printcustomer() {
		for (String customers : al) {
			System.out.println(customers);
		}
	}
	public void printcsvcustomer() {
		writer.write("날짜,권종,연령구분,수량,가격,우대사항\n");
		writer.flush();
		for (String customer1s : als) {
			writer.write(customer1s + "\r\n");
			writer.flush();
		}
	}

	public String printchoose(int choose) {
		String chooseresult = "";
		switch (choose) {
		case 1:
			chooseresult = "주간권";
			break;
		case 2:
			chooseresult = "야간권";
			break;
		default:
			break;
		}
		return chooseresult;

	}

	public String printage(int age) {
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

	public String printdiscount(int discountselect) {
		String discountresult = "";
		if (discountselect == 1) {
			discountresult = "우대 없음";
		} else if (discountselect == 2) {
			discountresult = "장애인 우대";
		} else if (discountselect == 3) {
			discountresult = "국가유공자 우대";
		} else if (discountselect == 4) {
			discountresult = "다자녀 우대";
		} else if (discountselect == 5) {
			discountresult = "임산부 우대";
		}
		return discountresult;
	}

	public void printprice(int price) {
		int totalprice = 0;
		System.out.println("가격은 " + price + "원 입니다.");
		System.out.println("감사합니다.");
		totalprice = totalprice + price;
	}

}