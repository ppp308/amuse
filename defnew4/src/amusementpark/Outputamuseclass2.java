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
		writer.write("��¥,����,���ɱ���,����,����,������\n");
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
		System.out.println("Ƽ�� �߱��� �����մϴ�. �����մϴ�. ");
		System.out.println("================�������� ============");
		printcustomer();
		filewrite();
	}

	public void printtotal(int totalprice) {
		System.out.println("����� �Ѿ���" + totalprice + "���Դϴ�.");
		System.out.println("===================================");
	}

	public void printarray(String chooseresult, String age, int ordercount, int price, String discountresult) {
		String customer = chooseresult + " " + age + "*" + ordercount + " " + price + "��" + " * " + discountresult;
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
			chooseresult = "�ְ���";
			break;
		case 2:
			chooseresult = "�߰���";
			break;
		default:
			break;
		}
		return chooseresult;
	}

	public String printdiscount(int discountselect) {
		String discountresult = "";
		if (discountselect == 1) {
			discountresult = "������";
		} else if (discountselect == 2) {
			discountresult = "����ο��";
		} else if (discountselect == 3) {
			discountresult = "���������� ���";
		} else if (discountselect == 4) {
			discountresult = "���ڳ� ���";
		} else if (discountselect == 5) {
			discountresult = "�ӻ�� ���";
		}
		return discountresult;
	}

	public void print(int price) {
		System.out.println("������ " + price + "���Դϴ�.");
		System.out.println("�����մϴ�");
		totalprice = totalprice + price;
	}
}