package new2;

public class Outputamuseclass2 {

	Inputamuseclass2 inputclass = new Inputamuseclass2();

	public String printdiscountselect(int discountselect1) {
		String discountselect = "";
		if (discountselect1 == 1) {
			discountselect = "우대 없음";
		} else if (discountselect1 == 2) {
			discountselect = "장애인 우대";
		} else if (discountselect1 == 3) {
			discountselect = "국가유공자 우대";
		} else if (discountselect1 == 4) {
			discountselect = "다자녀 우대";
		} else if (discountselect1 == 5) {
			discountselect = "임산부 우대";
		}
		return discountselect;
	}

	public void printtotal(int total) {

	}
}
