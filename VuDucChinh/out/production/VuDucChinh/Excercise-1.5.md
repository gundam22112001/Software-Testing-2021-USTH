#Excercise 1.5

a) 
- In the finLast() method the fault is in the for loop "i>0". To fix it
we write :
```
for (int i = x.length-1; i >= 0; i--)
```
- In the lastZero() method the fault is in the for loop.To fix it we write
:
```
  for (int i=x.length-1; i >= 0; i--)
```
because code is just code , there are no ways of telling what is true or what is fault.

- In the countPositive() method, zero is not a positive number so the
correct code is:
```
  if(x>0){
	count++;
		}
```
- In oddOrPos() method the fault is in the if condition
to fix it, we code:
```  
	if(Math.abs(x[i]%2)==1 || x[i] > 0)
```
b) 
- finLast() all inputs start the loop, so if we use null input, a NullPointerException will be thrown.

- lastZero() all inputs start the loop, so all inputs execute the fault even the null input its still return -1

- countPositive() if we let input be null or empty then we will get 0 positive numbers counted so this test case doesn't execute the fault.

- oddOrPos() if we let input be null or empty then we will get 0 positive numbers counted so this test case doesn't execute the fault.

c) 
- finLast(): Let y != x[0] then this will not result in an error state

- lastZero(): If x is empty, there is no error

- countPositive(): Any nonempty x that doesn't contain '0' in it.

- oddOrPos(): Any nonempty x with only non-negative elements works

d)
- finLast(): For this particular program, every input that results in 
error also results in failure. The reason is that error states are not
repairable by subsequent processing.

- lastZero(): All inputs with more than one '0' result in an error state.
So the input is every array with one '0'.

- countPositive(): For this particular program, every input that results in 
error also results in failure. The reason is that error states are not
repairable by subsequent processing.

- oddOrPos(): For this particular program, every input that results in 
error also results in failure. The reason is that error states are not
repairable by subsequent processing.

e) 

- finLast():
```
Input: x = [2, 3, 5]; y = 2;
Expected Output: 0
Actual Output: -1
First Error State:
x = [2, 3, 5]
y = 2;
i = 0 (or undefined or 1, depending on the compiler);
PC = just before return -1;
```

- lastZero(): The first error state is when index i has the value 0 when it
should have a value at the end of the array, namely x.length-1. 0 and 
x.length-1 are different unless x contains exactly one value. Hence, 
the first error state is encountered immediately after the 
initialization of i in the for-statement.

- countPositive():
```
Input: x = [-4, 2, 0, 2]
Expected Output: 2
Actual Output: 3
First Error State:
x = [-4, 2, 0, 2]
i = 2;
count = 1;
PC = right before the count++ statement.
```
- oddOrPos():
```
Input: x = [-3, -2, 0, 1, 4]
Expected Output: 3
Actual Output: 2
First Error State:
x = [-3, -2, 0, 1, 4]
i = 0;
count = 0;
PC = at end of if statement, instead of just before count++
```
f) 	**Pleas check the excercise.java file**