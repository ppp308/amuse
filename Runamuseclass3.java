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
			chooseresult = "�ְ���";
			break;
		case "2":
			chooseresult = "�߰���";
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
			age1 = "����";
		} else if (age >= 3 && age <= 12) {
			age1 = "���";
		} else if (age >= 13 && age <= 18) {
			age1 = "û�ҳ�";
		} else if (age >= 19 && age <= 64) {
			age1 = "�";
		} else {
			age1 = "���";
		}
		return age1;
	}

	

	public int calculpricenothing(String choose, String age1, int ordercount,int discountselect1) {
		int total = 0;
		
		if(discountselect1 ==1) {
		if (choose.equals("�ְ���") && age1.equals("����")) {		
			total = Valueclass2.baby * ordercount;
			System.out.println("������ " + total + "�� �Դϴ�.");
			System.out.println("�����մϴ�.");
		} else if (choose.equals("�ְ���") && age1.equals("���")) {
			total = Valueclass2.day_child * ordercount;
			System.out.println("������ " + total + "�� �Դϴ�.");
			System.out.println("�����մϴ�.");
		} else if (choose.equals("�ְ���") && age1.equals("û�ҳ�")) {
			total = Valueclass2.day_teen * ordercount;
			System.out.println("������ " + total + "�� �Դϴ�.");
			System.out.println("�����մϴ�.");
		} else if (choose.equals("�ְ���") && age1.equals("�")) {
			total = Valueclass2.day_adult * ordercount;
			System.out.println("������ " + total + "�� �Դϴ�.");
			System.out.println("�����մϴ�.");
		} else if (choose.equals("�ְ���") && age1.equals("���")) {
			total = Valueclass2.day_old * ordercount;
			System.out.println("������ " + total + "�� �Դϴ�.");
			System.out.println("�����մϴ�.");
		}
		if (choose.equals("�߰���") && age1.equals("����")) {
			total = Valueclass2.baby * ordercount;
			System.out.println("������ " + total + "�� �Դϴ�.");
			System.out.println("�����մϴ�.");
		} else if (choose.equals("�߰���") && age1.equals("���")) {
			total = Valueclass2.night_child * ordercount;
			System.out.println("������ " + total + "�� �Դϴ�.");
			System.out.println("�����մϴ�.");
		} else if (choose.equals("�߰���") && age1.equals("û�ҳ�")) {
			total = Valueclass2.night_teen * ordercount;
			System.out.println("������ " + total + "�� �Դϴ�.");
			System.out.println("�����մϴ�.");
		} else if (choose.equals("�߰���") && age1.equals("�")) {
			total = Valueclass2.night_adult * ordercount;
			System.out.println("������ " + total + "�� �Դϴ�.");
			System.out.println("�����մϴ�.");
		} else if (choose.equals("�߰���") && age1.equals("���")) {
			total = Valueclass2.night_old * ordercount;
			System.out.println("������ " + total + "�� �Դϴ�.");
			System.out.println("�����մϴ�.");
		}
	
		}
		return total;
		
	}

	public int calculpricedisabled(String choose, String age1, int ordercount,int discountselect1) {
		int total = 0;
		if(discountselect1 ==2) {
		if (choose.equals("�ְ���") && age1.equals("����")) {
			total = (int) (Valueclass2.baby * ordercount * 0.6);
			System.out.println("������ " + total + "�� �Դϴ�.");
			System.out.println("�����մϴ�.");
		} else if (choose.equals("�ְ���") && age1.equals("���")) {
			total = (int) (Valueclass2.day_child * ordercount * 0.6);
			System.out.println("������ " + total + "�� �Դϴ�.");
			System.out.println("�����մϴ�.");
		} else if (choose.equals("�ְ���") && age1.equals("û�ҳ�")) {
			total = (int) (Valueclass2.day_teen * ordercount * 0.6);
			System.out.println("������ " + total + "�� �Դϴ�.");
			System.out.println("�����մϴ�.");
		} else if (choose.equals("�ְ���") && age1.equals("�")) {
			total = (int) (Valueclass2.day_adult * ordercount * 0.6);
			System.out.println("������ " + total + "�� �Դϴ�.");
			System.out.println("�����մϴ�.");
		} else if (choose.equals("�ְ���") && age1.equals("���")) {
			total = (int) (Valueclass2.day_old * ordercount * 0.6);
			System.out.println("������ " + total + "�� �Դϴ�.");
			System.out.println("�����մϴ�.");
		}

		if (choose.equals("�߰���") && age1.equals("����")) {
			total = (int) (Valueclass2.baby * ordercount * 0.6);
			System.out.println("������ " + total + "�� �Դϴ�.");
			System.out.println("�����մϴ�.");
		} else if (choose.equals("�߰���") && age1.equals("���")) {
			total = (int) (Valueclass2.day_child * ordercount * 0.6);
			System.out.println("������ " + total + "�� �Դϴ�.");
			System.out.println("�����մϴ�.");
		} else if (choose.equals("�߰���") && age1.equals("û�ҳ�")) {
			total = (int) (Valueclass2.day_teen * ordercount * 0.6);
			System.out.println("������ " + total + "�� �Դϴ�.");
			System.out.println("�����մϴ�.");
		} else if (choose.equals("�߰���") && age1.equals("�")) {
			total = (int) (Valueclass2.day_adult * ordercount * 0.6);
			System.out.println("������ " + total + "�� �Դϴ�.");
			System.out.println("�����մϴ�.");
		} else if (choose.equals("�߰���") && age1.equals("���")) {
			total = (int) (Valueclass2.day_old * ordercount * 0.6);
			System.out.println("������ " + total + "�� �Դϴ�.");
			System.out.println("�����մϴ�.");
		}
		}
		return total;
		
	}

	public int calculpricenational(String choose, String age1, int ordercount,int discountselect1) {
		int total = 0;
		if(discountselect1 ==3) {
		if (choose.equals("�ְ���") && age1.equals("����")) {
			total = (int) (Valueclass2.baby * ordercount * 0.5);
			System.out.println("������ " + total + "�� �Դϴ�.");
			System.out.println("�����մϴ�.");
		} else if (choose.equals("�ְ���") && age1.equals("���")) {
			total = (int) (Valueclass2.day_child * ordercount * 0.5);
			System.out.println("������ " + total + "�� �Դϴ�.");
			System.out.println("�����մϴ�.");
		} else if (choose.equals("�ְ���") && age1.equals("û�ҳ�")) {
			total = (int) (Valueclass2.day_teen * ordercount * 0.5);
			System.out.println("������ " + total + "�� �Դϴ�.");
			System.out.println("�����մϴ�.");
		} else if (choose.equals("�ְ���") && age1.equals("�")) {
			total = (int) (Valueclass2.day_adult * ordercount * 0.5);
			System.out.println("������ " + total + "�� �Դϴ�.");
			System.out.println("�����մϴ�.");
		} else if (choose.equals("�ְ���") && age1.equals("���")) {
			total = (int) (Valueclass2.day_old * ordercount * 0.5);
			System.out.println("������ " + total + "�� �Դϴ�.");
			System.out.println("�����մϴ�.");
		}

		if (choose.equals("�߰���") && age1.equals("����")) {
			total = (int) (Valueclass2.baby * ordercount * 0.5);
			System.out.println("������ " + total + "�� �Դϴ�.");
			System.out.println("�����մϴ�.");
		} else if (choose.equals("�߰���") && age1.equals("���")) {
			total = (int) (Valueclass2.day_child * ordercount * 0.5);
			System.out.println("������ " + total + "�� �Դϴ�.");
			System.out.println("�����մϴ�.");
		} else if (choose.equals("�߰���") && age1.equals("û�ҳ�")) {
			total = (int) (Valueclass2.day_teen * ordercount * 0.5);
			System.out.println("������ " + total + "�� �Դϴ�.");
			System.out.println("�����մϴ�.");
		} else if (choose.equals("�߰���") && age1.equals("�")) {
			total = (int) (Valueclass2.day_adult * ordercount * 0.5);
			System.out.println("������ " + total + "�� �Դϴ�.");
			System.out.println("�����մϴ�.");
		} else if (choose.equals("�߰���") && age1.equals("���")) {
			total = (int) (Valueclass2.day_old * ordercount * 0.5);
			System.out.println("������ " + total + "�� �Դϴ�.");
			System.out.println("�����մϴ�.");
		}
		}
		return total;
	}

	public int calculpricemulti_child(String choose, String age1, int ordercount,int discountselect1) {
		int total = 0;
		if(discountselect1 ==4) {
		if (choose.equals("�ְ���") && age1.equals("����")) {
			total = (int) (Valueclass2.baby * ordercount * 0.8);
			System.out.println("������ " + total + "�� �Դϴ�.");
			System.out.println("�����մϴ�.");
		} else if (choose.equals("�ְ���") && age1.equals("���")) {
			total = (int) (Valueclass2.day_child * ordercount * 0.8);
			System.out.println("������ " + total + "�� �Դϴ�.");
			System.out.println("�����մϴ�.");
		} else if (choose.equals("�ְ���") && age1.equals("û�ҳ�")) {
			total = (int) (Valueclass2.day_teen * ordercount * 0.8);
			System.out.println("������ " + total + "�� �Դϴ�.");
			System.out.println("�����մϴ�.");
		} else if (choose.equals("�ְ���") && age1.equals("�")) {
			total = (int) (Valueclass2.day_adult * ordercount * 0.8);
			System.out.println("������ " + total + "�� �Դϴ�.");
			System.out.println("�����մϴ�.");
		} else if (choose.equals("�ְ���") && age1.equals("���")) {
			total = (int) (Valueclass2.day_old * ordercount * 0.8);
			System.out.println("������ " + total + "�� �Դϴ�.");
			System.out.println("�����մϴ�.");
		}

		if (choose.equals("�߰���") && age1.equals("����")) {
			total = (int) (Valueclass2.baby * ordercount * 0.8);
			System.out.println("������ " + total + "�� �Դϴ�.");
			System.out.println("�����մϴ�.");
		} else if (choose.equals("�߰���") && age1.equals("���")) {
			total = (int) (Valueclass2.day_child * ordercount * 0.8);
			System.out.println("������ " + total + "�� �Դϴ�.");
			System.out.println("�����մϴ�.");
		} else if (choose.equals("�߰���") && age1.equals("û�ҳ�")) {
			total = (int) (Valueclass2.day_teen * ordercount * 0.8);
			System.out.println("������ " + total + "�� �Դϴ�.");
			System.out.println("�����մϴ�.");
		} else if (choose.equals("�߰���") && age1.equals("�")) {
			total = (int) (Valueclass2.day_adult * ordercount * 0.8);
			System.out.println("������ " + total + "�� �Դϴ�.");
			System.out.println("�����մϴ�.");
		} else if (choose.equals("�߰���") && age1.equals("���")) {
			total = (int) (Valueclass2.day_old * ordercount * 0.8);
			System.out.println("������ " + total + "�� �Դϴ�.");
			System.out.println("�����մϴ�.");
		}
		}
		return total;
	}

	public int calculpricepregnant(String choose, String age1, int ordercount,int discountselect1) {
		int total = 0;
		if(discountselect1 ==5) {
		if (choose.equals("�ְ���") && age1.equals("����")) {
			total = (int) (Valueclass2.baby * ordercount * 0.85);
			System.out.println("������ " + total + "�� �Դϴ�.");
			System.out.println("�����մϴ�.");
		} else if (choose.equals("�ְ���") && age1.equals("���")) {
			total = (int) (Valueclass2.day_child * ordercount * 0.85);
			System.out.println("������ " + total + "�� �Դϴ�.");
			System.out.println("�����մϴ�.");
		} else if (choose.equals("�ְ���") && age1.equals("û�ҳ�")) {
			total = (int) (Valueclass2.day_teen * ordercount * 0.85);
			System.out.println("������ " + total + "�� �Դϴ�.");
			System.out.println("�����մϴ�.");
		} else if (choose.equals("�ְ���") && age1.equals("�")) {
			total = (int) (Valueclass2.day_adult * ordercount * 0.85);
			System.out.println("������ " + total + "�� �Դϴ�.");
			System.out.println("�����մϴ�.");
		} else if (choose.equals("�ְ���") && age1.equals("���")) {
			total = (int) (Valueclass2.day_old * ordercount * 0.85);
			System.out.println("������ " + total + "�� �Դϴ�.");
			System.out.println("�����մϴ�.");
		}

		if (choose.equals("�߰���") && age1.equals("����")) {
			total = (int) (Valueclass2.baby * ordercount * 0.85);
			System.out.println("������ " + total + "�� �Դϴ�.");
			System.out.println("�����մϴ�.");
		} else if (choose.equals("�߰���") && age1.equals("���")) {
			total = (int) (Valueclass2.day_child * ordercount * 0.85);
			System.out.println("������ " + total + "�� �Դϴ�.");
			System.out.println("�����մϴ�.");
		} else if (choose.equals("�߰���") && age1.equals("û�ҳ�")) {
			total = (int) (Valueclass2.day_teen * ordercount * 0.85);
			System.out.println("������ " + total + "�� �Դϴ�.");
			System.out.println("�����մϴ�.");
		} else if (choose.equals("�߰���") && age1.equals("�")) {
			total = (int) (Valueclass2.day_adult * ordercount * 0.85);
			System.out.println("������ " + total + "�� �Դϴ�.");
			System.out.println("�����մϴ�.");
			
		} else if (choose.equals("�߰���") && age1.equals("���")) {
			total = (int) (Valueclass2.day_old * ordercount * 0.85);
			System.out.println("������ " + total + "�� �Դϴ�.");
			System.out.println("�����մϴ�.");
			System.out.println("������ " + total + "�� �Դϴ�.");
			System.out.println("�����մϴ�.");
		}
		}
		return total;
	}

	public int totalprice(int totalprice) {
		
		System.out.println("����� �Ѿ��� " + totalprice + "�� �Դϴ�.");
		System.out.println("===================================");		
		return totalprice;
	}
}
