package new2;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

//5��.������ ���� 2021.04.16 ������
//������ ���5
public class printpaper2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SimpleDateFormat sc = new SimpleDateFormat("yyyy-MM-dd HH:mm");
		SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd HH:mm:dd");
		DecimalFormat sb = new DecimalFormat("###,###,###");
		Calendar cal = Calendar.getInstance();
		Date time = new Date();
		cal.add(Calendar.HOUR, -1);
		String k11_date = sc.format(time);
		String k11_Cartime = sf.format(cal.getTime());
		String[] k11_itemname = { "�����������⸧", "�������ڸ��̿�", "�������", "�������Ϸб���", "�õ���������",
				"��������120g*5", "����������", "���ѱ��������156g", "����������Ʈ", "����", "��纣��",
				"����߰���(g)", "�����縻3��", "���Ͼ縻5��", "�����̾��������ʹ�", "�׸����Ʈ ����500", "�������",
				"�Ŀ���", "��������(��)65g*6", "�ɶ�ý�����Ʈ��Ʈ", "Ǫ���й̼��������", "���Ϸν���������500g", "������",
				"�����õ���¡��", "��ī����10����", "��� 12���� ", "�ñ�ġ", "�ٳ���", "��������", "����" };
		int[] k11_price = { 7500, 6900, 5980, 3300, 5500, 3380, 6610, 2750, 10800, 4980, 2480, 7920, 4980, 4980, 7130,
				3980, 4480, 4980, 3210, 6950, 2980, 1990, 1980, 3980, 4480, 3480, 7980, 1000, 2500, 3300 };
		int[] k11_num = { 2, 1, 1, 1, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 4, 1, 1, 1, 1, 1, 2, 1, 1, 1, 1, 2, 1, 2, 4, 1 };
		boolean[] k11_taxfree = { false, false, false, false, false, false, true, false, true, true, false, false,
				false, false, false, false, true, false, false, false, false, false, false, false, false, true, false,
				false, false, false };
		int k11_itemcount = 0;
		int k11_taxfreetotal =0;
		int k11_taxtotal=0;
		double k11_tax = 0;
		double k11_sum = 0;
		System.out.printf("emart");
		System.out.printf("�̸�Ʈ ������ (031)888-1234\n");
		System.out.printf("\t206-86-50913 ����\n");
		System.out.printf("\t���� ������ ������� 552\n");
		System.out.printf("������ �������� ��ȯ/ȯ�� �Ұ�\n");
		System.out.printf("�����ǰ�� ����, 30�� �̳�(�ż� 7��)\n");
		System.out.printf("���Ϻ� �귣����� ����(���� ����������)\n");
		System.out.printf("��ȯ/ȯ�� ���������� ����(����ī�� ����)\n");
		System.out.printf("\n");
		System.out.printf("[�� ��]%s   POS:0011-9861\n", k11_date);
		System.out.printf("---------------------------------------\n");
		System.out.printf("��ǰ��                     �ܰ�      ����      �ݾ�\n");
		System.out.printf("---------------------------------------\n");
		for (int i = 0; i < k11_itemname.length; i++) {
			if(k11_taxfree[i]==true) {
				k11_itemname[i]= "*"+k11_itemname[i];	
			} else {
				k11_itemname[i]=" "+k11_itemname[i];			
			}		
		}
		
		for (int i = 0; i < k11_itemname.length; i++) {
				for (int j = 0; j < k11_itemname[i].length(); j++) {
					if (j >= 14) {
					} else if (j < 14) {
						for (int z = 0; z < 28 - k11_itemname[i].getBytes().length; z++) {
							k11_itemname[i] = k11_itemname[i] + " ";
						}
					}
				}
			
		
			System.out.printf("%5.15s %20s %6d %14s\n", k11_itemname[i].substring(0, 5), sb.format(k11_price[i]),
					k11_num[i], sb.format(k11_price[i]));

			if(i==4) {
				System.out.printf("---------------------------------------\n");
				}else if(i==9) {
					System.out.printf("---------------------------------------\n");
				}else if(i==14) {
					System.out.printf("---------------------------------------\n");
				}else if(i==19) {
					System.out.printf("---------------------------------------\n");
				}else if(i==24) {
					System.out.printf("---------------------------------------\n");
				}else if(i==29) {
					System.out.printf("---------------------------------------\n");
				}
			}
		
		for (int i = 0; i < k11_num.length; i++) {
			k11_itemcount++;
		}
		System.out.printf("\t\t    �� ǰ�� ���� %23d\n", k11_itemcount);
		
		for (int i = 0; i < k11_itemname.length; i++) {
			if(k11_taxfree[i]==true) {
				k11_taxfreetotal = k11_taxfreetotal + k11_price[i] * k11_num[i];
			}else {
				k11_taxtotal = k11_taxtotal + k11_price[i] * k11_num[i];
				k11_tax = k11_taxtotal*0.1;
				}	
			k11_sum = k11_tax +k11_taxtotal+k11_taxfreetotal;
		}
		System.out.printf("\t\t(*) �鼼 ��ǰ %25s\n", sb.format(k11_taxfreetotal));
		System.out.printf("\t\t    ���� ��ǰ %25s\n", sb.format(k11_taxtotal));
		System.out.printf("\t\t    �ΰ��� %29s\n", sb.format(k11_tax));
		System.out.printf("\t\t    �հ� %31s\n", sb.format(k11_sum));
		System.out.printf("�������ݾ� %40s\n", sb.format(k11_sum));
		System.out.printf("---------------------------------------\n");
		System.out.printf("0012KEB�ϳ�            541707**0484/35860658\n");
		System.out.printf("ī�����(IC)                          �Ͻú�/%s\n", sb.format(k11_sum));
		System.out.printf("---------------------------------------\n");
		System.out.printf("                   [�ż�������Ʈ ����]\n");
		System.out.printf("��*�� ������ ����Ʈ ��Ȳ�Դϴ�.\n");
		System.out.printf("��ȸ�߻�����Ʈ             9350**9995         164\n");
		System.out.printf("����(����)����Ʈ                5,637(        5,473)\n");
		System.out.printf("*�ż�������Ʈ ��ȿ�Ⱓ�� 2���Դϴ�.\n");
		System.out.printf("---------------------------------------\n");
		System.out.printf("        ���űݾױ��� ���������ð� �ڵ��ο�\n");
		System.out.printf("������ȣ:                                     34��****\n");
		System.out.printf("�����ð�: %20s\n", k11_Cartime);
		System.out.printf("---------------------------------------\n");
		System.out.printf("ĳ��:084599 ��oo                                1150\n");
		System.out.printf("   llIllllIllllIllllIllllIlllIllllIllIllllIllIllllIllIllllIllIllllIllIllllIllIllllIllIllllIllIllllIllIllllIllIllllIllIlllllllIlll     \n");
		System.out.printf("       20210303/00119861/00164980/31\n");
	}
}
