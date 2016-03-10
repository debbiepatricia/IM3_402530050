/*
 * [A]98
 * [TA's advise]
 * 1.¦Û¦æ«Ø¸mÃþ§O·|«ØÄ³¥[¤JµL°Ñ¼Æ«Øºc¤l, ¥HÁ×§Kµ{¦¡¼¶¼g®É¥X²{°ÝÃD, Rectangle1(){this(-1,-1,-1,-1);//¥i¥H³z¹Lthisªº¤è¦¡¶i¦æª«¥óªºinitial}.
 * 2.Class¤º³¡ªºproperties Ok, ­×¹¢¦r¥Ø«e³£¨Ï¥Îpublic, ¦³¨S¦³¿ìªk¥i¥HÅý¥L§ó¦n§ó¦w¥þ©O? (·Q·Q¬Ýprotected, privateµ¥­×¹¢¦r).
 * 3.Rectangle1»PRectangle2¨ä¹ê¬O°µ¬Û¦Pªº¨Æ±¡, ¤£»Ý­n±N¨ä½Æ»s¥t¥~¤@¥÷¥X¨Ó, ¤U¤èªºµ{¦¡½X§Ú¦³µy·L­×§ï§Aªºµ{¦¡½X¤º®e(µù¸Ñ³¡¤À¤º®e), ½Ð§A¦A¬Ý¤@¤U.
 * 4.¥t¥~toString»Ý­n¨Ï¥Îoverriddingªº¤è¦¡¥h½Æ¼gObject class¤¤´£¨Ñªºmethod, §Aªºµ{¦¡½X¬O«Øºc¥X¥t¤@­Ómethod¦Ó¤£¬Ooverridding, ¦¹³¡¤À°u¶q¦©2¤À.
 * */

//java homework 1
//rectangle tester
//402530050_­JÏÈ¶³‚é›²

class Rectangle1 {

	public int height;
	public int width;
	public int y;
	public int x;

	public Rectangle1(int h1, int w1, int y1, int x1) {
		height = h1;
		width = w1;
		y = y1;
		x = x1;

	}

	public int getHeight1() {
		return height;
	}

	public int getWidth1() {
		return width;
	}

	double getArea1() {
		return getHeight1() * getWidth1();
	}

	double getPerimeter1() {
		return 2 * (getHeight1() + getWidth1());
	}

	// this is overridding
	public String toString() {
		return " X = " + x + ", Y = " + y + ", Width = " + width + ", Height = " + height;
	}

	// this is a new method
	public String toString1() {
		return " X = " + x + ", Y = " + y + ", Width = " + width + ", Height = " + height;
	}
}

/*
 * class Rectangle2 {
 * 
 * public int height ; public int width ; public int y ; public int x ;
 * 
 * 
 * public Rectangle2 (int h2, int w2, int y2, int x2){ height = h2; width = w2;
 * y = y2; x = x2;
 * 
 * } public int getHeight2(){ return height; }
 * 
 * public int getWidth2(){ return width; }
 * 
 * double getArea2(){ return getHeight2()*getWidth2(); }
 * 
 * double getPerimeter2(){ return 2 * (getHeight2() + getWidth2()); }
 * 
 * public String toString2(){ return " X = " + x + ", Y = " + y + ", Width = " +
 * width + ", Height = " + height; }
 * 
 * }
 */

public class RectangleTester {

	public static void main(String[] args) {

		Rectangle1 rec1 = new Rectangle1(18, 57, 25, 15);
		Rectangle1 rec2 = new Rectangle1(47, 60, 12, 0);
		// Rectangle2 rec2 = new Rectangle2(47, 60, 12, 0);

		System.out.println();

		System.out.println("java.Rectangle [" + rec1.toString() + " ]");
		// System.out.println("java.Rectangle [" + rec1.toString1() + " ]");

		System.out.println("Area= " + rec1.getArea1());
		System.out.println("Perimeter= " + rec1.getPerimeter1());

		System.out.println();
		System.out.println();

		System.out.println("java.Rectangle [" + rec2.toString() + " ]");
		// System.out.println("java.Rectangle [" + rec2.toString1() + " ]");

		System.out.println("Area= " + rec2.getArea1());
		System.out.println("Perimeter= " + rec2.getPerimeter1());

		// System.out.println("java.Rectangle [" + rec2.toString2() + " ]");
		// System.out.println("Area= " + rec2.getArea2());
		// System.out.println("Perimeter= " + rec2.getPerimeter2());

		System.out.println();
		System.out.println();

		System.out.print("End of Output! ");
	}

}
