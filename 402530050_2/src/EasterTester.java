/*
 * [C]67
 * [TA's Advise]
 * 1.���̷ӧ@�~�n�D���g�@�~, �ù�@�t��k���~, ���űqC�}�l�p��
 * 2.javadoc�����g�@�ǵ���, extra point +2.
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
