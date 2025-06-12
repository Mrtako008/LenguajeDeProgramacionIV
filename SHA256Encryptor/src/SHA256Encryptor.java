import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class SHA256Encryptor {
    public static String encryptToSHA256(String input){
        try{
            MessageDigest digest = MessageDigest.getInstance("SHA-256");
            byte[] hash= digest.digest(input.getBytes("UTF-8"));
            StringBuilder hexString = new StringBuilder();
            for (byte b : hash){
                String hex = Integer.toHexString(0xff & b);
                if (hex.length() == 1) hexString.append('0');
                hexString.append(hex);
            }
            return hexString.toString();

        } catch (Exception e) {
            throw new RuntimeException("Error al encriptar con SHA-256", e);
        }
    }
    public static void main(String[] args){
        String texto = "Hola mundo";
        String hash = encryptToSHA256(texto);
        System.out.println("Texto original:" + texto);
        System.out.println("Hash SHA-256:" + hash);
    }
}