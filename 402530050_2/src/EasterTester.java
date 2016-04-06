/*
 * [C]67
 * [TA's Advise]
 * 1.未依照作業要求撰寫作業, 並實作演算法錯誤, 等級從C開始計算
 * 2.javadoc中有寫一些註解, extra point +2.
 */

/**
 * class EasterTester that invokes the static method of the Easter class year
 * 2001 and 2012
 */

public class EasterTester {
	public static void main(String[] args) {

		// print out the result for Easter Sunday's month and day
		// year according to user's input
		Easter EasterSunday1 = new Easter(2001);
		System.out.println(EasterSunday1.year1());

		Easter EasterSunday2 = new Easter(2012);
		System.out.println(EasterSunday2.year2());

	}
}
