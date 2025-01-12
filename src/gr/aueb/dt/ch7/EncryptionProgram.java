package gr.aueb.dt.ch7;

public class EncryptionProgram {
    public static String encryption(String input) {
        StringBuilder encrypted = new StringBuilder();

        for (char c : input.toCharArray()) {
            if (c >= 'A' && c <= 'Z') {
                char newChar = (char) ('A' + (c - 'A' + 1) % 26);
                encrypted.append(newChar);
            } else {
                encrypted.append(c);
            }
        }

        return encrypted.toString();
    }

    public static void main(String[] args) {
        String input = "ABCDEXYZ";
        System.out.println("Original String: " + input);
        String encrypted = encryption(input);
        System.out.println("Encrypted String: " + encrypted);
    }
}