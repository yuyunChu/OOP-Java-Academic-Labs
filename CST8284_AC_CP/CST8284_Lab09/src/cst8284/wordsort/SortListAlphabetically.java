package cst8284.wordsort;
/* Course Name: CST8284_310
*  Student Name: Chu,Yu-Yun
*  Student Number: 040961236
*  Class name: SortListAlphabetically
*  Date: Apr. 4th, 2020
*/
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SortListAlphabetically implements ActionListener {

	public void actionPerformed(ActionEvent e) {
		
		ArrayList<String> list = WordSorter.getListOfStrings();
		
		Collections.sort(list,new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				return o1.compareTo(o2);
			}
			
		});
		
		WordSorter.reloadJTextArea();
		
	}	

}
