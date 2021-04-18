package new2;

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
		do {
			while (true) {
				Inputamuseclass2 inputclass = new Inputamuseclass2();
				Outputamuseclass2 outputclass = new Outputamuseclass2();
				Runamuseclass2 runclass = new Runamuseclass2();
				int choose = inputclass.daynightticket();

				String customeridnumber = inputclass.customeridselect();
				int discountselect = inputclass.discountselect1();
				int ordercount = inputclass.ordercount();
				if (choose == 1) {
					price = runclass.calday(discountselect, ordercount);
				} else if (choose == 2) {
					price = runclass.calnight(discountselect, ordercount);
				}
				num = inputclass.askcloseticket();
				outputclass.printarray(choose, customeridnumber, ordercount, price, discountselect);
				outputclass.printcsv(time1, choose, customeridnumber, ordercount, price, discountselect);
				if (num == 2) {
					outputclass.printtwo();			
					isexit = inputclass.continueecheck();
					break;
				}
			}
		} while (isexit == 1);
	}
}
