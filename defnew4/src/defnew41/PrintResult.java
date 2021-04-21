package defnew41;

import java.util.ArrayList;

public class PrintResult {
	String[] date;
	int[] dayNight, ageGroup, ticket, price, pref;
	int[] dayTicket, nightTicket, dayAgeT, nightAgeT, prefT;
	int totalTicket;
	ArrayList<Integer> price_arr;
	ArrayList<String> date_arr;

	public PrintResult(String[] retDate, int[] retDayNight, int[] retAgeGroup, int[] retTicket, int[] retPrice,
			int[] retPref, int[] dayTicket, int[] nightTicket, int[] dayAgeT, int[] nightAgeT,
			ArrayList<String> date_arr, ArrayList<Integer> price_arr, int[] prefT, int totalTicket) {
		this.date = retDate;
		this.dayNight = retDayNight;
		this.ageGroup = retAgeGroup;
		this.ticket = retTicket;
		this.price = retPrice;
		this.pref = retPref;
		this.dayTicket = dayTicket;
		this.nightTicket = nightTicket;
		this.dayAgeT = dayAgeT;
		this.nightAgeT = nightAgeT;
		this.price_arr = price_arr;
		this.date_arr = date_arr;
		this.prefT = prefT;
		this.totalTicket = totalTicket;
	}

	public void printAll() {
		System.out.println("======================== report.csv =========================");
		System.out.printf("%6s%7s%5s%5s%10s%11s\n", "?���?", "권종", "?��?��??", "?��?��", "�?�?", "?��???��?��");

		for (int i = 0; i < date.length; i++) {
			System.out.printf("  %8.12s%4.5s%8.8s%8.6s%15.10s%10s\n", date[i], (dayNight[i] + ""), (ageGroup[i] + ""),
					(ticket[i] + ""), (price[i] + ""), (pref[i] + ""));
		}
		System.out.println("------------------------------------------------------------");
	}

	public void ticketSaleStatus() {
		System.out.println("\n\n================== 권종�? ?���? ?��?�� ====================");
		System.out.printf("주간�? �?  %d �?\n", dayTicket[0]);
		System.out.printf("?��?�� %d�?, ?��?�� %d�?, �??��?�� %d�?, ???�� %d�?, 경로 %d�?\n", dayAgeT[0], dayAgeT[1], dayAgeT[2], dayAgeT[3],
				dayAgeT[4]);
		System.out.printf("주간�? �? 매출 : %d?��\n", dayTicket[1]);

		System.out.printf("\n?��간권 �?  %d �?\n", nightTicket[0]);
		System.out.printf("?��?�� %d�?, ?��?�� %d�?, �??��?�� %d�?, ???�� %d�?, 경로 %d�?\n", nightAgeT[0], nightAgeT[1], nightAgeT[2],
				nightAgeT[3], nightAgeT[4]);
		System.out.printf("?��간권 �? 매출 : %d?��\n", nightTicket[1]);
		System.out.println("--------------------------------------------------------");

	}

	public void SalesSatatusPerDay() {
		System.out.println("\n\n============ ?��?���? ?���? ?��?�� ==============");
		for (int i = 0; i < date_arr.size(); i++) {
			String newDate = DateFormat(date_arr.get(i));
			System.out.printf("%s : �? 매출 %13.12s ?��\n", newDate, (price_arr.get(i) + ""));
		}
		System.out.println("--------------------------------------------");

	}

	private String DateFormat(String date) {
		String year = date.substring(0, 4);
		String month = date.substring(4, 6);
		String day = date.substring(6);

		String returnValue = year + "?�� " + month + "?�� " + day + "?��";

		return returnValue;
	}

	public void PreferenceStatus() {
		System.out.println("\n\n========== ?��??�? ?���? ?��?�� ============");
		System.out.printf("�? ?���? ?���? ?��     : %15.10s�?\n", (totalTicket + ""));

		for (int i = 0; i < prefT.length; i++) {
			System.out.printf("%s: %15.10s�?\n", strForm(ConstValue.preName[i], 10), (prefT[i] + ""));
		}

		System.out.println("----------------------------------------");
	}

	public String strForm(String str, int leng) {
		String temp = str + "                ";

		temp = temp.substring(0, leng);

		int blank = leng - str.length();

		for (int i = 0; i < blank; i++) {
			temp += " ";
		}

		return temp;
	}

}