package new2;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

//5��.������ ���� 2021.04.16 ������
//������ ���3
public class printpaper1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SimpleDateFormat sc = new SimpleDateFormat("yyyy-MM-dd HH:mm");
		DecimalFormat sb = new DecimalFormat("###,###,###");
		Date time = new Date();
		String k11_date = sc.format(time);
		String [] k11_itemname= {"����Ȩ SAFE365 �ڵ���Ŭ����","(G)LH��������ȭ�� 10","��������E","���� ���Ϸ� �� ��","����Ȩ SAFE�ڵ����",
				"��� �Ŷ��120g*5","(��)����������","���ѱ� ������� 156g","GAP ������ 4-6��/","�� ����� �ٳ���(��)",
				"����ũ ź�θ� �߰���","(����)����߰���(g)","DZ�ִϾ�縻3��_BK","DZ�ִϾ�縻3��_WK","�����̾��������ʹ�",
				"����ũ����̿���500","���� ���ִ¿���GT������","���������÷�10��","��������(��)65g*6","�ɶ�ý� ���� Ʈ��Ʈ",
				"Ǫ���� �̼��������","���Ϸν���������500g","CJ ����Ĩ 20G","����ũ ����̿���500g","����� ���� ��ũƼ",
				"1+��޶�10���� Ư","������ݺ�����ġ��ȹ","�ٳ���","��������","����"};
		int [] k11_price = {7500,6900,5980,3300,5500,
						3380,6610,2750,10800,4980,
						2480,7920,4980,4980,7130,
						3980,4480,4980,3210,6950,
						2980,1990,1980,3980,4480,
						3480,7980,1000,2500,3300};
		int [] k11_num = {2,1,1,1,2,
					1,1,1,1,1,
					1,1,1,1,1,
					1,1,1,1,1,
					2,1,1,1,1,
					2,1,2,4,1};
		boolean [] k11_taxfree = {false,false,false,false,false,
				false,true,false,true,true,
				false,false,false,false,false,
				false,true,false,false,false,
				false,false,false,false,false,
				false,false,false,false,false};
		int k11_sum =0;
		System.out.printf("emart");	System.out.printf("�̸�Ʈ ������ (031)888-1234\n 206-86-50913 ����\n ���� ������ ������� 552");
		System.out.printf("������ �������� ��ȯ/ȯ�� �Ұ�\n");	
		System.out.printf("�����ǰ�� ����, 30�� �̳�(�ż� 7��)\n");	
		System.out.printf("���Ϻ� �귣����� ����(���� ����������)\n");	
		System.out.printf("��ȯ/ȯ�� ���������� ����(����ī�� ����)\n");	
		System.out.printf("[�� ��]%s POS:0011-9861\n",k11_date);	
		System.out.printf("-----------------------------------\n");	
		System.out.printf("��ǰ�� �ܰ� ���� �ݾ�\n");	
		System.out.printf("-----------------------------------\n");	
		for(int i =0;i<k11_itemname.length;i++) {
			System.out.printf("%s %s %d %s\n",k11_itemname[i],sb.format(k11_price[i]),k11_num[i],sb.format(k11_price[i]));	
			if(i%5==0) {
				
				System.out.printf("------------------------------------------\n");
			}
		}
		for(int i =0;i<k11_num.length;i++) {
			k11_sum = k11_sum +k11_num[i];
		}
		System.out.printf("�� ǰ�� ���� %d",k11_sum);
		for(int i =0;i<k11_price.length;i++) {
			
		}
	}
}

