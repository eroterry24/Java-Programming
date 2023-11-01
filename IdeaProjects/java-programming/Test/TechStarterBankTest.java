import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import static org.junit.jupiter.api.Assertions.*;

    public class TechStarterBankTest {

    TechStarterBank techStarterBank = new TechStarterBank();

    @Test
    public void test_sendMoney() throws Exception {
        double amountResult = techStarterBank.sendMoney(1000);
        Assertions.assertEquals(amountResult, 10950.0);


    }

}