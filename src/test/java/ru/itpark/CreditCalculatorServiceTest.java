package ru.itpark;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CreditCalculatorServiceTest {

    @Test
    void amountCredit() {
        {
            CreditCalculatorService creditCalculatorServiceTest = new CreditCalculatorService();
            String test = creditCalculatorServiceTest.amountCredit(1_000, 18.5, 60);
            assertEquals(test, "1539.97");
        }
        {
            CreditCalculatorService creditCalculatorServiceTest = new CreditCalculatorService();
            String test = creditCalculatorServiceTest.amountCredit(10_000_000, 50, 100);
            assertEquals(test, "42381658.79");
        }
        {
            CreditCalculatorService creditCalculatorServiceTest = new CreditCalculatorService();
            String test = creditCalculatorServiceTest.amountCredit(2_354_987, 13.2, 24);
            assertEquals(test, "2692361.58");
        }

    }
}