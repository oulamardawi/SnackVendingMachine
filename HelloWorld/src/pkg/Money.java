package pkg;

public enum Money {

    TEN_CENTS(10),  TWENTY_CENTS(20), FIFTY_CENTS(50), ONE_DOLLAR(1), TWENTY_DOLLARS(20), FIFTY_DOLLARS(50);
    private int value;
   static double change = 0;
    Money(int value){
        this.value = value;
    }
//enhancment: must be moved to another class which is resposible to validate money 
    public static double parseMoney(String money){
    	
    	double totalMoney = 0;
        String[] numberMoneyInText = money.split(" ");
       double moneyy = Integer.parseInt(numberMoneyInText[0]);

       
        if(numberMoneyInText[1].equals("c")) {

        	if(moneyy == TEN_CENTS.value || moneyy == TWENTY_CENTS.value || moneyy == FIFTY_CENTS.value) {
        		moneyy = moneyy/100.0;
        		totalMoney += moneyy;
        	System.out.println("Entered Money in c= "+totalMoney);	
        	}
        	else 
        		{
        		moneyy = moneyy/100.0;
        		setChange(moneyy);
            	System.out.println("Entered Money = "+totalMoney);	
            	System.out.println("Entered Change= "+getChange());	
        		}
        } 
        else if(numberMoneyInText[1].equals("$")) {

        	if(moneyy == ONE_DOLLAR.value || moneyy == TWENTY_DOLLARS.value || moneyy == FIFTY_DOLLARS.value) {
        		totalMoney += moneyy;
        	System.out.println("Entered Money= "+totalMoney);	
        	}
        	else 
        		{
        		setChange(moneyy);
            	System.out.println("couldn't add this money, Entered Money= "+totalMoney);	
            	System.out.println("Entered Change= "+getChange());	
        		}
        }
        else {
        	System.out.println("Entered Money= "+totalMoney);	
        	System.out.println("Entered Change= "+getChange());	
        	System.out.println("Wrong currency, Just Accept USD");	

        	
        }
 return totalMoney;
   
    }
    

    static void setChange(double moneyy) {
       change += moneyy;		
	}

	public int getValue(){
        return this.value;
    }

	static double getChange() {
		
		return change;
	}
}