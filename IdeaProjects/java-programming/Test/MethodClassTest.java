import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import static org.junit.jupiter.api.Assertions.*;

public class MethodClassTest {


    MethodClass methodClass = new MethodClass();

    @Test
    public void test_divideTwoNumber(){
        int result = methodClass.divideNumber(45, 5);

        Assertions.assertEquals(result, 9);



    }
}