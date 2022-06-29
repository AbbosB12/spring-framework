import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.*;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorParamterizedTest {

    @ParameterizedTest
    @ValueSource(strings = {"Java","JS","TS"})
    void testCase1(String args){
        assertTrue(!args.isEmpty());
    }
    @ParameterizedTest
    @ValueSource(ints = {3,6,9})
    void testCase2(int number){
       assertEquals(0,number % 3);
    }
    @ParameterizedTest
    @ValueSource(strings = {"Java","JS","TS"})
//    @EmptySource
//    @NullSource
    @NullAndEmptySource
    void testCase3(String args){
        assertTrue(!args.isEmpty());
    }

    @ParameterizedTest
    @MethodSource("stringProvider")
    void testCase4(String arg){
       assertNotNull(arg);
    }
    static String[]stringProvider(){
        return new String[]{"Java","JS","TS","Postman"};
    }
    @ParameterizedTest
    @CsvSource({"10,20,30",
                "20,20,40",
                "30,20,50"})
    void testCase5(int num1, int num2, int result){
        assertEquals(result,Calculator.add(num1,num2));
    }
    @ParameterizedTest
    @CsvFileSource(resources = "/sample-data.csv", numLinesToSkip = 1)
    void testCase6(int num1, int num2, int result){
        assertEquals(result,Calculator.add(num1,num2));
    }
}
