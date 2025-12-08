import java.security.*;
import java.util.Base64;

public class DigitalSignatureDSA {
    public static void main(String[] args) throws Exception {

        // 1. Generate DSA key pair
        KeyPairGenerator keyGen = KeyPairGenerator.getInstance("DSA");
        keyGen.initialize(1024);
        KeyPair pair = keyGen.generateKeyPair();
        PrivateKey privateKey = pair.getPrivate();
        PublicKey publicKey = pair.getPublic();

        String message = "This is a digital signature example";

        // 2. Sign the message
        Signature sign = Signature.getInstance("SHA1withDSA");
        sign.initSign(privateKey);
        sign.update(message.getBytes());
        byte[] digitalSignature = sign.sign();

        // 3. Convert signature to Base64 for display
        String signatureString = Base64.getEncoder().encodeToString(digitalSignature);

        // 4. Verify the signature
        Signature verify = Signature.getInstance("SHA1withDSA");
        verify.initVerify(publicKey);
        verify.update(message.getBytes());
        boolean isVerified = verify.verify(digitalSignature);

        System.out.println("Message         : " + message);
        System.out.println("Digital Signature (Base64): " + signatureString);
        System.out.println("Verification    : " + (isVerified ? "Valid" : "Invalid"));
    }
}
