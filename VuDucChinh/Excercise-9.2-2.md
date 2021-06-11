#Excercise 9.2-2

###Answer questions (a) through (d) for the mutant on line 5 in the method 

```java
public static int findVal(int numbers[], int val)       
   {                                                       
      int findVal = -1;                                    
                                                        
      for (int i=0; i<numbers.length; i++)         // mutant        
      // for (int i=(0+1); i<numbers.length; i++)  
         if (numbers [i] == val)                         
            findVal = i;                                  
         return (findVal);                                    
   }
```

###a) If possible, find test inputs that do not reach the mutant.
It is impossible
###b) If possible, find test inputs that satisfy reachability but not infection for the mutant.
It is impossible
###c) If possible, find test inputs that satisfy infection, but not propagation for the mutant.
- Possible,The test input :
  - ([3, 0, 1, 2], 1)
    
###d) If possible, find test inputs that strongly kill the mutants.
- Possible,The test input :
  - ([3, 0, 1, 2], 3)