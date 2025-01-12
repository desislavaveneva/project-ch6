package gr.aueb.dt.ch7;

public class DecryptionProgram {

    public static String decryption(String input) {
        StringBuilder decrypted = new StringBuilder();

        for (char c : input.toCharArray()) {
            if (c >= 'A' && c <= 'Z') { // Process only uppercase Latin letters
                // Circular replacement: shift by -1 and wrap around using modulus
                char newChar = (char) ('A' + (c - 'A' - 1 + 26) % 26);
                decrypted.append(newChar);
            } else {
                decrypted.append(c); // Keep other characters unchanged
            }
        }

        return decrypted.toString();
    }

    public static void main(String[] args) {
        String input = "BCDEFYZA";
        System.out.println("Encrypted String: " + input);
        String decrypted = decryption(input);
        System.out.println("Decrypted String: " + decrypted);
    }
}
