import org.apache.commons.codec.binary.Base64;

public class App {
    public byte[] convert(String s) {
        return Base64.encodeBase64(s.getBytes());
    }
}
