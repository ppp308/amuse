package new2;

public class Outputamuseclass2 {

	Inputamuseclass2 inputclass = new Inputamuseclass2();

	public String printdiscountselect(int discountselect1) {
		String discountselect = "";
		if (discountselect1 == 1) {
			discountselect = "��� ����";
		} else if (discountselect1 == 2) {
			discountselect = "����� ���";
		} else if (discountselect1 == 3) {
			discountselect = "���������� ���";
		} else if (discountselect1 == 4) {
			discountselect = "���ڳ� ���";
		} else if (discountselect1 == 5) {
			discountselect = "�ӻ�� ���";
		}
		return discountselect;
	}

	public void printtotal(int total) {

	}
}
