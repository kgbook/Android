import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class App {
    public static void main(String[] args) {
        var pattern = Pattern.compile("GFW", Pattern.CASE_INSENSITIVE);
        var matcher = pattern.matcher("Fuch GFW!");
        if (matcher.find()) {
            System.out.println("GFW exist!");
        }
    }
}
