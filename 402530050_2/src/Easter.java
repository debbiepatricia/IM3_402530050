/*Easter class that implements Gauss's algorithm 
 * calculateEaster(int aYear) : String = public String calculateEaster( int aYear)*/

public class Easter {
	// 使用private的保留字這件事情很好!
	private int a, b, c, d, e, g, h, j, k, m, r, n, p;

	// y is the year ex = 2001 and 2012

	/**
	 * @param y
	 *            will be the year that users enter
	 */
	Easter(int y) {
		// Divide y by 19 and call the remainder a.
		a = y % 19;

		// Divide y by 100 to get a quotient b and a remainder c.
		b = y / 100;// Math.floor(), -2
		c = y % 100;

		// Divide b by 4 to get a quotient d and a remainder e.
		d = b / 4;// Math.floor()
		e = b % 4;

		// divide 8 * b + 13 by 25 to get a quotient g. Ignore the remainder.
		g = (8 * b + 13) / 25;// Math.floor(), f=(8 * b + 13) / 25;, right?
		// g=Math.floor((b-f+1)/3);

		// divide 19 * a + b - d - g + 15 by 30 to get a remainder h. Ignore the
		// quotient.
		h = (19 * a + b - d - g + 15) % 30;

		// divide c by 4 to get a quotient j and a remainder k.
		j = c / 4;// Math.floor()
		k = c % 4;

		// 以下開始的一些數字我不知道你從哪裡來的:319, 90, 25, and so on.., -3, 似乎也不像是Anonymous
		// Gregorian algorithm
		// divide a + 11 * h by 319 to get a quotient m. Ignore the remainder.
		m = (a + 11 * h) / 319;

		// divide 2 * e + 2 * j - k -h + m + 32 by 7 to get a remainder r.
		// Ignore the quotient.
		r = (2 * e + 2 * j - k - h + m + 32) % 7;

		// divide h - m + r + 90 by 25 to get a quotient n. Ignore the
		// remainder.
		n = (h - m + r + 90) / 25;

		// divide h - m + r + n + 19 by 30 to get a remainder p.
		p = (h - m + r + n + 19) % 32;
	}

	/**
	 * 
	 * @return p returns the day in which a given year's Easter Sunday will take
	 *         place
	 */

	// 以下method沒有使用到
	public int getESDay() {
		/** the month of the year */
		return p;
	}

	/**
	 * @return n returns the month in which a given year's Easter Sunday will
	 *         take place
	 */
	public int getESMonth() {
		/** the day of the month */
		return n;
	}
	// 以上method沒有使用到

	// 或許使用public String toString()會更好.
	public String year1() {
		return " in 2001, Easter Sunday is: month = " + n + ", and day = " + p;
	}

	public String year2() {
		return " in 2012, Easter Sunday is: month = " + n + ", and day = " + p;
	}
}
