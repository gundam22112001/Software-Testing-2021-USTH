#Excercise 3.5
###The following JUnit test method for the sort() method has a non-syntactic flaw.Find the flaw and describe it in terms of the RIPR model. Be as precise, specific, and concise as you can. For full credit, you must use the terminology introduced in the book.In the test method, names is an instance of an object that stores strings and has methods add(), sort(), and getFirst(),which do exactly what you would expect from their names. You can assume that the object names has been properly instantiated, and the add() and sort() methods have already been tested and work correctly

Answer:

- The assertion only checks the first element in the list. So if a test 
causes a fault to infect, and then propagate to another part of the final
state, the failure will not be revealed. The test oracle needs to look at
the entire list.
