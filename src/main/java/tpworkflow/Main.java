package tpworkflow;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean isValid;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a credit card number: ");
        String creditCardNumber = sc.nextLine();
        isValid = validateCreditCardNumber(creditCardNumber);

        if (isValid) {
            System.out.println("The credit card number is valid.");
        } else {
            System.out.println("The credit card number is invalid.");
        }
    }

    static boolean validateCreditCardNumber(String nbCreditCard) {
        // Supprimer les espaces et les caractères non numériques
        String cardNumber = nbCreditCard.replaceAll("[^0-9]", "");

        // Vérifier la longueur du numéro de carte
        if (cardNumber.length() < 13 || cardNumber.length() > 19) {
            return false;
        }

        // Inverser les chiffres
        String reversedCardNumber = reverseCreditCardNumber(cardNumber);

        // Appeler la fonction pour doubler et sommer les chiffres
        int sum = doubleAndSumDigits(reversedCardNumber);

        // Si la somme est un multiple de 10, le numéro de carte est valide
        return sum % 10 == 0;
    }

    // Fonction pour inverser le numéro de carte
    private static String reverseCreditCardNumber(String cardNumber) {
        StringBuilder reversedCreditCard = new StringBuilder();

        for (int i = cardNumber.length() - 1; i >= 0; i--) {
            reversedCreditCard.append(cardNumber.charAt(i));
        }

        return reversedCreditCard.toString();
    }

    // Fonction pour doubler et sommer les chiffres
    private static int doubleAndSumDigits(String reversedCardNumber) {
        int sum = 0;
        boolean shouldDouble = false;

        for (int i = 0; i < reversedCardNumber.length(); i++) {
            int digit = Character.getNumericValue(reversedCardNumber.charAt(i));

            if (shouldDouble) {
                digit *= 2;
                if (digit >= 10) {
                    digit -= 9;
                }
            }
            sum += digit;

            shouldDouble = !shouldDouble;
        }
        return sum;
    }
}
