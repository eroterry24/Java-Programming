import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import static org.junit.jupiter.api.Assertions.*;

public class MethodClassTest {


    MethodClass methodClass = new MethodClass();

    @Test
    public void test_addTwoNumber(){
        int result = methodClass.addNumber(45, 5);

        Assertions.assertEquals(result, 50);



    }
}