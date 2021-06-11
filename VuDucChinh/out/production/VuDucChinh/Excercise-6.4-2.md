#Excercise 6.4-2
###It is possible to modify an ArrayList without using the remove() method and yet have a subsequent call to remove() fail to throw ConcurrentModificationException. Develop a (failing) JUnit test that exhibits this behavior.
```
import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class failingTest {
    private List<String> list;
    private Iterator<String> itr;

    @Test (expected=ConcurrentModificationException.class)
    public void testRemove() {
        list = new ArrayList<String>();
        list.add ("abcd");
        list.add ("efg");
        itr = list.iterator();
        itr.next();
        list.add("something");
        itr.remove();
    }
}
```