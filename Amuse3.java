package new2;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.ArrayList;

public class Amuse3 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		ArrayList<String> al = new ArrayList<String>();
		ArrayList<String> als = new ArrayList<String>();
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
		BufferedWriter writer = new BufferedWriter(
				new OutputStreamWriter(new FileOutputStream("C:\\Users\\박재현\\Desktop\\file.txt", true), "MS949"));
		Date date = new Date();	
		int num = 0;
		int isexit = 0;
		int count = 0;
		String today = sdf.format(date);
		String time1 =sdf.format(date);
	
		
		do {
			while (true) {
				Inputamuseclass2 inputclass = new Inputamuseclass2();
				Runamuseclass2 runclass = new Runamuseclass2();
				int choose = inputclass.daynightticket();	
				
				String customeridnumber = inputclass.customeridselect();		
				int discountselect = inputclass.discountselect1();
				int ordercount = inputclass.ordercount();
				
				runclass.calage(customeridnumber);
				
			if(choose==1) {
				runclass.calday(discountselect, ordercount);
				
			} else if (choose ==2) {
				runclass.calnight(discountselect, ordercount);
			}
				
				num = inputclass.askcloseticket();
				String customer = output + " " + ageresult + "*" + ordercount + " " + price + "원" + " * "
						+ discountresult;
				al.add(customer);
				String customer1 = time1 + "," + chooseresult + "," + ageresult + "," + ordercount + "," + price + ","
						+ discountresult;
				als.add(customer1);
				if (num == 2) {
					System.out.println("티켓 발권을 종료합니다. 감사합니다.");
					System.out.println("================제리랜드 ============");
					for (String customers : al) {
						System.out.println(customers);
					}
					writer.write("날짜,권종,연령구분,수량,가격,우대사항\n");
					writer.flush();
					for (String customer1s : als) {
						writer.write(customer1s + "\r\n");
						writer.flush();
					}
					System.out.println("입장료 총액은 " + totalprice + "원 입니다.");
					System.out.println("===================================");
					isexit = inputclass.continueecheck();
					break;
				}
		
				}		
			} while (isexit == 1);
		}
}
