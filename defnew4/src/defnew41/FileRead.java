package defnew41;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class FileRead {
	ArrayList<String[]> raw = fileReader();

	public void sql () throws ClassNotFoundException, SQLException{
		// TODO Auto-generated method stub
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/testdb","root","koposw11");			
		Statement stmt = conn.createStatement();
		ResultSet rset = stmt.executeQuery("SELECT * FROM `ticket`");
		System.out.printf("³¯Â¥   ±ÇÁ¾  ¿¬·É±¸ºÐ¼ö·® °¡°Ý¿ì´ë»çÇ×\n");
		while(rset.next()) {
			System.out.println(rset.getString(1)+rset.getString(2)+rset.getString(3)+rset.getInt(4)+rset.getInt(5)+rset.getString(6));
		}
		rset.close();
		stmt.close();
		conn.close();
	}
	
	public ArrayList<String[]> fileReader() {
		ArrayList<String[]> raw = new ArrayList<String[]>();
		try {
			BufferedReader br = new BufferedReader(
					new InputStreamReader(new FileInputStream(ConstValue.filePath), "MS949"));

			String line;

			while ((line = br.readLine()) != null) {
				raw.add(line.split(","));
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		return raw;

	}

	public String[] readDate() { // ?‚ ì§?
		String[] date = new String[raw.size() - 1];

		for (int index = 0; index < raw.size() - 1; index++) {
			String[] raw_split = raw.get(index + 1);// ì²«ì¤„ ? œ?™¸ ?½ê¸?
			date[index] = raw_split[0];

		}

		return date;
	}

	public int[] readDayNight() { // ì£¼ì•¼ê¶? ?„˜ë²?
		int[] dayNight = new int[raw.size() - 1];

		for (int index = 0; index < raw.size() - 1; index++) {
			String raw_day = raw.get(index + 1)[1];// ì²«ì¤„ ? œ?™¸ ?½ê¸?

			if (raw_day.equals(ConstValue.dayNight[0])) {
				dayNight[index] = ConstValue.day;

			} else if (raw_day.equals(ConstValue.dayNight[1])) {
				dayNight[index] = ConstValue.night;

			}
		}
		return dayNight;

	}

	public int[] readAgeGroup() { // ?‚˜?´ ê·¸ë£¹ ?„˜ë²?
		int[] ageGroup = new int[raw.size() - 1];

		for (int index = 0; index < raw.size() - 1; index++) {
			String raw_age = raw.get(index + 1)[2];// ì²«ì¤„ ? œ?™¸ ?½ê¸?

			if (raw_age.equals(ConstValue.ageName[0])) {
				ageGroup[index] = ConstValue.baby;

			} else if (raw_age.equals(ConstValue.ageName[1])) {
				ageGroup[index] = ConstValue.child;

			} else if (raw_age.equals(ConstValue.ageName[2])) {
				ageGroup[index] = ConstValue.teen;

			} else if (raw_age.equals(ConstValue.ageName[3])) {
				ageGroup[index] = ConstValue.adult;

			} else if (raw_age.equals(ConstValue.ageName[3])) {
				ageGroup[index] = ConstValue.old;

			}
		}
		return ageGroup;

	}

	public int[] readTicket() { // ?‹°ì¼? ?ž¥ ?ˆ˜
		int[] ticket = new int[raw.size() - 1];

		for (int index = 0; index < raw.size() - 1; index++) {
			String raw_ticket = raw.get(index + 1)[3];// ì²«ì¤„ ? œ?™¸ ?½ê¸?
			ticket[index] = Integer.parseInt(raw_ticket);

		}

		return ticket;

	}

	public int[] readPrice() { // ê°?ê²?
		int[] price = new int[raw.size() - 1];

		for (int index = 0; index < raw.size() - 1; index++) {
			String raw_price = raw.get(index + 1)[4];// ì²«ì¤„ ? œ?™¸ ?½ê¸?
			price[index] = Integer.parseInt(raw_price);

		}

		return price;

	}

	public int[] readPreference() { // ?š°??
		int[] preference = new int[raw.size() - 1];

		for (int index = 0; index < raw.size() - 1; index++) {
			String raw_age = raw.get(index + 1)[5];// ì²«ì¤„ ? œ?™¸ ?½ê¸?

			if (raw_age.equals(ConstValue.preName[0])) {
				preference[index] = ConstValue.none;

			} else if (raw_age.equals(ConstValue.preName[1])) {
				preference[index] = ConstValue.disabled;

			} else if (raw_age.equals(ConstValue.preName[2])) {
				preference[index] = ConstValue.national;

			} else if (raw_age.equals(ConstValue.preName[3])) {
				preference[index] = ConstValue.multiChild;

			} else if (raw_age.equals(ConstValue.preName[3])) {
				preference[index] = ConstValue.pregnant;

			}

		}

		return preference;

	}

}