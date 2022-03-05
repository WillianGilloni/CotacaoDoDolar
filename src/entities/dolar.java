package entities;

public class dolar {
	public static double IOF = 0.06;
	
	public static double dollarToReal(double amount, double dollarprice) {
		return amount * dollarprice *(1.0 + IOF);
	}
}
