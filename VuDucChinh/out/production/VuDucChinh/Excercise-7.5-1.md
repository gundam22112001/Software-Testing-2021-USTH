# Excercise 7.5-1
###Use the class BoundedQueue2 for questions a–f below. Acompilable version is available on the book website in the file BoundedQueue2.java. The queue is managed in the usual circular fashion.
###Suppose we build an FSM where states are defined by the representation variables of BoundedQueue2. That is, a state is a 4- tuple defined by the values for [elements, size, front, back]. For example, the initial state has the value [[null, null], 0, 0, 0], and the state that results from pushing an object obj onto the queue in its initial state is [[ozj, null], 1, 0, 1].

###a) We do not care which specific objects are in the queue. Consequently, there are really just four useful values for the variable elements. What are they?

They are :[null, null],[object, null],[null, object],[object, object]

###b) How many states are there?
There are 48 possible states :
- Elements have 4 possible values
- Size has 3 possible values
- Front has 2 possible values
- Back has 2 possible values
###c) How many of these states are reachable?
There are 4 states that are reachable.
###d) Show the reachable states in a drawing.
1. {[object, object], 2, object, object}
2. {[null, object], 1, null, object}
3. {[null, null], 0, null, null}
4. {[object, null], 1, object, null}