package pkg;

enum Snacks {// enum public static and final by default
    OREO(1,17), Doritos(2,33), Lays(3,30), Reeses(4,150), PopCorn(5,20),
    KitKat(6,0.95), Mars(7,0.96), PoP(8,0.90), Toufix(9,0.80), Biscket(10,0.65); //all in USD $

    private int SnackNumber;
    private double SnackPrice;

    Snacks(int snackNumber, double snackPrice){
        this.SnackNumber= snackNumber;
        this.SnackPrice = snackPrice;
    }

    public int getSnackNumber(){
        return SnackNumber;
    }

    public double getSnackPrice(){
        return this.SnackPrice;
    }

}


