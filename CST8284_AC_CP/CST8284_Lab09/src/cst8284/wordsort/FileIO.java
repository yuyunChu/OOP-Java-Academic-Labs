package cst8284.wordsort;
/* Course Name: CST8284_310
*  Student Name: Chu,Yu-Yun
*  Student Number: 040961236
*  Class name: FileIO
*  Date: Apr. 4th, 2020
*/
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

public class FileIO {

	private static int numberOfStringsLoaded = 0;

	public static ArrayList<String> loadArrayListFromFile(File f) {
		ArrayList<String> ar = new ArrayList<>();

		if (fileExists(f)) {

			Scanner input;
			try {
				input = new Scanner(new FileInputStream(f), "UTF-8");
			} catch (FileNotFoundException e) {

				return ar;
			}
			while (input.hasNext()) {
				ar.add(input.nextLine());
			}

			numberOfStringsLoaded = ar.size();

			input.close();
		}

		return ar;
	}

	public static boolean fileExists(File f) {

		return (f != null && f.exists() && f.canWrite() && f.isFile());

	}

	public static String toStringFromArrayList(ArrayList<String> arStr) {
		String string = "\n";
		for (String stList : arStr) {
			string += "   " + stList + "\n";
		}

		return string;

	}

//	https://mkyong.com/java8/java-8-how-to-format-localdatetime/
	public static String toStringFileIO(File f) {

		LocalDateTime dateTime = LocalDateTime.ofInstant(Instant.ofEpochMilli(f.lastModified()),
				ZoneId.systemDefault());

		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

		String modifiedText = dateTime.format(formatter);

		return fileExists(f)
				? "File name: " + f.getName() + "\n" + "File size: " + f.length() + " bytes\nLast modified: "
						+ modifiedText + "\nNumber of strings: " + numberOfStringsLoaded
				: "";

	}

}
