package ap.picturelab;

/**
 * This class contains class (static) methods that will help you test the
 * Picture class methods. Uncomment the methods and the code in the main to
 * test.
 *
 * @author Barbara Ericson
 */
/**
 * @author mikojiminez
 *
 */
@SuppressWarnings("unused")
public class PictureTester {

	/**
	 * Method to test zeroBlue
	 */
	public static void testZeroBlue() {
		Picture beach = new Picture("beach.jpg");
		beach.explore();
		beach.zeroBlue();
		beach.explore();
	}

	/**
	 * Method to test mirrorVertical
	 */
	public static void testMirrorVertical() {
		Picture caterpillar = new Picture("beach.jpg");
		caterpillar.explore();
		caterpillar.mirrorVertical();
		caterpillar.explore();
	}

	/**
	 * Method to test mirrorTemple
	 */
	public static void testMirrorTemple() {
		Picture temple = new Picture("temple.jpg");
		temple.explore();
		temple.mirrorTemple();
		temple.explore();
	}

	/**
	 * Method to test edgeDetection
	 */
	public static void testEdgeDetection() {
		Picture swan = new Picture("swan.jpg");
		swan.edgeDetection(10);
		swan.explore();
	}

	/**
	 * @param i
	 */
	private static void testGetAverageForColumn(int i) {
		// TODO Auto-generated method stub

	}

	/**
	 * @param i
	 */
	private static void testClearBlueOverValue(int i) {
		// TODO Auto-generated method stub

	}

	/**
	 * 
	 */
	private static void testSetRedToHalfValueInTopHalf() {
		// TODO Auto-generated method stub

	}

	/**
	 * @param i
	 */
	private static void testGetCountRedOverValue(int i) {
		// TODO Auto-generated method stub

	}

	/**
	 * 
	 */
	private static void testEncodeAndDecode() {
		// TODO Auto-generated method stub

	}

	/**
	 * 
	 */
	private static void testChromakey() {
		// TODO Auto-generated method stub

	}

	/**
	 * 
	 */
	private static void testEdgeDetection2() {
		// TODO Auto-generated method stub

	}

	/**
	 * 
	 */
	private static void testCopy() {
		Picture collage = new Picture("collage.jpg");
		Picture beach = new Picture("beach.jpg");
		collage.explore();
		collage.copy(beach, 50, 50, 0, 0, 150, 150);
		collage.explore();

	}

	private static void testMyCollage() {
		Picture collage = new Picture("collage2.jpg");
		collage.explore();
		collage.createMyCollage();
		collage.explore();

	}

	/**
	 * 
	 */
	private static void testCollage() {
		Picture collage = new Picture("collage.jpg");
		collage.explore();
		collage.createCollage();
		collage.explore();

	}

	/**
	 * 
	 */
	private static void testMirrorDiagonal() {
		Picture beach = new Picture("beach.jpg");
		beach.explore();
		beach.mirrorDiagonal();
		beach.explore();

	}

	/**
	 * 
	 */
	private static void testMirrorGull() {
		Picture gull = new Picture("seagull.jpg");
		gull.explore();
		gull.mirrorGull();
		gull.explore();
	}

	/**
	 * 
	 */
	private static void testMirrorArms() {
		Picture snowman = new Picture("snowman.jpg");
		snowman.explore();
		snowman.mirrorArms();
		snowman.explore();
	}

	/**
	 * 
	 */
	private static void testFixUnderwater() {
		Picture water = new Picture("water.jpg");
		water.explore();
		water.fixUnderwater();
		water.explore();
	}

	/**
	 * 
	 */
	private static void testGrayscale() {
		Picture beach = new Picture("beach.jpg");
		beach.explore();
		beach.grayScale();
		beach.explore();
	}

	/**
	 * 
	 */
	private static void testNegate() {
		Picture beach = new Picture("beach.jpg");
		beach.explore();
		beach.negate();
		beach.explore();

	}

	/**
	 * 
	 */
	private static void testKeepOnlyGreen() {
		Picture beach = new Picture("beach.jpg");
		beach.explore();
		beach.zeroBlue();
		beach.zeroRed();
		beach.explore();

	}

	/**
	 * 
	 */
	private static void testKeepOnlyRed() {
		Picture beach = new Picture("beach.jpg");
		beach.explore();
		beach.zeroGreen();
		beach.zeroBlue();
		beach.explore();
	}

	/**
	 * 
	 */
	private static void testKeepOnlyBlue() {
		Picture beach = new Picture("beach.jpg");
		beach.explore();
		beach.zeroGreen();
		beach.zeroRed();
		beach.explore();
	}

	private static void testMirrorVerticalRightToLeft() {
		Picture beach = new Picture("beach.jpg");
		beach.explore();
		beach.mirrorVerticalRightToLeft();
		beach.explore();
	}

	private static void testMirrorHorizontal() {
		Picture beach = new Picture("beach.jpg");
		beach.explore();
		beach.horizontalReflection();
		beach.explore();
	}

	private static void testMirrorHorizontalBotToTop() {
		Picture beach = new Picture("beach.jpg");
		beach.explore();
		beach.mirrorHorizontalBotToTop();
		beach.explore();

	}

	/**
	 * Main method for testing. Every class can have a main method in Java
	 */
	public static void main(String[] args) {
		//// A5
		// testZeroBlue();
		// testKeepOnlyBlue();
		// testKeepOnlyRed();
		// testKeepOnlyGreen();
		// testNegate();
		// testGrayscale();
		// testFixUnderwater();
		//// A6
		// testMirrorDiagonal();
		// testMirrorVerticalRightToLeft();
		// testMirrorHorizontal();
		// testMirrorHorizontalBotToTop();
		//// A7
		// testMirrorVertical();
		// testMirrorTemple();
		// testMirrorArms();
		// testMirrorGull();
		//// A8
		// testCollage();
		// testMyCollage();
		testCopy();
		//// A9
		// testEdgeDetection();
		// testEdgeDetection2();
		// testChromakey();
		// testEncodeAndDecode();
		// testGetCountRedOverValue(250);
		// testSetRedToHalfValueInTopHalf();
		// testClearBlueOverValue(200);
		// testGetAverageForColumn(0);
	}
}