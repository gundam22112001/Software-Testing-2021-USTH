#Exercise 6.4-1
###The restriction on interleaving next() and remove() calls is quite complex. The JUnit tests in IteratorTest.java only devote onetest for this situation, which may not be enough. Refine the input domain model with one or more additional characteristics to probe this behavior, and implement these tests in JUnit.

After the refinement the IteratorTest class should be:

```
import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class IteratorTest {
	
   private List<String> list;      
   private Iterator<String> itr;   

   @Before public void setUp()  
   {
      list = new ArrayList<String>();
      list.add ("cat");
      list.add ("dog");
      itr = list.iterator();
   }
   // Test 1 of next(): testNext_BaseCase(): C1-T, C2-T, C5-T
    @Test public void testNext_BaseCase()
    {
        assertEquals ("cat", itr.next());
    }

    // Test 2 of next(): testNext_C1(): C1-F, C2-F, C5-T
    @Test(expected=NoSuchElementException.class)
    public void testNext_C1()
    {
        itr.next(); itr.next();        // consume the cat and the dog
        itr.next();                    // now empty
    }

    // Test 3 of next(): testNext_C2(): C1-T, C2-F, C5-T
    @Test public void testNext_C2()
    {
        list = new ArrayList<String>();
        list.add (null);
        itr = list.iterator();
        assertNull (itr.next());
    }

    // Test 4 of next(): testNext_C5(): C1-T, C2-F, C5-F
    @Test(expected=ConcurrentModificationException.class)
    public void testNext_C5()
    {
        list.add ("elephant");
        itr.next();
    }
    // Test 1 of remove(): testRemove_BaseCase(): C1-T, C2-T, C3-T, C4-T, C5-T
    @Test public void testRemove_BaseCase()
    {
        itr.next();
        itr.remove();
        assertFalse (list.contains ("cat"));
    }

    // Test 2 of remove(): testRemove_C1(): C1-F, C2-F, C3-T, C4-T, C5-T
    @Test public void testRemove_C1()
    {
        itr.next(); itr.next();        // consume the cat and the dog
        itr.remove();                  // remove dog from list.
        assertFalse (list.contains ("dog"));
    }

    // Test 3 of remove(): testRemove_C2(): C1-T, C2-F, C3-T, C4-T, C5-T
    @Test public void testRemove_C2()
    {
        list.add (null);
        list.add ("elephant");
        itr = list.iterator();
        itr.next(); itr.next();        // consume the cat and the dog
        itr.next();        // consume null; iterator not empty
        itr.remove();      // remove null from list
        assertFalse (list.contains (null));
    }

    // Test 4 of remove(): testRemove_C3(): C1-T, C2-T, C3-F, C4-T, C5-T
    @Test(expected=UnsupportedOperationException.class)
    public void testRemove_C3()
    {
        list = Collections.unmodifiableList (list);
        itr = list.iterator();
        itr.next();   // consume first element to make C4 true
        itr.remove();
    }

    // Test 5 of remove(): testRemove_C4(): C1-T, C2-T, C3-T, C4-F, C5-T
    @Test (expected=IllegalStateException.class)
    public void testRemove_C4()
    {
        itr.remove();
    }


    // Test 6 of next(): testRemove_C5(): C1-T, C2-T, C3-T, C4-T, C5-F
    @Test (expected=ConcurrentModificationException.class)
    public void testRemove_C5()
    {
        itr.next();
        list.add ("elephant");
        itr.remove();
    }
```