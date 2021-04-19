package new2;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

//5강.리포팅 연습 2021.04.16 박재희
//영수증 출력5
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
		String[] k11_itemname = { "비비고토종김들기름", "간편한자른미역", "씻은당근", "더블링나일론깡롤", "냉동훈제연어",
				"육개장라면120g*5", "국내산삼겹살찌개", "오뚜기진비빔면156g", "볶은버섯세트", "딸기", "블루베리",
				"순살닭강정(g)", "무지양말3족", "패턴양말5족", "프리미엄생연어초밥", "그릭요거트 남양500", "서울우유",
				"식용유", "진라면소컵(매)65g*6", "케라시스앰플트리트", "푸르밀미숫가루우유", "자일로스갈색설탕500g", "오렌지",
				"손질냉동오징어", "루카나인10개입", "계란 12개입 ", "시금치", "바나나", "초코파이", "포도" };
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
		System.out.printf("이마트 죽전점 (031)888-1234\n");
		System.out.printf("\t206-86-50913 강희석\n");
		System.out.printf("\t용인 수지구 포은대로 552\n");
		System.out.printf("영수증 미지참시 교환/환불 불가\n");
		System.out.printf("정상상품에 한함, 30일 이내(신선 7일)\n");
		System.out.printf("※일부 브랜드매장 제외(매장 고지물참조)\n");
		System.out.printf("교환/환불 구매점에서 가능(결제카드 지참)\n");
		System.out.printf("\n");
		System.out.printf("[구 매]%s   POS:0011-9861\n", k11_date);
		System.out.printf("---------------------------------------\n");
		System.out.printf("상품명                     단가      수량      금액\n");
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
		System.out.printf("\t\t    총 품목 수량 %23d\n", k11_itemcount);
		
		for (int i = 0; i < k11_itemname.length; i++) {
			if(k11_taxfree[i]==true) {
				k11_taxfreetotal = k11_taxfreetotal + k11_price[i] * k11_num[i];
			}else {
				k11_taxtotal = k11_taxtotal + k11_price[i] * k11_num[i];
				k11_tax = k11_taxtotal*0.1;
				}	
			k11_sum = k11_tax +k11_taxtotal+k11_taxfreetotal;
		}
		System.out.printf("\t\t(*) 면세 물품 %25s\n", sb.format(k11_taxfreetotal));
		System.out.printf("\t\t    과세 물품 %25s\n", sb.format(k11_taxtotal));
		System.out.printf("\t\t    부가세 %29s\n", sb.format(k11_tax));
		System.out.printf("\t\t    합계 %31s\n", sb.format(k11_sum));
		System.out.printf("결제대상금액 %40s\n", sb.format(k11_sum));
		System.out.printf("---------------------------------------\n");
		System.out.printf("0012KEB하나            541707**0484/35860658\n");
		System.out.printf("카드결제(IC)                          일시불/%s\n", sb.format(k11_sum));
		System.out.printf("---------------------------------------\n");
		System.out.printf("                   [신세계포인트 적립]\n");
		System.out.printf("박*희 고객님의 포인트 현황입니다.\n");
		System.out.printf("금회발생포인트             9350**9995         164\n");
		System.out.printf("누계(가용)포인트                5,637(        5,473)\n");
		System.out.printf("*신세계포인트 유효기간은 2년입니다.\n");
		System.out.printf("---------------------------------------\n");
		System.out.printf("        구매금액기준 무료주차시간 자동부여\n");
		System.out.printf("차량번호:                                     34저****\n");
		System.out.printf("입차시간: %20s\n", k11_Cartime);
		System.out.printf("---------------------------------------\n");
		System.out.printf("캐셔:084599 양oo                                1150\n");
		System.out.printf("   llIllllIllllIllllIllllIlllIllllIllIllllIllIllllIllIllllIllIllllIllIllllIllIllllIllIllllIllIllllIllIllllIllIllllIllIlllllllIlll     \n");
		System.out.printf("       20210303/00119861/00164980/31\n");
	}
}
