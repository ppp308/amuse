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
				
				if (discountselect1 == Valueclass.nothing) {
					if ("�ְ���"== runclass.dividdaynight(choose) && runclass.dividage(customeridnumber)=="����") {
						total = Valueclass.baby * ordercount;
					} else if ("�ְ���"== runclass.dividdaynight(choose)&& runclass.dividage(customeridnumber)=="���") {
						total = Valueclass.day_child * ordercount;
					} else if ("�ְ���"== runclass.dividdaynight(choose) && runclass.dividage(customeridnumber)=="û�ҳ�") {
						total = Valueclass.day_teen * ordercount;
					} else if ("�ְ���"== runclass.dividdaynight(choose)&& runclass.dividage(customeridnumber)=="�") {
						total = Valueclass.day_adult * ordercount;
					} else if ("�ְ���"== runclass.dividdaynight(choose) && runclass.dividage(customeridnumber)=="���") {
						total = Valueclass.day_old * ordercount;
					}

					if ("�߰���"== runclass.dividdaynight(choose) && runclass.dividage(customeridnumber)=="����") {
						total = Valueclass.baby * ordercount;
					} else if ("�߰���"== runclass.dividdaynight(choose) && runclass.dividage(customeridnumber)=="���") {
						total = Valueclass.night_child * ordercount;
					} else if ("�߰���"== runclass.dividdaynight(choose) && runclass.dividage(customeridnumber)=="û�ҳ�") {
						total = Valueclass.night_teen * ordercount;
					} else if ("�߰���"== runclass.dividdaynight(choose) && runclass.dividage(customeridnumber)=="�") {
						total = Valueclass.night_adult * ordercount;
					} else if ("�߰���"== runclass.dividdaynight(choose) && runclass.dividage(customeridnumber)=="���") {
						total = Valueclass.night_old * ordercount;
					}

				} else if (discountselect1 == Valueclass.disabled) {
					if ("�ְ���"== runclass.dividdaynight(choose) && runclass.dividage(customeridnumber)=="����") {
						total = (int) (Valueclass.baby * ordercount * 0.6);
					} else if ("�ְ���"== runclass.dividdaynight(choose) && runclass.dividage(customeridnumber)=="���") {
						total = (int) (Valueclass.day_child * ordercount * 0.6);
					} else if ("�ְ���"== runclass.dividdaynight(choose) && runclass.dividage(customeridnumber)=="û�ҳ�") {
						total = (int) (Valueclass.day_teen * ordercount * 0.6);
					} else if ("�ְ���"== runclass.dividdaynight(choose) && runclass.dividage(customeridnumber)=="�") {
						total = (int) (Valueclass.day_adult * ordercount * 0.6);
					} else if ("�ְ���"== runclass.dividdaynight(choose) && runclass.dividage(customeridnumber)=="���") {
						total = (int) (Valueclass.day_old * ordercount * 0.6);
					}

					if ("�߰���"== runclass.dividdaynight(choose) && runclass.dividage(customeridnumber)=="����") {
						total = (int) (Valueclass.baby * ordercount * 0.6);
					} else if ("�߰���"== runclass.dividdaynight(choose) && runclass.dividage(customeridnumber)=="���") {
						total = (int) (Valueclass.day_child * ordercount * 0.6);
					} else if ("�߰���"== runclass.dividdaynight(choose) && runclass.dividage(customeridnumber)=="û�ҳ�") {
						total = (int) (Valueclass.day_teen * ordercount * 0.6);
					} else if ("�߰���"== runclass.dividdaynight(choose) && runclass.dividage(customeridnumber)=="�") {
						total = (int) (Valueclass.day_adult * ordercount * 0.6);
					} else if ("�߰���"== runclass.dividdaynight(choose) && runclass.dividage(customeridnumber)=="���") {
						total = (int) (Valueclass.day_old * ordercount * 0.6);
					}
				} else if (discountselect1 == Valueclass.national) {
					if ("�ְ���"== runclass.dividdaynight(choose) && runclass.dividage(customeridnumber)=="����") {
						total = (int) (Valueclass.baby * ordercount * 0.5);
					} else if ("�ְ���"== runclass.dividdaynight(choose) && runclass.dividage(customeridnumber)=="���") {
						total = (int) (Valueclass.day_child * ordercount * 0.5);
					} else if ("�ְ���"== runclass.dividdaynight(choose) && runclass.dividage(customeridnumber)=="û�ҳ�") {
						total = (int) (Valueclass.day_teen * ordercount * 0.5);
					} else if ("�ְ���"== runclass.dividdaynight(choose) && runclass.dividage(customeridnumber)=="�") {
						total = (int) (Valueclass.day_adult * ordercount * 0.5);
					} else if ("�ְ���"== runclass.dividdaynight(choose) && runclass.dividage(customeridnumber)=="���") {
						total = (int) (Valueclass.day_old * ordercount * 0.5);
					}

					if ("�߰���"== runclass.dividdaynight(choose) && runclass.dividage(customeridnumber)=="����") {
						total = (int) (Valueclass.baby * ordercount * 0.5);
					} else if ("�߰���"== runclass.dividdaynight(choose) && runclass.dividage(customeridnumber)=="���") {
						total = (int) (Valueclass.day_child * ordercount * 0.5);
					} else if ("�߰���"== runclass.dividdaynight(choose)&& runclass.dividage(customeridnumber)=="û�ҳ�") {
						total = (int) (Valueclass.day_teen * ordercount * 0.5);
					} else if ("�߰���"== runclass.dividdaynight(choose) && runclass.dividage(customeridnumber)=="�") {
						total = (int) (Valueclass.day_adult * ordercount * 0.5);
					} else if ("�߰���"== runclass.dividdaynight(choose) && runclass.dividage(customeridnumber)=="���") {
						total = (int) (Valueclass.day_old * ordercount * 0.5);
					}
				} else if (discountselect1 == Valueclass.multi_child) {
					if ("�ְ���"== runclass.dividdaynight(choose) && runclass.dividage(customeridnumber)=="����") {
						total = (int) (Valueclass.baby * ordercount * 0.8);
					} else if ("�ְ���"== runclass.dividdaynight(choose) && runclass.dividage(customeridnumber)=="���") {
						total = (int) (Valueclass.day_child * ordercount * 0.8);
					} else if ("�ְ���"== runclass.dividdaynight(choose) && runclass.dividage(customeridnumber)=="û�ҳ�") {
						total = (int) (Valueclass.day_teen * ordercount * 0.8);
					} else if ("�ְ���"== runclass.dividdaynight(choose) && runclass.dividage(customeridnumber)=="�") {
						total = (int) (Valueclass.day_adult * ordercount * 0.8);
					} else if ("�ְ���"== runclass.dividdaynight(choose) && runclass.dividage(customeridnumber)=="���") {
						total = (int) (Valueclass.day_old * ordercount * 0.8);
					}

					if ("�߰���"== runclass.dividdaynight(choose) && runclass.dividage(customeridnumber)=="����") {
						total = (int) (Valueclass.baby * ordercount * 0.8);
					} else if ("�߰���"== runclass.dividdaynight(choose) && runclass.dividage(customeridnumber)=="���") {
						total = (int) (Valueclass.day_child * ordercount * 0.8);
					} else if ("�߰���"== runclass.dividdaynight(choose) && runclass.dividage(customeridnumber)=="û�ҳ�") {
						total = (int) (Valueclass.day_teen * ordercount * 0.8);
					} else if ("�߰���"== runclass.dividdaynight(choose) && runclass.dividage(customeridnumber)=="�") {
						total = (int) (Valueclass.day_adult * ordercount * 0.8);
					} else if ("�߰���"== runclass.dividdaynight(choose) && runclass.dividage(customeridnumber)=="���") {
						total = (int) (Valueclass.day_old * ordercount * 0.8);
					}
				} else if (discountselect1 == Valueclass.pregnant) {
					if ("�ְ���"== runclass.dividdaynight(choose) && runclass.dividage(customeridnumber)=="����") {
						total = (int) (Valueclass.baby * ordercount * 0.85);
					} else if ("�ְ���"== runclass.dividdaynight(choose) && runclass.dividage(customeridnumber)=="���") {
						total = (int) (Valueclass.day_child * ordercount * 0.85);
					} else if ("�ְ���"== runclass.dividdaynight(choose) && runclass.dividage(customeridnumber)=="û�ҳ�") {
						total = (int) (Valueclass.day_teen * ordercount * 0.85);
					} else if ("�ְ���"== runclass.dividdaynight(choose) && runclass.dividage(customeridnumber)=="�") {
						total = (int) (Valueclass.day_adult * ordercount * 0.85);
					} else if ("�ְ���"== runclass.dividdaynight(choose) && runclass.dividage(customeridnumber)=="���") {
						total = (int) (Valueclass.day_old * ordercount * 0.85);
					}

					if ("�߰���"== runclass.dividdaynight(choose) && runclass.dividage(customeridnumber)=="����") {
						total = (int) (Valueclass.baby * ordercount * 0.85);
					} else if ("�߰���"== runclass.dividdaynight(choose)&& runclass.dividage(customeridnumber)=="���") {
						total = (int) (Valueclass.day_child * ordercount * 0.85);
					} else if ("�߰���"== runclass.dividdaynight(choose) && runclass.dividage(customeridnumber)=="û�ҳ�") {
						total = (int) (Valueclass.day_teen * ordercount * 0.85);
					} else if ("�߰���"== runclass.dividdaynight(choose) && runclass.dividage(customeridnumber)=="�") {
						total = (int) (Valueclass.day_adult * ordercount * 0.85);
					} else if ("�߰���"== runclass.dividdaynight(choose) && runclass.dividage(customeridnumber)=="���") {
						total = (int) (Valueclass.day_old * ordercount * 0.85);
					}
				}
				totalprice = totalprice + total;
				System.out.println("������ " + total + "�� �Դϴ�.");
				System.out.println("�����մϴ�.");
				num = inputclass.askcloseticket();
				String customer = runclass.dividdaynight(choose) + "," + runclass.dividage(customeridnumber) + "," + ordercount + "," + total+"��" +"," + discountselect1;
				al.add(customer);
				if (num == 2) {
					System.out.println("Ƽ�� �߱��� �����մϴ�. �����մϴ�.");
					System.out.println("================�������� ============");
					for (String customers : al) {
						System.out.println(customers);
					}
				

					System.out.println("����� �Ѿ��� " + totalprice + "�� �Դϴ�.");
					System.out.println("===================================");
					isexit =inputclass.continueecheck();
					break;
				}
			}

		} while (isexit == 1);

	}
}
