/*
 * Copyright (c) 2023.
 * Author : Kushal Shrestha
 * Linkedin : https://www.linkedin.com/in/kushal-shrestha/
 * Email : kushalshr@gmail.com
 */

package InterviewQuestions.WhyStringsAreImmutable;


/**
 * Security: Immutable strings help in creating secure applications by preventing unauthorized modifications.
 * Immutable strings are used extensively in handling sensitive information like passwords, encryption keys,
 * and network URLs, ensuring that they cannot be modified accidentally or intentionally.
 * */
public class SecuresApplication {
    public static void main(String[] args) {
        String secretKey = "ABC123";
        String message = "Hello, World!";

        String encryptedMessage = encrypt(message, secretKey);

        // Attacker trying to modify the encrypted message
        encryptedMessage = "Hello, World";

        // Checking if the modified message is valid
        boolean isValid = isValidMessage(encryptedMessage, secretKey);
        System.out.println("Message Valid: " + isValid);
    }

    private static String encrypt(String message, String key) {
        // Encryption logic using the key
        String encrypted = ""; // Placeholder for encryption result

        // Encrypt the message using the key
        for (int i = 0; i < message.length(); i++) {
            char c = message.charAt(i);
            char encryptedChar = (char) (c + key.charAt(i % key.length()));
            encrypted += encryptedChar;
        }
        System.out.println("ENCRYPTED : " + encrypted);
        return encrypted;
    }

    private static boolean isValidMessage(String message, String key) {
        // Decrypt the message using the key
        String decrypted = decrypt(message, key);

        // Check if the decrypted message is valid
        return decrypted.equals("Hello, World!");
    }

    private static String decrypt(String message, String key) {
        // Decryption logic using the key
        String decrypted = ""; // Placeholder for decryption result

        // Decrypt the message using the key
        for (int i = 0; i < message.length(); i++) {
            char c = message.charAt(i);
            char decryptedChar = (char) (c - key.charAt(i % key.length()));
            decrypted += decryptedChar;
        }

        System.out.println("DECRYPTED : " + decrypted);

        return decrypted;
    }
}
