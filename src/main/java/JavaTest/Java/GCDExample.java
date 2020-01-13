package JavaTest.Java;

import java.util.Scanner;

public class GCDExample {
	
    public static void main(String args[]){
        
        //Enter two number whose GCD needs to be calculated.      
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter first number to find GCD");
        int number1 = scanner.nextInt();
        System.out.println("Please enter second number to find GCD");
        int number2 = scanner.nextInt();
      
        System.out.println("GCD of two numbers " + number1 +" and " 
                           + number2 +" is :" + findGCD(number1,number2));
      
      
    }

    /*
     * Java method to find GCD of two number using Euclid's method
     * @return GDC of two numbers in Java
     */
//    private static int findGCD(int number1, int number2) {
//        //base case
//        if(number2 == 0){
//            return number1;
//        }
//        return findGCD(number2, number1%number2);
//    }
//  
    
    
    
  private static int findGCD(int num1, int num2) {
	  while (num1 != num2) {
      	if(num1 > num2)
              num1 = num1 - num2;
          else{
              num2 = num2 - num1;
      }
	 
	  }
	return num2;
  }
  
//  int lcm(int a, int b)
//  {
//      // the lcm is simply (a * b) divided by the gcf of the two
//
//      return (a * b) / gcf(a, b);
//  }



}
