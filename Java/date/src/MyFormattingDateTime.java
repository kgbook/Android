import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class MyFormattingDateTime {
    public static void main(String[] args) {
        var dt_obj = LocalDateTime.now();
        System.out.println("Before formatting: " + dt_obj);

        var fmt_obj = DateTimeFormatter.ofPattern("yyyy-MM-DD HH:mm:ss");
        System.out.println("After formatting:" + dt_obj.format(fmt_obj));
        System.out.println("dt_obj: " + dt_obj); // Not changed
    }
}
