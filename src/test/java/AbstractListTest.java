import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertTrue;

public abstract class AbstractListTest<T> {

    abstract List<T> subjectUnderTest();

    abstract T valueUnderTest();

    @Test
    public void shouldAddValue() {
        List<T> list1 = subjectUnderTest();
        list1.add(valueUnderTest());

        assertTrue(list1.contains(valueUnderTest()));
    }
}
