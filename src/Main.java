import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {

    public static void main(String[] args) {
        System.out.println("Kurs wiosenny czas zacząć!\nW tym semestrze bedzie wiecej zadan domowych i nauki!\n");

        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

        String formatDateTime = now.format(formatter);
        System.out.println("Otworzono o:\t"+formatDateTime);
    }
}
