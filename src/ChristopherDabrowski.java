import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
public class ChristopherDabrowski {
    public static void main(String[] args){
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

        String formatDateTime = now.format(formatter);
        System.out.println("Otworzono o:\t"+formatDateTime);
        System.out.println("\nHej! Oto ja! Christopher Dąbrowski!\nJeżeli to widzisz, to znaczy że jestem i mogę pisać z wami!");
    }
}
