package pkg;

import java.util.Scanner;

public class Calculator{
	
  static Scanner scaner = new Scanner(System.in);
  static double price, totalEnteredMoney, totalChange;

	public static double calculateTotalMoney(String userEnteredMoney, int pressedNumberSnack) {
		
		 for(Snacks snack: Snacks.values()){
		     if( snack.getSnackNumber() == pressedNumberSnack) 
		     { price = snack.getSnackPrice();  
		        break;}
		     }
		        
		    totalEnteredMoney = Money.parseMoney(userEnteredMoney);

		while(totalEnteredMoney <= price) {
			System.out.println("add more ");
	        String enteredMoney = scaner.nextLine();
		    totalEnteredMoney += Money.parseMoney(enteredMoney);
			totalChange += Money.getChange();
			System.out.println("paid money untill now= "+totalEnteredMoney + "$");

		  }
		double change = totalEnteredMoney - price + Money.getChange();
		System.out.println("change= "+change);

		return totalEnteredMoney;
	}

}