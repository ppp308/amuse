package new2;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Outputamuseclass3 {
	SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
	//BufferedWriter writer = new BufferedWriter(
	//		new OutputStreamWriter(new FileOutputStream("C:\\Users\\������\\Desktop\\file.txt", true), "MS949"));
	Date date = new Date();	
	String today = sdf.format(date);
	String time1 =sdf.format(date);
	ArrayList<String> al = new ArrayList<String>();
	ArrayList<String> als = new ArrayList<String>();
	Inputamuseclass2 inputclass = new Inputamuseclass2();
	
/*	public void makecustomer(int choose){
		String customer = output + " " + ageresult + "*" + ordercount + " " + price + "��" + " * "
				+ discountresult;
		al.add(customer);
		String customer1 = time1 + "," + chooseresult + "," + ageresult + "," + ordercount + "," + price + ","
				+ discountresult;
		als.add(customer1);
	}
	*/public void printchoose(int choose) {
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
	}

	public void printage(int age) {
		String ageresult = "";
		if (age <= 2) {
			ageresult = "����";
		} else if (age >= 3 && age <= 12) {
			ageresult = "���";
		} else if (age >= 13 && age <= 18) {
			ageresult = "û�ҳ�";
		} else if (age >= 19 && age <= 64) {
			ageresult = "�";
		} else {
			ageresult = "���";
		}
	}

	public void printdiscount(int discountselect) {
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
	}
	public void printprice(int price) {
		int totalprice =0;
		System.out.println("������ " + price+ "�� �Դϴ�.");
		System.out.println("�����մϴ�.");
		totalprice = totalprice + price;
	}
	

}