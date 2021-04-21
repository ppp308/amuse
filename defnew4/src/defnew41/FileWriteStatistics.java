package defnew41;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;

public class FileWriteStatistics {

	public void writeKind(int[] sumDay, int[] sumNight, int[] dayAge, int[] nightAge) {
		String firstLine = "Íµ¨Î∂Ñ,Ï£ºÍ∞ÑÍ∂?,?ïºÍ∞ÑÍ∂å\n";
		try {
			BufferedWriter bw = new BufferedWriter(
					new OutputStreamWriter(new FileOutputStream(ConstValue.fileWritePath_1), "MS949"));
			bw.write(firstLine);
			for (int i = 0; i < ConstValue.ageName.length; i++) {
				String kindWrite = ConstValue.ageName[i] + "," + dayAge[i] + "," + nightAge[i] + "\n";
				bw.write(kindWrite);
			}
			bw.write("?ï©Í≥?," + sumDay[0] + "," + sumNight[0] + "\n");
			bw.write("Îß§Ï∂ú," + sumDay[1] + "," + sumNight[1] + "\n");

			bw.close();
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void writeDaily(ArrayList<String> date, ArrayList<Integer> sumPerDay) {
		String firstLine = "?ùº?ûê, Ï¥? Îß§Ï∂ú\n";

		try {
			BufferedWriter bw = new BufferedWriter(
					new OutputStreamWriter(new FileOutputStream(ConstValue.fileWritePath_2), "MS949"));
			bw.write(firstLine);
			for (int i = 0; i < date.size(); i++) {
				String dateF = DateFormat(date.get(i));
				String dailyWrite = dateF + "," + sumPerDay.get(i) + "\n";
				bw.write(dailyWrite);
			}
			bw.close();
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	private String DateFormat(String date) {
		String year = date.substring(0, 4);
		String month = date.substring(4, 6);
		String day = date.substring(6);

		String returnValue = year + "-" + month + "-" + day;

		return returnValue;
	}

	public void writePref(int totalTicket, int[] prefT) {
		String firstLine = "?ö∞?? Íµ¨Î∂Ñ, Í∞úÏàò\n";

		try {
			BufferedWriter bw = new BufferedWriter(
					new OutputStreamWriter(new FileOutputStream(ConstValue.fileWritePath_3), "MS949"));
			bw.write(firstLine);

			for (int i = 0; i < ConstValue.preName.length; i++) {
				String dailyWrite = ConstValue.preName[i] + "," + prefT[i] + "\n";
				bw.write(dailyWrite);
			}
			bw.write("?ï©Í≥?," + totalTicket + "\n");
			bw.close();
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}