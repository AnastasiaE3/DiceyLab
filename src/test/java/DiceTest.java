import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

public class DiceTest {
    @Test
    public void throwDiceTest(){
        Dice dice = new Dice(2);
        int expected = 9;
        int actual = dice.tossSum();
        Assert.assertEquals(expected, actual);
    }
}