public class Main {
    public static void main(String[] args) {
        Crypto crypto = new Crypto();

        String originalString = "hello world";

        // Encrypt the original string
        System.out.println("Original: " + originalString);
        crypto.encrypt(originalString);

        System.out.println();

        String encryptedString = "khoor zruog";

        // Decrypt the encrypted string
        System.out.println("Encrypted: " + encryptedString);
        crypto.decrypt(encryptedString);
    }
}
