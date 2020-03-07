import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.awt.KeyEventDispatcher;
import java.awt.KeyboardFocusManager;
import java.awt.event.KeyEvent;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        while (true) {
            System.out.println("Kurs wiosenny czas zacząć!\nW tym semestrze bedzie wiecej zadan domowych i nauki!\n");

            LocalDateTime now = LocalDateTime.now();
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

            String formatDateTime = now.format(formatter);
            System.out.println("Otworzono1 o:\t" + formatDateTime);
            String formatDateTime2 = now.format(formatter);
            System.out.println("Otworzono2 o:\t" + formatDateTime2);
            String formatDateTime3 = now.format(formatter);

            System.out.println("Otworzono3 Hejkaaaaaaaaaa o:\t" + formatDateTime3);

            System.out.println("Otworzono3 kajsdajklshkj;avjaskdbx;nzcz,x.vaskjdbasdjkgb");

            String znakNaKoniecPentli = scanner.nextLine();
//            String formatDateTime = now.format(formatter);
//            System.out.println("Otworzono o:\t" + formatDateTime);
//            String znakNaKoniecPentli = scanner.nextLine();

            if (znakNaKoniecPentli.equals("q")){
                break;
            }
        }
    }

    void metodaTworzacaWszystkieObiektyImplementujaceInterfejs(){
        Carrot carrot = new Carrot();
        Banan banan = new Banan();
        Rozowy rozowy = new Rozowy();
        Volkswagen volkswagen = new Volkswagen();
        Owca owca = new Owca();
    }

}
