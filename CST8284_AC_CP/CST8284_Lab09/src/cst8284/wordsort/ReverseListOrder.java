package cst8284.wordsort;
/* Course Name: CST8284_310
*  Student Name: Chu,Yu-Yun
*  Student Number: 040961236
*  Class name: ReverseListOrder
*  Date: Apr. 4th, 2020
*/
import java.util.ArrayList;
import java.util.Collections;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ReverseListOrder implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		ArrayList<String> list = WordSorter.getListOfStrings();
		
		Collections.sort(list, Collections.reverseOrder());
		
		WordSorter.reloadJTextArea();
	}

}
