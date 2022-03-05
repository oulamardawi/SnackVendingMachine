package pkg;

import java.text.DecimalFormat;
import java.util.*;

public class  SnackVMImplemnt  implements SnackVMInterface {  
	Scanner menuInput = new Scanner(System.in);
	//DecimalFormat moneyFormat = new DecimalFormat("'$'###,##0.00");


	/* Display Snacks Menu with selection */
	
	  @Override
	public void printSnacksMenu() {
		System.out.println(" *********************************************");
      System.out.println("     WELCOME TO OULA'S VENDING MACHINE           ");
      System.out.println(" *********************************************");
      System.out.println("                                              ");

      for(Snacks snack: Snacks.values()){
        System.out.print("     " + snack.getSnackNumber() + "  " + snack.name() + "(" + snack.getSnackPrice() + ")" + "\t");
        count++;  if (count == 5)
       System.out.println("                                              ");          
        }
      System.out.println("                                               ");
      System.out.println("Enter Your Snack Number:                       ");
	}
	
	  @Override
		public void requestedNumberSnack(int pressedNumberSnack) {
					if (pressedNumberSnack > 0 && pressedNumberSnack < 26) {
						 this.RequestedSnackNumber = pressedNumberSnack;				
					}
					else {
				System.out.println("Wrong Snack Number." + "\n");
				System.exit(0);
					}
		      }

	
	
	  
	   @Override
	    public void printPayRules() {
	        System.out.println(" Accepted Money: ");
	        System.out.println(" 10 c, 20 c, 50 c, 1 $, 20 $, 50 $");
	        System.out.println(" Please enter money: \n"); 
	    }
	
	int selection, RequestedSnackNumber, count=0;
}


