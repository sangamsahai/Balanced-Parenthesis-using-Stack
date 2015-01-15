This application checks if a given input string is a set of balanced parenthesis (a combination of round , curly and square brackets) or not.
This application uses Stack data structure for its computation.

The idea is simple.
We iterate through the given string.
When an opening bracket is encountered, we push it on to the stack.
And when a closing bracket is encountered , we check the top of the stack. If we find the matching opening bracket , then 
we pop that opening bracket.
And thus when we are done iterating the string , we will be left with empty stack.

The push and pop operations on stack take constant time i.o. O(1).
And we have to iterate through the complete string.
So the overall complexity of this algorithm is O(n) where n is the length of the input.

To test different strings , just change the value of 'str' in the main and run this java file as a java application.

True or false will be printed on the console accordingly. 