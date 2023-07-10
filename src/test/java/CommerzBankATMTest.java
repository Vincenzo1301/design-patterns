import hm.edu.software.architecture.design.patterns.abstracttest.ATM;
import hm.edu.software.architecture.design.patterns.abstracttest.CommerzBankATM;

public class CommerzBankATMTest extends AbstractATMTest {

    @Override
    ATM subjectUnderTest() {
        return new CommerzBankATM();
    }
}
