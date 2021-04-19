package new2;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
//5강.리포팅 연습 2021.04.16 박재희
//영수증 출력2
public class printrpaper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SimpleDateFormat sc = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		//원하는 형태로 출력하기 위해 불러옴
		SimpleDateFormat sf = new SimpleDateFormat("MM월dd일");
		//14일 이후의 날짜를 원하는 형태로 출력하기 위해 불러옴
		Calendar cal = Calendar.getInstance();
		//날짜 함수 불러오기
		DecimalFormat sb = new DecimalFormat("###,###,###");
		//1000자리마다 콤마찍기
		Date time = new Date();
		//오늘날짜 가져오기
		cal.setTime(time);
		//오늘날짜 불러오기
		String k11_date = sc.format(cal.getTime());
		//오늘의 날자를 원하는 형태로 출력해서 변수에 저장
		cal.add(Calendar.DATE, 14);
		//일수에 14일을 더하기 
		String k11_afterdate = sf.format(cal.getTime());
		//14일 더한 날짜를 원하는 형태로 가져와서 변수에 저장
		String k11_itemname1 = "퓨어에어 비말차단용마스크(최고급형)";
		//첫번째 품목 저장
		String k11_itemcode1 = "1031615";
		//첫번째 품목코드 저장
		int k11_price1 = 3000;
		//첫번째 가격 저장
		int k11_amount1 = 1;
		//첫번째 품목의 수량 저장
		String k11_itemname2 = "슬라이드식명찰(가로형)(100호)";
		//두번째 품목 저장
		String k11_itemcode2 = "11008152";
		//두번째 품목의 코드 저장
		int k11_price2 = 1000;
		//두번째 품목 가격
		int k11_amount2 = 1;
		//두번째 품목 수량
		String k11_itemname3 = "매직흡착 인테리어후크(알루미늄타입)";
		//세번째 품목 
		String k11_itemcode3 = "1022760";
		//세번째 품목 코드
		int k11_price3 = 1000;
		//세번째 품목 코드 가격
		int k11_amount3 = 1;
		//세번재 품목 수량 
		double k11_total = k11_price1 * k11_amount1 + k11_price2 * k11_amount2 + k11_price3 * k11_amount3;
		//가격*수량 = 총 가격 
		double k11_totaltaxprice = (k11_total / 1.1);
		//총가격에서 1.1을 곱하여 세금을 제외한 가격 구하기
		double k11_totaltax = (k11_total - k11_total / 1.1);
		//총 가격 - 세금 제외한 가격 = 세금
		System.out.printf("                    \"국민가게, 다이소\"\n");
		System.out.printf("(주)아성다이소_분당서현점\n");
		System.out.printf("전화:031-702-6016\n");
		System.out.printf("본사:서울 강남구 남부순환로 2748 (도곡동)\n");
		System.out.printf("대표:박정부,신호섭 213-81-52063\n");
		System.out.printf("매장:경기도 성남시 분당구 분당로53번길 11 (서현\n");
		System.out.printf("동)\n");
		System.out.printf("=========================================\n");
		System.out.printf("         소비자중심경영(CCM)인증기업\n");
		System.out.printf("       ISO 9001 품질경영시스템 인증기업\n");
		System.out.printf("=========================================\n");
		System.out.printf("        교환/환불 14일(%s)이내,\n", k11_afterdate);
		//14일 이후에 날짜가 자동으로 바뀌고 월,일로 출력
		System.out.printf("(전자)영수증,결제카드 지참 후 구입매장에서 가능\n");
		System.out.printf("       포장/가격 택 훼손시 교환/환불 불가\n");
		System.out.printf("         체크카드 취소 시 최대 7일 소요\n");
		System.out.printf("=========================================\n");
		System.out.printf("[POS 1058231]                %s\n", k11_date);
		//시스템 날짜 출력
		System.out.printf("=========================================\n");
		System.out.printf("%14.14s  %5s %5s %9s\n", k11_itemname1, sb.format(k11_price1), sb.format(k11_amount1),
				sb.format(k11_price1));
		//품목의 길이가 15까지 나올 수 있게 출력하고, 숫자의 띄어쓰기를 맞춤
		System.out.printf("[%s]\n", k11_itemcode1);
		//코드 출력
		System.out.printf("%12.15s  %7s %5s %9s\n", k11_itemname2, sb.format(k11_price2), sb.format(k11_amount2),
				sb.format(k11_price2));
		//품목의 길이가 15까지 나올 수 있게 출력하고, 숫자의 띄어쓰기를 맞춤
		System.out.printf("[%s]\n", k11_itemcode2);
		//코드 출력
		System.out.printf("%9.14s  %s %5s %9s\n", k11_itemname3, sb.format(k11_price3), sb.format(k11_amount3),
				sb.format(k11_price3));
		//품목의 길이가 15까지 나올 수 있게 출력하고, 숫자의 띄어쓰기를 맞춤
		System.out.printf("[%s]\n", k11_itemcode3);
		//코드 출력
		System.out.printf("                  과세합계  %30s\n", sb.format(k11_totaltaxprice));
		//과세합계에 콤마를 반영하여 출력
		System.out.printf("                     부가세  %30s\n", sb.format(k11_totaltax));
		//부가세에 콤마를 반영하여 출력
		System.out.printf("-----------------------------------------\n");
		System.out.printf("판매합계   %47s\n", sb.format(k11_total));
		//판매합계에 콤마를 반영하여 출력
		System.out.printf("=========================================\n");
		System.out.printf("신용카드   %47s\n", sb.format(k11_total));
		//신용카드에 판매합계를 콤마를 반영하여 출력
		System.out.printf("-----------------------------------------\n");
		System.out.printf("우리카드                            538720**********\n");
		System.out.printf("승인번호 77982843(0)             승인금액 %8s\n", sb.format(k11_total));
		//가격에 콤마를 반영하여 출력
		System.out.printf("=========================================\n");
		System.out.printf("         %s 분당서현점\n", k11_date);
		//시스템 날짜 출력
		System.out.printf("상품 및 기타 문의: 1522-4400\n");
		System.out.printf("멤버십 및 샵다이소 관련 문의 : 1599-2211\n");
		System.out.printf("                llIllllIllllIllllIllllIlllIllllIllllIllllIllllIllIllllIllllIllllIllIllllIllllI\n");
		//바코드는 제대로 출력하지 못함..
		System.out.printf("                2112820610158231\n");
		System.out.printf("----------------------------------------\n");
		System.out.printf(" ◈ 다이소 멤버십 앱 또는 홈페이지에 접속하셔서 \n");
		System.out.printf("    회원가입 후 다양한 혜택을 누려보세요!  ◈\n");

	}

}
