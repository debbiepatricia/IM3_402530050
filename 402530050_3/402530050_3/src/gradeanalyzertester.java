
/*
 * [A]94
 * [TA's Advise]
 * 1. javadoc產生後就不需要額外再移動它們了喔!
 * 2. 
 * */

/**
 * gradeanalyzer test
 * @author: 胡珂雲 , 402530050
 */
import javax.swing.JOptionPane;

public class gradeanalyzertester {

	public static void main(String[] args) {

		// user's input number
		String userinput = "";
		gradeanalyzer ga = new gradeanalyzer();
		// processing grades
		// while the input is not q/Q
		while (true) {
			userinput = JOptionPane.showInputDialog(null, "input your number of grades : ");
			if (userinput.equalsIgnoreCase("q")) {
				break;
			}
			// parse the grade from the input
			try {
				ga.addGrade(Double.parseDouble(userinput));

			} catch (Exception e) {
				System.out.println("Please insert valid number");
			}
		}
		// final output
		if (ga.ui < 2) {

			// user input 如果小於2, 應該就不要進入分析了吧? -2
			ga.analyzeGrades();
			System.out.println("You did not enter enough grades to analyze. Please enter at least 2 valid grades");

		} else {
			ga.analyzeGrades();
			System.out.println("You entered " + ga.ui + " valid grades from 0 to 110. Invalid grades are ignored!\n");
			System.out.println("The average = " + ga.Avg + "With a Standard Deviation= " + ga.SD);
			System.out.println(ga);

		}

	}
}
