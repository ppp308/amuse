package Amusementpark;

import java.util.ArrayList;
import java.util.Scanner;

public class Amuse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		ArrayList<String> al = new ArrayList<String>();

		int total = 0;
		int num = 0;
		int totalprice = 0;
		int isexit = 0;
		do {
			while (true) {
				Intputamuseclass inputclass = new Intputamuseclass();
				String choose = inputclass.daynightticket();
				Runamuseclass runclass = new Runamuseclass();
				String customeridnumber = inputclass.customeridselect();
				int ordercount = inputclass.ordercount();
				int discountselect1 = inputclass.discountselect1();
				String age1 = runclass.dividage(customeridnumber);
				String daynight = runclass.dividdaynight(choose);

				if (discountselect1 == Valueclass.nothing) {
					total = runclass.calculpricenothing(daynight, age1, ordercount);
				} else if (discountselect1 == Valueclass.disabled) {
					total = runclass.calculpricedisabled(daynight, age1, ordercount);
				} else if (discountselect1 == Valueclass.national) {
					total = runclass.calculpricenational(daynight, age1, ordercount);
				} else if (discountselect1 == Valueclass.multi_child) {
					total = runclass.calculpricemulti_child(daynight, age1, ordercount);
				} else if (discountselect1 == Valueclass.pregnant) {
					total = runclass.calculpricepregnant(daynight, age1, ordercount);
				}
				totalprice = totalprice + total;
				System.out.println("������ " + total + "�� �Դϴ�.");
				System.out.println("�����մϴ�.");
				num = inputclass.askcloseticket();
				String customer = daynight + "," + age1 + "," + ordercount + "," + total + "��" + "," + discountselect1;
				al.add(customer);
				if (num == 2) {
					System.out.println("Ƽ�� �߱��� �����մϴ�. �����մϴ�.");
					System.out.println("================�������� ============");
					for (String customers : al) {
						System.out.println(customers);
					}

					System.out.println("����� �Ѿ��� " + totalprice + "�� �Դϴ�.");
					System.out.println("===================================");
					isexit = inputclass.continueecheck();
					break;
				}
			}

		} while (isexit == 1);

	}
}
