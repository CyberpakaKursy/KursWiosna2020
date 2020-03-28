public class Kalkulator {

	public String mnozenie(double a, double b){}
	public String dzielenie(double a, double b){
		Double wynik;
		wynik = Double.valueOf(0);
		if(b==0) {
			System.out.println(" nie mozesz dxielic przez 0");
		}else wynik = a/b;

		return wynik.toString();
	}
	public String odejmowanie(double a, double b){}
	public String dodawania(double a, double b){}
	public String potegowanie(double a, double b){}
}
