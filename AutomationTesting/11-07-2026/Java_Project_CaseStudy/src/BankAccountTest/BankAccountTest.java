package BankAccountTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class BankAccountTest {

    /*
     * Arrange - create an account using the no-argument constructor
     * Act - deposit 10
     * Assert - balance should be 10
     */
    @Test
    public void testDepositUsingDefaultConstructor() {

        // Arrange
        BankAccount account = new BankAccount();

        // Act
        account.deposit(10);

        // Assert
        assertEquals(10, account.getBalance());
    }

    /*
     * Arrange - create checking account
     * Act - deposit 10
     * Act - withdraw 20
     * Assert - balance should be -10
     */
    @Test
    public void testCheckingAccountWithdraw() {

        // Arrange
        BankAccount account = new BankAccount(AccountType.CHECKING);

        // Act
        account.deposit(10);

        // Act
        account.withdraw(20);

        // Assert
        assertEquals(-10, account.getBalance());
    }

    /*
     * Exception Test
     */
    @Test
    public void testSavingsAccountException() {

        // Arrange
        BankAccount account = new BankAccount(AccountType.SAVINGS);

        // Assert
        assertThrows(IllegalArgumentException.class, () -> {

            // Act
            account.withdraw(10);

        });

    }

    /*
     * Parameterized Test
     */
    @ParameterizedTest
    @CsvSource({

            "0,10",
            "5,5",
            "10,0"

    })

    public void testSavingsWithdraw(double withdrawAmount,
                                    double expectedBalance) {

        // Arrange
        BankAccount account = new BankAccount(AccountType.SAVINGS);

        account.deposit(10);

        // Act
        account.withdraw(withdrawAmount);

        // Assert
        assertEquals(expectedBalance, account.getBalance());

    }

}