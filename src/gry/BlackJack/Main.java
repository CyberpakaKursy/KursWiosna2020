package gry.BlackJack;

public class Main {
    public static void main(String[] args) {
        SandBox sandBox = new SandBox();
        sandBox.zmniejszPrzezroczystosc();
        System.out.println(sandBox.przezroczystosc);
        sandBox.zmniejszPrzezroczystosc();
        sandBox.zmniejszPrzezroczystosc();
        System.out.println(sandBox.przezroczystosc);

        SandBox sandbox2 = new SandBox();
        System.out.println("glosnosc");
        sandbox2.zmnijszGlosnosc();
        sandbox2.zmnijszGlosnosc();
        System.out.println(sandbox2.glosnosc);

        SandBox sandob3 = new SandBox();
        sandob3.glosnosc = sandbox2.glosnosc;
        System.out.println(sandob3.glosnosc);
        sandob3.zmnijszGlosnosc();
        sandob3.zmniejszPrzezroczystosc();
        sandob3.lubiePlacki("lubie");
        Integer nazwa =  sandob3.lubiePlacki2();
       Integer bob = sandob3.zmienPrzezroczystosc(1000);
    }

}
