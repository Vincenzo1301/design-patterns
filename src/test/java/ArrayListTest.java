import java.util.ArrayList;
import java.util.List;

public class ArrayListTest extends AbstractListTest<String> {

    @Override
    List<String> subjectUnderTest() {
        return new ArrayList<>();
    }

    @Override
    String valueUnderTest() {
        return "String";
    }
}
