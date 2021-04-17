package new2;

import java.util.ArrayList;

public class Outputamuseclass3 {
	ArrayList<String> al = new ArrayList<String>();
	Inputamuseclass2 inputclass = new Inputamuseclass2();
	Runamuseclass2 run = new Runamuseclass2();
	
 public void printarray(String choose, String customeridnumber, int ordercount,int discountselect1) {
	
	int total = run.calculpricenothing(choose, run.dividage(customeridnumber), ordercount);
	 total = run.calculpricedisabled(choose, run.dividage(customeridnumber), ordercount);
	 total = run.calculpricenational(choose, run.dividage(customeridnumber), ordercount);
	 total = run.calculpricemulti_child(choose, run.dividage(customeridnumber), ordercount);
	 total = run.calculpricepregnant(choose, run.dividage(customeridnumber), ordercount);

	String customer =  run.dividdaynight(choose) + " " +run.dividage(customeridnumber) + "*" + inputclass.ordercount() + " " + total + "원" + " * " + printdiscountselect(discountselect1);
	 
	 
 }
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
	
}
