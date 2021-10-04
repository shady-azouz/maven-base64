import org.apache.commons.codec.binary.Base64;

public class App {
    public byte[] converter(String s) {
        return Base64.encodeBase64(s.getBytes());
    }
}
