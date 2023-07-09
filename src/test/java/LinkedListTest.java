import java.util.LinkedList;
import java.util.List;

public class LinkedListTest extends AbstractListTest<Integer> {

    @Override
    List<Integer> subjectUnderTest() {
        return new LinkedList<>();
    }

    @Override
    Integer valueUnderTest() {
        return 1;
    }
}
