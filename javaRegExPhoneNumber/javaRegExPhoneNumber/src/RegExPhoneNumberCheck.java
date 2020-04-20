import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExPhoneNumberCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true){
            System.out.println("Telefon numarasi giriniz: ");
            Pattern pattern = Pattern.compile("^\\+\\d{12}|(?:\\d{3}-){2}\\d{4}");
            Matcher matcher = pattern.matcher(sc.nextLine());
            boolean aktif= false;
            while (matcher.find()){
                System.out.println("Girilen "+matcher.group()+" numarasi gecerlidir");
                aktif=true;
            }
            if(!aktif){
                System.err.println("Girilen numara uygun formatta degildir.");
            }
        }
    }
}
