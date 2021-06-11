# Exercise 9.1.2.4
###Consider the following BNF:
```
A ::= 0 B | 0 M | 0 B M
0 ::= "w" | "x" | "s" | "m"
B ::= "i" | "f" | "c" | "r"
M ::= "o" | "t" | "p" | "a" | "h"
```

###a) How many nonterminal symbols are in the grammar?
- There are 4 of them : 
  - A 
  - 0 
  - B 
  - M 
    
###b) How many terminal symbols are in the grammar?
- There are 13 of them, those in the "".

###c) Write two strings that are valid according to the BNF.
- String 1: mft
- String 2: xfh

###d) For each of your two strings, give two valid mutants of the string.
- String 1: mfh
- String 2: xfp

###e) For each of your two strings, give two invalid mutants of the string.
- String 1: mfc
- String 2: xfr 
