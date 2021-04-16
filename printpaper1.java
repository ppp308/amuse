package new2;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

//5강.리포팅 연습 2021.04.16 박재희
//영수증 출력3
public class printpaper1 {

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
		String[] k11_itemname = { "해피홈 SAFE365 핸드폰클리너", "(G)LH원형유리화병 10", "상투과자E", "더블링 나일론 깡 롤", "해피홈 SAFE핸드워시",
				"농심 신라면120g*5", "(대)국내산삼겹살찌개", "오뚜기 진비빔면 156g", "GAP 죽장사과 4-6입/", "순 유기농 바나나(봉)", "피코크 탄두리 닭가슴",
				"(달콤)순살닭강정(g)", "DZ주니어양말3족_BK", "DZ주니어양말3족_WK", "프리미엄생연어초밥", "피코크들깨미역국500", "남양 맛있는우유GT저지방",
				"녹차원흑당시럽10입", "진라면소컵(매)65g*6", "케라시스 앰플 트리트", "푸르밀 미숫가루우유", "자일로스갈색설탕500g", "CJ 비비고칩 20G",
				"피코크 들깨미역국500g", "흑원당 말차 밀크티", "1+등급란10개입 특", "동원양반볶음김치기획", "바나나", "초코파이", "포도" };
		int[] k11_price = { 7500, 6900, 5980, 3300, 5500, 3380, 6610, 2750, 10800, 4980, 2480, 7920, 4980, 4980, 7130,
				3980, 4480, 4980, 3210, 6950, 2980, 1990, 1980, 3980, 4480, 3480, 7980, 1000, 2500, 3300 };
		int[] k11_num = { 2, 1, 1, 1, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 1, 1, 1, 1, 2, 1, 2, 4, 1 };
		boolean[] k11_taxfree = { false, false, false, false, false, false, true, false, true, true, false, false,
				false, false, false, false, true, false, false, false, false, false, false, false, false, false, false,
				false, false, false };
		int k11_itemcount = 0;
		int k11_taxfreetotal = 0;
		int k11_taxtotal = 0;
		double k11_tax = k11_taxtotal * 0.1;
		double k11_sum = k11_tax + k11_taxtotal + k11_taxfreetotal;
		System.out.printf("emart");
		System.out.printf("이마트 죽전점 (031)888-1234\n 206-86-50913 강희석\n 용인 수지구 포은대로 552");
		System.out.printf("영수증 미지참시 교환/환불 불가\n");
		System.out.printf("정상상품에 한함, 30일 이내(신선 7일)\n");
		System.out.printf("※일부 브랜드매장 제외(매장 고지물참조)\n");
		System.out.printf("교환/환불 구매점에서 가능(결제카드 지참)\n");
		System.out.printf("[구 매]%s POS:0011-9861\n", k11_date);
		System.out.printf("-----------------------------------\n");
		System.out.printf("상품명 단가 수량 금액\n");
		System.out.printf("-----------------------------------\n");
		for (int i = 0; i < k11_itemname.length; i++) {
			System.out.printf("%s %s %d %s\n", k11_itemname[i], sb.format(k11_price[i]), k11_num[i],
					sb.format(k11_price[i]));
			if (i % 5 == 0) {
				System.out.printf("------------------------------------------\n");
			}

		}
		for (int i = 0; i < k11_num.length; i++) {
			k11_itemcount++;
		}
		System.out.printf("총 품목 수량 %d\n", k11_itemcount);

		for (int i = 0; i < k11_taxfree.length; i++) {
			if (k11_taxfree[i] == true) {
				k11_taxfreetotal = k11_taxfreetotal + k11_price[i] * k11_num[i];
			} else {
				k11_taxtotal = k11_taxtotal + k11_price[i] * k11_num[i];
			}
		}
		System.out.printf("면세 물품 %d\n", k11_taxfreetotal);
		System.out.printf("과세 물품 %s\n", sb.format(k11_taxtotal));
		System.out.printf("부가세 %s\n", sb.format(k11_tax));
		System.out.printf("합계 %s\n", sb.format(k11_sum));
		System.out.printf("결제대상금액 %s\n", sb.format(k11_sum));
		System.out.printf("------------------------------------------\n");
		System.out.printf("0012KEB하나 541707**0484/35860658\n");
		System.out.printf("카드결제(IC) 일시불/%s\n", sb.format(k11_sum));
		System.out.printf("------------------------------------------\n");
		System.out.printf("[신세계포인트 적립]\n");
		System.out.printf("박*희 고객님의 포인트 현황입니다.\n");
		System.out.printf("금회발생포인트  9350**9995  164\n");
		System.out.printf("누계(가용)포인트 5,637(    5,473)\n");
		System.out.printf("신세계포인트 유효기간은 2년입니다.\n");
		System.out.printf("------------------------------------------\n");
		System.out.printf("구매금액기준 무료주차시간 자동부여\n");
		System.out.printf("차량번호: 34저****\n");
		System.out.printf("입차시간: %s\n", k11_Cartime);
		System.out.printf("------------------------------------------\n");
		System.out.printf("캐셔:084599 양oo 1150\n");
		System.out.printf("llIllllIllllIllllIllllIlllIllllIllllIlll\n");
		System.out.printf("20210303/00119861/00164980/31\n");
	}
}
