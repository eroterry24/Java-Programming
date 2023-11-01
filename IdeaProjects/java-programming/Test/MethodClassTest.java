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
    @Test
    public void test_subtractTwoNumber(){
        int result = methodClass.subtractNumber(45, 5);

        Assertions.assertEquals(result, 40);



    }
    @Test
    public void test_divideTwoNumber(){
        int result = methodClass.divideNumber(10, 2);

        Assertions.assertEquals(result, 5);




    }

    @Test
    public void test_multiplyTwoNumber(){
        int result = methodClass.multiplyNumber(2, 2);

        Assertions.assertEquals(result, 4);




    }
}