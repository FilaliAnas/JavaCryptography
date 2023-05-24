import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.util.Base64;

public class Main {
    public static void main(String[] args) {
        try {
            String originalMessage = "Hello, AES!";
            String secretKey = "ThisIsASecretKey";

            // Encrypt the message
            String encryptedMessage = AES.encrypt(originalMessage, secretKey);
            System.out.println("Encrypted Message: " + encryptedMessage);

            // Decrypt the message
            String decryptedMessage = AES.decrypt(encryptedMessage, secretKey);
            System.out.println("Decrypted Message: " + decryptedMessage);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

class AES {
    public static String encrypt(String message, String secretKey) throws Exception {
        SecretKeySpec secretKeySpec = new SecretKeySpec(secretKey.getBytes(StandardCharsets.UTF_8), "AES");
        Cipher cipher = Cipher.getInstance("AES");
        cipher.init(Cipher.ENCRYPT_MODE, secretKeySpec);
        byte[] encryptedBytes = cipher.doFinal(message.getBytes(StandardCharsets.UTF_8));
        return Base64.getEncoder().encodeToString(encryptedBytes);
    }

    public static String decrypt(String encryptedMessage, String secretKey) throws Exception {
        SecretKeySpec secretKeySpec = new SecretKeySpec(secretKey.getBytes(StandardCharsets.UTF_8), "AES");
        Cipher cipher = Cipher.getInstance("AES");
        cipher.init(Cipher.DECRYPT_MODE, secretKeySpec);
        byte[] decryptedBytes = cipher.doFinal(Base64.getDecoder().decode(encryptedMessage));
        return new String(decryptedBytes, StandardCharsets.UTF_8);
    }
}
