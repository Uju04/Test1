import org.junit.Test;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class PrimeAndEvenNumberTest {

    @Test

    public void testNotPrime(){
        PrimeAndEvenChecker checker = new PrimeAndEvenChecker();
        assertFalse(checker.isPrime(4));
    }

    @Test

    public void testPrime(){
        PrimeAndEvenChecker checker = new PrimeAndEvenChecker();
        assertFalse(checker.isPrime(5));
    }

    @Test

    public void testNotEven(){
        PrimeAndEvenChecker checker = new PrimeAndEvenChecker();
        assertFalse(checker.isEven(3));
    }

    @Test

    public void testEven(){
        PrimeAndEvenChecker checker = new PrimeAndEvenChecker();
        assertFalse(checker.isEven(4));
    }


    @Test

    public void testZero(){
        PrimeAndEvenChecker checker = new PrimeAndEvenChecker();
        assertFalse(checker.isPrime(0));
        assertTrue(checker.isEven(0));
    }


    @Test

    public void testNegative(){
        PrimeAndEvenChecker checker = new PrimeAndEvenChecker();
        assertFalse(checker.isPrime(-3));
        assertFalse(checker.isEven(-3));
    }

}

