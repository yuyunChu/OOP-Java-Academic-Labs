package cst8284.wordsort;
/* Course Name: CST8284_310
*  Student Name: Chu,Yu-Yun
*  Student Number: 040961236
*  Class name: RandomizeList
*  Date: Apr. 4th, 2020
*/
import java.util.ArrayList;
import java.util.Collections;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RandomizeList implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		ArrayList<String> list = WordSorter.getListOfStrings();

		Collections.shuffle(list);
		
		WordSorter.reloadJTextArea();
		
	}

}
