package tpworkflow;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void testValidateCreditCardNumber_Valid() {
        // Test avec un numéro de carte valide
        String validCardNumber = "4539 1488 0343 6467"; // Valide selon l'algorithme de Luhn
        assertTrue(Main.validateCreditCardNumber(validCardNumber), "The credit card number should be valid.");
    }

    @Test
    void testValidateCreditCardNumber_Invalid() {
        // Test avec un numéro de carte invalide
        String invalidCardNumber = "1234 5678 9876 5432"; // Invalide selon l'algorithme de Luhn
        assertFalse(Main.validateCreditCardNumber(invalidCardNumber), "The credit card number should be invalid.");
    }

    @Test
    void testValidateCreditCardNumber_TooShort() {
        // Test avec un numéro de carte trop court
        String shortCardNumber = "12345"; // Trop court pour être valide
        assertFalse(Main.validateCreditCardNumber(shortCardNumber), "The credit card number should be invalid due to being too short.");
    }

    @Test
    void testValidateCreditCardNumber_TooLong() {
        // Test avec un numéro de carte trop long
        String longCardNumber = "1234 5678 9876 54321"; // Trop long pour être valide
        assertFalse(Main.validateCreditCardNumber(longCardNumber), "The credit card number should be invalid due to being too long.");
    }

    @Test
    void testValidateCreditCardNumber_WithSpaces() {
        // Test avec un numéro de carte valide mais avec des espaces
        String cardWithSpaces = "4539 1488 0343 6467"; // Valide avec des espaces
        assertTrue(Main.validateCreditCardNumber(cardWithSpaces), "The credit card number should be valid with spaces.");
    }

    @Test
    void testValidateCreditCardNumber_NonNumericCharacters() {
        // Test avec des caractères non numériques
        String cardWithNonNumeric = "4539-1488-0343-6467"; // Valide avec des tirets
        assertTrue(Main.validateCreditCardNumber(cardWithNonNumeric), "The credit card number should be valid with non-numeric characters.");
    }
}
