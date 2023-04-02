import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

public class BinsTest {

    @Test
    public void getBinsTest(){
        int expected = 1;
        Bins results = new Bins(2, 12); // for bins from 2..12
        //Integer numberOfTens = results.getBin(10); // returns the number of tens in the 10 bin
        results.incrementBin(10); // should increment bin # 10
        int actual = Bins.getBin(10);
        Assert.assertEquals(expected, actual);
    }

}