package new2;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Outputamuseclass2 {
	SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
	static ArrayList<String> al = new ArrayList<String>();
	static ArrayList<String> als = new ArrayList<String>();
	Inputamuseclass2 inputclass = new Inputamuseclass2();
	Date date = new Date();
	String today = sdf.format(date);
	String time1 = sdf.format(date);
	private static final int choose = 0;
	int totalprice = 0;

	public static void filewrite() throws IOException {
		BufferedWriter writer = new BufferedWriter(
				new OutputStreamWriter(new FileOutputStream(Valueclass2.path, true), "MS949"));
		writer.write("날짜,권종,연령구분,수량,가격,우대사항\n");
		writer.flush();
		for (String customer1s : als) {
			writer.write(customer1s + "\r\n");
			writer.flush();
		}
	}

	public void printtwo() throws IOException {
		System.out.println("티켓 발권을 종료합니다. 감사합니다.");
		System.out.println("================제리랜드 ============");
		printcustomer();
		filewrite();
	}

	public void printtotal(int totalprice) {
		System.out.println("입장료 총액은 " + totalprice + "원 입니다.");
		System.out.println("===================================");
	}

	public void printarray(String chooseresult, String age, int ordercount, int price, String discountresult) {
		String customer = chooseresult + " " + age + "*" + ordercount + " " + price + "원" + " * " + discountresult;
		al.add(customer);
	}

	public void printcsv(String time1, String chooseresult, String age, int ordercount, int price,
			String discountresult) {
		String customer1 = time1 + "," + chooseresult + "," + age + "," + ordercount + "," + price + ","
				+ discountresult;
		als.add(customer1);
	}

	public void printcustomer() {
		for (String customers : al) {
			System.out.println(customers);
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

	public void print(int price) {
		System.out.println("가격은 " + price + "원 입니다.");
		System.out.println("감사합니다.");
		totalprice = totalprice + price;
	}
}