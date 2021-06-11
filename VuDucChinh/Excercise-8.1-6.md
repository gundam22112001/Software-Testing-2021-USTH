#Excercise 8.1-6

###In Section 8.1.6, we introduced the example p = (a ∨ b) ∧ c, and provided expanded versions of the clauses using program variables. We then gave specific values to satisfy PC. We also gave truth values to satisfy CC. Find values for the program variables given to satisfy CC; that is, refine the abstract tests into concrete test values.

- TRCC = {a = true, a = false, b = true, b = false, c = true, c = false}
- Suppose that clauses a, b, and c were defined  in terms of Java program variables as follows:
    - a : x > y, a relational expression for program variables x and y
    - b : done, a primitive boolean value
    - c : list.contains(str), for List and String objects

- p will be : p = (x > y v done ) ∧ list.contains(str)
- Values for the program variables given to satisfy CC :
    - a = true : x = 10  y = 5
    - a = false : x = 5   y = 7
    - b = true : done = true
    - b = false : done = false
    - c = true : list = ["A","B","C"]  str = "A"
    - c = false : list = ["A","B"]  str = "C"