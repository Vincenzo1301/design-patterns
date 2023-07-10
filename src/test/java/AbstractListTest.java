import org.junit.Test;

import static org.junit.Assert.*;

public abstract class AbstractListTest<T> {

    abstract T subjectUnderTest();

    @Test
    public void shouldAddValue() {
        T obj = subjectUnderTest();
        assertFalse(obj.equals(null));
    }
}
