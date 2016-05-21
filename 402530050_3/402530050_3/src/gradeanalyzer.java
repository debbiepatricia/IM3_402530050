
/**
 *  java 3rd assignment
 * count average
 * standard deviation and distribute
 */
import java.util.ArrayList;

public class gradeanalyzer {

	// 或許可以用Array會更好?
	public int aplus, a, amin, bplus, b, bmin, cplus, c, cmin, d, f; // grade
																		// distribution
	double ui = 0; // user input
	boolean uii;// for type boolean
	double Avg, SD = 0;
	ArrayList<Double> list = new ArrayList<Double>();

	/**
	 * Determines whether grade is valid or not
	 * 
	 * @return: valid or invalid scores
	 */
	public boolean isValidGrade(double grade) {
		if (grade <= 110 && grade > 0) {
			ui++;
			uii = true;
		} else {
			uii = false;
		}
		return uii;
	}

	/**
	 * Increments the appropriate letter grade counter Increments the total
	 * number of grades entered and calculates the parameters necessary to
	 * calculate the average and standard deviation
	 * 
	 * @return : distribution of each score
	 */

	void addGrade(double grade) {

		/**
		 * if user's input is true distribute every valid grade to the
		 * categories
		 */
		boolean uiii = isValidGrade(grade);
		if (uiii == true) {

			if (grade >= 98) {
				aplus++;
			} else if (grade < 98 && grade >= 92) {
				a++;
			} else if (grade < 92 && grade >= 90) {
				amin++;
			} else if (grade < 90 && grade >= 88) {
				bplus++;
			} else if (grade < 88 && grade >= 82) {
				b++;
			} else if (grade < 82 && grade >= 80) {
				bmin++;
			} else if (grade < 80 && grade >= 78) {
				cplus++;
			} else if (grade < 78 && grade >= 72) {
				c++;
			} else if (grade < 72 && grade >= 70) {
				cmin++;
			} else if (grade < 70 && grade >= 60) {
				d++;
			} else if (grade < 60) {
				f++;
			}
			// list's arraylist
			list.add(grade);
		}

		/**
		 * @param value
		 *            add each element value to total count the sum and average
		 *            of all user's valid input grades sum
		 */

		double gsum = 0;

		// foreach! good! +1
		for (double value : list) {
			gsum += value;

			// 下面這行雖然不影響輸出, 但我建議移到foreach外面, 因為他只需要計算一次.
			Avg = gsum / ui;
		}
	}

	/** Calculates the average and standard deviation */
	void analyzeGrades() {

		/** count standard deviation */
		double SDt = 0;
		for (int i = 0; i < list.size(); i++) {
			// 我不認為list.size()需要-1喔! 而且你公式似乎錯了, 請看我下面的寫法, -5
			SDt += ((list.size() - Avg) * (list.size() - Avg)) / (list.size() - 1);
		}
		SD = Math.round(SDt);
		
		/*
		 * double SDt = 0; for (int i = 0; i < list.size(); i++) { SDt +=
		 * (list.get(i) - Avg) * (list.get(i) - Avg); }
		 * SD=Math.round(SDt/list.size());
		 */
	}

	/**
	 * *@param to string
	 * 
	 * @return gradesd
	 */
	public String toString() {

		String gradesd = "The grade distirbution is: \n\n A+ = " + aplus + "\n A = " + a + "\n A-= " + amin + "\n B+= "
				+ bplus + "\n B = " + b + "\n B-= " + bmin + "\n C+= " + cplus + "\n C = " + c + "\n C-= " + cmin
				+ "\n D = " + d + "\n F = " + f + "\n";
		return gradesd;

	}
}
