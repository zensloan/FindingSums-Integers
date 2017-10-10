import java.util.Scanner;

public class FindingTheSums {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      int userNumFirst = 0;
      int userNumSecond = 0;
      boolean endResult = true;
      int hundredsFirst = 0;
      int tensFirst = 0;
      int onesFirst = 0;
      int hundredsSecond = 0;
      int tensSecond = 0;
      int onesSecond = 0;
      int hundredsTotal = 0;
      int tensTotal = 0;
      int onesTotal = 0;
      
      
      System.out.println("Enter first number (must be 3 digits or have more than one place value): ");
      userNumFirst = input.nextInt();
      
      
      System.out.println("Enter second number (must be 3 digits or have more than one place value): ");
      userNumSecond = input.nextInt();
      
      hundredsFirst = userNumFirst/100;
      tensFirst = (userNumFirst % 100) /10; 
      onesFirst = userNumFirst % 10;
      
    
      hundredsSecond = userNumSecond/100;
      tensSecond = (userNumSecond % 100) /10; 
      onesSecond = userNumSecond % 10;
      
      hundredsTotal = hundredsFirst + hundredsSecond;
      tensTotal = tensFirst + tensSecond;
      onesTotal = onesFirst + onesSecond;
    	
      if ((userNumFirst > 999) && (userNumFirst > -999)) {
    	  System.out.print("error");
      }
      
      else if ((hundredsTotal == tensTotal) && (tensTotal == onesTotal) &&
    		  (hundredsTotal == onesTotal) && (userNumFirst < 999) && (userNumFirst < -999)) {
    	  System.out.print(endResult); 
      }
      else if ((tensTotal == onesTotal)) {
    	  System.out.print(endResult);
      }
    	  
      else if ((hundredsTotal != tensTotal) && (tensTotal != onesTotal) &&
    		  (hundredsTotal != onesTotal)) {
              System.out.print(!endResult);
      }
    	  
      else {
    	  System.out.print("Check the amount of place values entered");
      }
      
	   
	 
	   
	   
   }
}
