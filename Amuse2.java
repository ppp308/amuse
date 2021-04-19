package Amusementpark;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Amuse2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
		Date date = new Date();
		int num = 0;
		int isexit = 0;
		String time1 = sdf.format(date);
		int price = 0;
		int totalprice = 0;
		do {
			while (true) {
				Inputamuseclass2 inputclass = new Inputamuseclass2();
				Outputamuseclass2 outputclass = new Outputamuseclass2();
				Runamuseclass2 runclass = new Runamuseclass2();

				int choose = inputclass.daynightticket();
				String customeridnumber = inputclass.customeridselect();
				String age = runclass.calage(customeridnumber);
				int discountselect = inputclass.discountselect1();
				int ordercount = inputclass.ordercount();
				if (choose == 1) {
					price = runclass.calday(discountselect, ordercount,age);
				} else if (choose == 2) {
					price = runclass.calnight(discountselect, ordercount,age);
				}
				totalprice = totalprice + price;

				String chooseresult = outputclass.printchoose(choose);
				String discountresult = outputclass.printdiscount(discountselect);
				outputclass.printarray(chooseresult, age, ordercount, price, discountresult);
				outputclass.printcsv(time1, chooseresult, age, ordercount, price, discountresult);
				num = inputclass.askcloseticket();
				if (num == 2) {
					outputclass.printtwo();
					outputclass.printtotal(totalprice);
					isexit = inputclass.continueecheck();
					break;
				}
			}
		} while (isexit == 1);
	}
}