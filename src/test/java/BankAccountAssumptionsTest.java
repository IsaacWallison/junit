import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assumptions.assumeFalse;
import static org.junit.jupiter.api.Assumptions.assumeTrue;
import static org.junit.jupiter.api.Assumptions.assumingThat;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.lessons.BankAccount;

public class BankAccountAssumptionsTest {
    @Test
    @DisplayName("Test activation account after creation")
    public void testActive() {
        BankAccount bankAccount = new BankAccount(500, 0);
        assumeTrue(bankAccount != null);
        assertTrue(bankAccount.isActive());
    }

    @Test
    @DisplayName("Test activation account after creation")
    public void testActive1() {
        BankAccount bankAccount = new BankAccount(500, 0);
        assumeFalse(bankAccount == null);
        assertTrue(bankAccount.isActive());
    }

    @Test
    @DisplayName("Test activation account after creation")
    public void testActive2() {
        BankAccount bankAccount = new BankAccount(500, 0);
        assumingThat(bankAccount != null, () -> assertTrue(bankAccount.isActive()));
    }
}
