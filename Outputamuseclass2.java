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
		writer.write("��¥,����,���ɱ���,����,����,������\n");
		writer.flush();
		for (String customer1s : als) {
			writer.write(customer1s + "\r\n");
			writer.flush();
		}
	}

	public void printtwo() throws IOException {
		System.out.println("Ƽ�� �߱��� �����մϴ�. �����մϴ�.");
		System.out.println("================�������� ============");
		printcustomer();
		filewrite();
	}

	public void printtotal(int totalprice) {
		System.out.println("����� �Ѿ��� " + totalprice + "�� �Դϴ�.");
		System.out.println("===================================");
	}

	public void printarray(String chooseresult, String age, int ordercount, int price, String discountresult) {
		String customer = chooseresult + " " + age + "*" + ordercount + " " + price + "��" + " * " + discountresult;
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
			discountresult = "��� ����";
		} else if (discountselect == 2) {
			discountresult = "����� ���";
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
		System.out.println("������ " + price + "�� �Դϴ�.");
		System.out.println("�����մϴ�.");
		totalprice = totalprice + price;
	}
}