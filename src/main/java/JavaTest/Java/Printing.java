package JavaTest.Java;

public class Printing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		drawPyramidOfNumbers();

	}
	
//	 public static void drawPyramidPattern() {
//	        for (int i = 0; i < 5; i++) {
//	            for (int j = 0; j < 5 - i; j++) {
//	                System.out.print(" ");
//	            }
//	            for (int k = 0; k <= i; k++) {
//	                System.out.print("* ");
//	            }
//	            System.out.println();
//	        }
//	    }
//	 
	 
//	 public static void drawPyramidPattern() {
//	        for (int i = 0; i < 5; i++) {
//	            for (int j = 0; j < 5 - i; j++) {
//	                System.out.print("* ");
//	            }
//	            for (int k = 0; k <= i; k++) {
//	                System.out.print(" ");
//	            }
//	            System.out.println();
//	        }
//	    }
	 
	 
	    public static void drawPyramidOfNumbers() {
	        for (int i = 0; i < 5; i++) {
	            for (int j = 0; j < 5 - i; j++) {
	                System.out.print(" ");
	            }
	            for (int k = 0; k <= i; k++) {
	                System.out.print(k + " ");
	            }
	            System.out.println();
	        }
	    }

}
