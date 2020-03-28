public class Kalkulator {

	public String mnozenie(double a, double b){}
	public String dzielenie(double a, double b){}
	public String odejmowanie(double a, double b){}
	public String dodawania(double a, double b){}
	public String potegowanie(double a, double b){
		//a do potęgi b.
		double c = a;
		for (int i=0; i<b; i++){
			c=c*a;
		}
		String wynik = Double.toString(c);
		return wynik;
	}
}
