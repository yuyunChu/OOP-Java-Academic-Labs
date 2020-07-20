package cst8284.wordsort;
/* Course Name: CST8284_310
*  Student Name: Chu,Yu-Yun
*  Student Number: 040961236
*  Class name: SortByStringLength
*  Date: Apr. 4th, 2020
*/
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class SortByStringLength implements ActionListener {

	public void actionPerformed(ActionEvent e) {

		ArrayList<String> list = WordSorter.getListOfStrings();

		Collections.sort(list, new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				if (o1.length() == o2.length())
					return 0;
				if (o1.length() > o2.length())
					return 1;
				return -1;
			}

		});
		
		WordSorter.reloadJTextArea();

	}

}
