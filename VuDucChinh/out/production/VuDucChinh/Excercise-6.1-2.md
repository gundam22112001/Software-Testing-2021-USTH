#Excercise 6.1-2
###A tester defined three characteristics based on the input parameter car: Where Made, Energy Source, and Size. The following partitionings for these characteristics have at least two mistakes. Correct them.

####Problem:
- **Where Made**: The blocks for this  characteristic is not complete. The tester need to add the "other" case .
- **Energy Source**: Hybrid can contain both gas and electric,so it overlaps them. The tester should remove hybrid.
- **Size**: A hatch-back car can have 2 or 4 doors. So the tester can either r add “2-door + hatch-back,”
and “4-door + hatch-back,” or split this into two distinct characteristics: Number of doors and hatch-back
###Solution:
- **Where Made** should be: North America, Europe, Asia, Other
- **Energy Source** should be:  gas, electric
- **Number of Doors**: 2, 4
- Add **Hatch-back**: True,False