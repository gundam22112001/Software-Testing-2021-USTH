#Excercise 1.4

### a)Write a Java method with the signature public static Vector union (Vector a, Vector b) The method should return a Vector of objects that are in either of the two argument Vectors.

a) Answer:
```JAVA
public static Vector<Integer> union (Vector<Integer> a, Vector<Integer> b) {
        for (Integer obj : b) {
            if (a.contains(obj)) {
                a.add(obj);
            }
        }
        return a;
    }
```

### b) Upon reflection, you may discover a variety of defects and ambiguities in the given assignment. In other words, ample opportunities for faults exist. Describe as many possible faults as you can. (Note: Vector is a Java Collection class. If you are using another language, interpret Vector as a list.)

b)Answer:
- The fault is in the if condition :if (a.contains(obj)). It will only return
Vector a. Vector a and b must be a Integer Vector.

### c) Create a set of test cases that you think would have a reasonable chance of revealing the faults you identified above. Document a rationale for each test in your test set. If possible, characterize all of your rationales in some concise summary. Run your tests against your implementation.
c) Answer:

test case :
```java
int n = 6;
int m = 8;

Vector<Integer> a = new Vector<>(n);
        for (int i = 1; i <= n; i++) {
            a.add(i);

Vector<Integer> b = new Vector<>();
        for (int i = 1; i <= m; i++) {
            b.add(i);

=> a =[1,2,3,4,5,6]
=> b =[1,2,3,4,5,6,7,8]

Expect:[1,2,3,4,5,6,7,8]
Result:[1,2,3,4,5,6]
```

###d) Rewrite the method signature to be precise enough to clarify the defects and ambiguities identified earlier. You might wish to illustrate your specification with examples drawn from your test cases.
d)corrected method:
```
public static Vector<Integer> union (Vector<Integer> a, Vector<Integer> b) {
        for (Integer obj : b) {
            if (!a.contains(obj)) {
                a.add(obj);
            }
        }
        return a;
    }
```