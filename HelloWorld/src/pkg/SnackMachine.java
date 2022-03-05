package pkg;

import java.io.IOException;
import java.util.*;

public class SnackMachine {

    public static void main(String[] args) throws IOException{
        Scanner scannr = new Scanner(System.in);
        Scanner scanner = new Scanner(System.in);

        int pressedNumberSnack = 0;
        
        SnackVMInterface machineInterface = new SnackVMImplemnt();
      
     try {
    	  machineInterface.printSnacksMenu();
          pressedNumberSnack = scannr.nextInt();
          machineInterface.requestedNumberSnack(pressedNumberSnack);
        

     } catch (Exception e) {
	System.out.println("\n" + "Invalid character(s). Only numbers." + "\n");
	System.exit(0);
     } 

        machineInterface.printPayRules();
        
        String userEnteredMoney = scanner.nextLine();
        double enteredMoney = Calculator.calculateTotalMoney(userEnteredMoney,pressedNumberSnack);
		System.out.println("its suffiecent ammount= "+enteredMoney);

       /* machineInterface.printChangeMessage();
        *  i can split the change in its own functionality 
		*  to achvive	(Loose coupling)
	    */

    }
}