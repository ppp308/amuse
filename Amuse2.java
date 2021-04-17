package new2;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.ArrayList;

public class Amuse2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		ArrayList<String> al = new ArrayList<String>();	
		ArrayList<String> als = new ArrayList<String>();	
		SimpleDateFormat format = new SimpleDateFormat("yyyyMMdd");	
		Date time = new Date();
	
		BufferedWriter writer = new BufferedWriter(
				new OutputStreamWriter(new FileOutputStream("C:\\Users\\박재현\\Desktop\\file.txt", true), "MS949"));
		
		int total = 0;
		int num = 0;
		int totalprice = 0;
		int isexit = 0;
		int count =0;
		do {
			while (true) {
				Inputamuseclass2 inputclass = new Inputamuseclass2();
				Outputamuseclass2 outputclass = new Outputamuseclass2();
				String choose = inputclass.daynightticket();
				Runamuseclass2 runclass = new Runamuseclass2();

				String customeridnumber = inputclass.customeridselect();
				int ordercount = inputclass.ordercount();
				int discountselect1 = inputclass.discountselect1();
				String age1 = runclass.dividage(customeridnumber);
				String daynight = runclass.dividdaynight(choose);
				String time1 = format.format(time);
				if (discountselect1 == Valueclass2.nothing) {
					total = runclass.calculpricenothing(daynight, age1, ordercount);
				} else if (discountselect1 == Valueclass2.disabled) {
					total = runclass.calculpricedisabled(daynight, age1, ordercount);
				} else if (discountselect1 == Valueclass2.national) {
					total = runclass.calculpricenational(daynight, age1, ordercount);
				} else if (discountselect1 == Valueclass2.multi_child) {
					total = runclass.calculpricemulti_child(daynight, age1, ordercount);
				} else if (discountselect1 == Valueclass2.pregnant) {
					total = runclass.calculpricepregnant(daynight, age1, ordercount);
				}

				String discountselect = outputclass.printdiscountselect(discountselect1);

				totalprice = totalprice + total;
				System.out.println("가격은 " + total + "원 입니다.");
				System.out.println("감사합니다.");
				num = inputclass.askcloseticket();
				String customer = daynight + " " + age1 + "*" + ordercount + " " + total + "원" + " * " + discountselect;
				al.add(customer);
				String customer1 = time1 + "," + daynight + "," + age1 + "," + ordercount + "," + total + ","
						+ discountselect;
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