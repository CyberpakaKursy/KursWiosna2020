public class Rozowy implements Kolor {


    @Override
    public void kot() {
        System.out.println("Jestem KOOtem");
    }

    @Override
    public int liczba(int nazwa) {
        int nazwa2 = nazwa+1;
        return nazwa2;
    }

    @Override
    public void liczba2(String liczba3, int liczba4) {
        System.out.println(liczba3);
        System.out.println(liczba4);
    }

    @Override
    public String liczba6(int nazwa2, String liczba7) {
        return liczba7+nazwa2;
    }
}
