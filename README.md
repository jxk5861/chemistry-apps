# chemistry-apps
Some simple programs I wrote for my introductory chemistry class. One is to get practice spelling the name of an element given its atomic symbol. The other is a program to calculate the mass of compounds easily and without looking at the periodic table.

The first program, ElementNamingPractice prompts you with an element atomic number, symbol, and mass and you can type in the name of the element. 
If the name is correct, it adds one to the current streak in the top right.

![image](https://user-images.githubusercontent.com/58671117/162667865-4cc926be-7926-4c7b-b111-3319df91243b.png)

The second program, MassCalculator allows you to enter the formula for an element and it will tell you the atomic mass. 
For distinguishing between Co2 and CO2, use a capital O. The program automatically assumes a new element is being typed if there is only one element matching the current element. 
For example, after typing Co the next character will be capitalized to indicate that a new element is being typed since no elements match Co[a-z].

![image](https://user-images.githubusercontent.com/58671117/162668141-955c2571-10d8-4940-8816-d2466436bc3c.png)
