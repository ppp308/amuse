package new2;

import java.util.ArrayList;
import java.util.Scanner;

public class Amuse2 {

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
				Inputamuseclass2 inputclass = new Inputamuseclass2();
				Outputamuseclass2 outputclass = new Outputamuseclass2();
				String choose = inputclass.daynightticket();
				Runamuseclass2 runclass = new Runamuseclass2();
				
				String customeridnumber = inputclass.customeridselect();
				int ordercount = inputclass.ordercount();
				int discountselect1 = inputclass.discountselect1();
				String age1 = runclass.dividage(customeridnumber);
				String daynight = runclass.dividdaynight(choose);

				if (discountselect1 == Valueclass2.nothing) {
					total = runclass.calculpricenothing(daynight, age1, ordercount);
				} else if (discountselect1 == Valueclass2.disabled) {
					total = runclass.calculpricedisabled(daynight, age1, ordercount);
				} else if (discountselect1 == Valueclass2.national) {
					total = runclass.calculpricenational(daynight, age1, ordercount);
				} else if (discountselect1 == Valueclass2.multi_child) {
					total = runclass.calculpricemulti_child(daynight, age1, ordercount);
				} else if (discountselect1 == Valueclass2.pregnant) {
					total = runclass.calculpricepregnant(daynight, age1, ordercount);
				}
			
				String discountselect = outputclass.printdiscountselect(discountselect1);
			
				totalprice = totalprice + total;
				System.out.println("������ " + total + "�� �Դϴ�.");
				System.out.println("�����մϴ�.");
				num = inputclass.askcloseticket();
				String customer = daynight + " " + age1 + "*" + ordercount + " " + total + "��" + " * " + discountselect;
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