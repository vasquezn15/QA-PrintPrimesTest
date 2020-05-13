import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PrintPrimesTest {

    //Creates PrintPrimes object
    PrintPrimes test = new PrintPrimes();
    @Test
    public void printPrimesTest() {
        //Test to connect while statement to if statement without body of while loop
        int [] answer = new int[1];
        answer[0] = 2;
        assertArrayEquals(answer, test.printPrimes(0, true));   //Assertion statement for test path
    }

    //Method for first iteration of the edge coverage test path
    @Test
    public void printPrimesTestEC1() {
        int [] expected = new int[3];   //Created an array of integer arrays for the expected value
        expected[0] = 2; expected[1] = 3; expected[2] = 5;
        assertArrayEquals(expected, test.printPrimes(3, true)); //Assertion statement for test
    }

    //Second iteration for edge coverage path
    @Test
    public void printPrimesTestEC2() {
        int [] expected = new int[1];   //Creates array for expected value
        expected[0] = 5;    //Assigns value
        assertArrayEquals(expected, test.printPrimes(3, false));    //Assertion statement for testing method
    }
}