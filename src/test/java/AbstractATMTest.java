import hm.edu.software.architecture.design.patterns.abstracttest.ATM;
import org.junit.Assert;
import org.junit.Test;

public abstract class AbstractATMTest {

    abstract ATM subjectUnderTest();

    @Test
    public void shouldReturn0() {
        ATM atm = subjectUnderTest();
        Assert.assertEquals(0, atm.getMoney(1000));
    }

    @Test
    public void shouldReturnRequestedAmount() {
        ATM atm = subjectUnderTest();
        Assert.assertEquals(50, atm.getMoney(50));
    }
}
