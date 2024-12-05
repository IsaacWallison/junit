import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import com.lessons.BankAccount;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class BankAccountBeforeAndAfterTest {
    static BankAccount bankAccount;

    @BeforeAll
    public void beforeTest() {
        bankAccount = new BankAccount(500, 0);
    }

    @Test
    public void testWithdraw() {
        bankAccount.withdraw(400);
        assertEquals(100, bankAccount.getBalance());
    }

    @Test
    public void testDeposit() {
        bankAccount.deposit(500);
        assertEquals(600, bankAccount.getBalance());
    }

    @AfterEach
    public void afterTest() {
        System.out.println("completed");
    }
}
