import org.example.MyMath;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyMathTest {

    @Test
   public void testExceptions(){
        //arrange
        MyMath math = new MyMath();
        //variable assignment is act
        //assert
        assertThrows(ArithmeticException.class, ()->math.divide(10,0));

    }

    @Test
   public void testDivide(){

        MyMath math = new MyMath();
        assertDoesNotThrow(()->math.divide(219,21));

    }
}