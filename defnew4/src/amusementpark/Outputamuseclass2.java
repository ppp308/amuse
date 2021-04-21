package amusementpark;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
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
	
	
	
	public static void printsqul(String time1, String chooseresult, String age, int ordercount, int price, String discountresult) 
			throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/testdb","root","koposw11");
		Statement stmt = conn.createStatement();
		String customer1 = printcsv(time1, chooseresult,  age,  ordercount, price,discountresult);
		stmt.execute("insert into ticket (date, daynight, age, count, price, discount) values("+customer1 +");");
		System.out.println("insert into ticket (now(), daynight, age, count, price, discount) values("+customer1+");");
		ResultSet rset = stmt.executeQuery("SELECT * FROM  ticket");
		
			rset.close();
			stmt.close();
			conn.close();		
	}
	

	public static String printcsv(String time1, String chooseresult, String age, int ordercount, int price,
			String discountresult) {
		String customer1 = "DATE_FORMAT(now(), '%Y%m%d'),'" + chooseresult + "','" + age + "'," + ordercount + "," + price + ",'"
				+ discountresult +"'";
		als.add(customer1);
		return customer1;	
	}

	
	public void printtwo() throws IOException {
		System.out.println("티켓 발권을 종료합니다. 감사합니다. ");
		System.out.println("================제리랜드 ============");
		printcustomer();
		filewrite();
	}

	public void printtotal(int totalprice) {
		System.out.println("입장료 총액은" + totalprice + "원입니다.");
		System.out.println("===================================");
	}

	public void printarray(String chooseresult, String age, int ordercount, int price, String discountresult) {
		String customer = chooseresult + " " + age + "*" + ordercount + " " + price + "원" + " * " + discountresult;
		al.add(customer);
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
			discountresult = "우대없음";
		} else if (discountselect == 2) {
			discountresult = "장애인우대";
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
		System.out.println("가격은 " + price + "원입니다.");
		System.out.println("감사합니다");
		totalprice = totalprice + price;
	}
}