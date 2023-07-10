import hm.edu.software.architecture.design.patterns.abstracttest.ATM;
import hm.edu.software.architecture.design.patterns.abstracttest.SpardaBankATM;

public class SpardaBankATMTest extends AbstractATMTest {

    @Override
    ATM subjectUnderTest() {
        return new SpardaBankATM();
    }
}
