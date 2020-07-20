package cst8284.genericTable;

/* Course Name: CST8284_310
*  Student Name: Chu,Yu-Yun
*  Class name: Table
*  Date: Apr. 2nd, 2020
*/
import java.util.List;

public class Table {

	public static <E extends Comparable<E>> void outputTable(List<E> aList) {
		System.out.print("\t\t");
		for (E header : aList)
			System.out.printf("%-20s", header);
		for (E row : aList) {
			System.out.print("\n" + row);
			System.out.print(row.toString().length() < 8 ? "\t\t" : "\t");
			for (E column : aList)
				System.out.printf("%-20s", compareResults(column, row));
		}
		System.out.println("\n");
	}

	public static <E extends Comparable<E>> String compareResults(E obj1, E obj2) {
		double result = Math.signum(obj1.compareTo(obj2));

		return (result == 0 ? "=" : (result > 0 ? ">" : "<"));
	}
}
