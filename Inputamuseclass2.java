package new2;
import java.util.Scanner;
public class Inputamuseclass2 {
		Scanner sc = new Scanner(System.in);
		Scanner sb = new Scanner(System.in);

		public String daynightticket() {
			System.out.println("������ �����ϼ���");
			System.out.println("1. �ְ���");
			System.out.println("2. �߰���");
			System.out.println("->");
			String choose = sc.nextLine();
			return choose;
		}

		public String customeridselect() {
			System.out.println("�ֹι�ȣ�� �Է��ϼ���");
			String customeridnumber = sb.nextLine();
			return customeridnumber;
		}

		public int ordercount() {
			System.out.println("��� �ֹ��Ͻðڽ��ϱ�? (�ִ� 10��)");
			int ordercount = sc.nextInt();
			return ordercount;
		}

		public int discountselect1() {
			System.out.println("1. ���� (���� ���� �ڵ�ó��)");
			System.out.println("2. �����");
			System.out.println("3. ����������");
			System.out.println("4. ���ڳ�");
			System.out.println("5. �ӻ��");
			int discountselect1 = sc.nextInt();
			return discountselect1;
		}

		public int askcloseticket() {
			System.out.println("��� �߱� �Ͻðڽ��ϱ�?");
			System.out.println("1.Ƽ�� �߱�");
			System.out.println("2.����");
			int num = sc.nextInt();
			return num;
		}

		public int continueecheck() {
			System.out.println("��� ����(1: ���ο� �ֹ�, 2: ���α׷� ����):");
			int isexit = sc.nextInt();
			return isexit;
		}
	}

