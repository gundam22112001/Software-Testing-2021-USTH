#Excercise 7.2.2-7
###Answer questions a–d for the graph defined by the following sets:
- **N = {1, 2, 3}**
- **N0 = {1}**
- **Nf = {3}**
- **E = {(1, 2), (1, 3), (2, 1), (2, 3), (3, 1)}**
###Also consider the following (candidate) paths:
- **p1 = [1, 2, 3, 1]**
- **p2 = [1, 3, 1, 2, 3]**
- **p3 = [1, 2, 3, 1, 2, 1, 3]**
- **p4 = [2, 3, 1, 3]**
- **p5 = [1, 2, 3, 2, 3]**
###a)Which of the listed paths are test paths? For any path that is not a test path, explain why not.
p4 and p5 are not test path:
- p4 :Node 2 is not an initial note 
- p5 :there is no edge (3,2)
###b)List the eight test requirements for Edge-Pair Coverage (only the length two subpaths).
The eight TR are:
1. (1,3,1)
2. (1,2,3)
3. (1,2,1)
4. (2,3,1)
5. (2,1,3)
6. (2,1,2)
7. (3,1,3)
8. (3,1,2)
###c)Does the set of test paths from part (a) above satisfy Edge-Pair Coverage? If not, state what is missing.
No they aren't. The test set T doesn't have (3,1,3), (2,1,2)
###d)Consider the prime path [3, 1, 3] and path p2. Does p2 tour the prime path directly? With a sidetrip?
- p2 doesn't contain prime path [3,1,3],so p2 doesn't tour the prime path directly. 
- It detours as [3,1,2,3] 