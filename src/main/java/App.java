import java.util.Base64;

public class App {
    public String converter(String s) {
        return Base64.getEncoder().encodeToString(s.getBytes());
    }
}
