package com.company;
import java.util.Scanner;


public class Main {

    // Caesar Cipher Encryption
    public static String caesarEncrypt(String text, int shift) {
        StringBuilder result = new StringBuilder();
        for (char character : text.toCharArray()) {
            if (Character.isLetter(character)) {
                char base = Character.isLowerCase(character) ? 'a' : 'A';
                result.append((char) ((character - base + shift) % 26 + base));
            } else {
                result.append(character);
            }
        }
        return result.toString();
    }

    // Caesar Cipher Decryption
    public static String caesarDecrypt(String text, int shift) {
        return caesarEncrypt(text, 26 - (shift % 26));
    }

    // Vigenère Cipher Encryption
    public static String vigenereEncrypt(String text, String key) {
        StringBuilder result = new StringBuilder();
        key = key.toLowerCase();
        int keyIndex = 0;
        for (char character : text.toCharArray()) {
            if (Character.isLetter(character)) {
                char base = Character.isLowerCase(character) ? 'a' : 'A';
                int shift = key.charAt(keyIndex % key.length()) - 'a';
                result.append((char) ((character - base + shift) % 26 + base));
                keyIndex++;
            } else {
                result.append(character);
            }
        }
        return result.toString();
    }

    // Vigenère Cipher Decryption
    public static String vigenereDecrypt(String text, String key) {
        StringBuilder result = new StringBuilder();
        key = key.toLowerCase();
        int keyIndex = 0;
        for (char character : text.toCharArray()) {
            if (Character.isLetter(character)) {
                char base = Character.isLowerCase(character) ? 'a' : 'A';
                int shift = key.charAt(keyIndex % key.length()) - 'a';
                result.append((char) ((character - base - shift + 26) % 26 + base));
                keyIndex++;
            } else {
                result.append(character);
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Select an option:");
            System.out.println("1. Encrypt using Caesar Cipher");
            System.out.println("2. Decrypt using Caesar Cipher");
            System.out.println("3. Encrypt using Vigenère Cipher");
            System.out.println("4. Decrypt using Vigenère Cipher");
            System.out.println("5. Exit");

            int choice = scanner.nextInt();
            scanner.nextLine();

            if (choice == 5) {
                break;
            }

            System.out.print("Enter the text: ");
            String text = scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter shift value: ");
                    int shift = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Encrypted Text: " + caesarEncrypt(text, shift));
                    break;
                case 2:
                    System.out.print("Enter shift value: ");
                    shift = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Decrypted Text: " + caesarDecrypt(text, shift));
                    break;
                case 3:
                    System.out.print("Enter key: ");
                    String key = scanner.nextLine();
                    System.out.println("Encrypted Text: " + vigenereEncrypt(text, key));
                    break;
                case 4:
                    System.out.print("Enter key: ");
                    key = scanner.nextLine();
                    System.out.println("Decrypted Text: " + vigenereDecrypt(text, key));
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
        scanner.close();
    }
}
