# [Java] -- Stack (Data Structure)
## Algorithm: "Valid Parentheses"

Filepath = algorithm-practice/Leet_Code/03-queue_and_stack/01-queuefirstinfirstoutdatastructure-CircularQueue/

### Problem Statement
Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is "valid".

An input string is valid if:

* Open brackets must be closed by the same type of brackets.
* Open brackets must be closed in the correct order.
* Note that an empty string is also considered valid.

### My Approach

1. My first step was to list out example valid cases and faulty cases
	* Valid cases:
		1. empty string
		2. ( )
		3. ( ) [ ] { }
		4. ( { } )
		5. ( [ [ ] ] { } )
	* Faulty cases:
		1. [ } ]
		2. ( [ ) ]
		3. ( ]
		4. ( [ [ ] ] { ) }
2. Then I thought about patterns,
	* If empty string ==> valid case
	* **String must always start with either '(', '[', or '{'**
	* **If string length is odd ==> faulty case**
	* As for the rest of the cases, we must check them with some kind of loop to check each character and make sure it is valid.
		* So we need some way to track the previous character (if the previous character is '[', then the next character should be ']').
		* Actually, this is not always the case because if the previous character is '[', it could be followed by '()' and then ']', or maybe '(((())))' and then ']'.
		* So instead of a previous character variable **we need a stack to keep track of all the open parentheses in order that need to be closed**
3. So far we have some possible etch cases and the idea of a stack to keep track of the open parenthesis that need to be closed. So we need some conditional statements that can check if the following character is valid.
	* ex. 1) if the top of the stack has '(', in order for the next value to be valid, it must be either a ')', '(', '[', '{'. We can have as many open parentheses as we want, as long as we close them in order.
		* if the next value is ')', we can pop the top value from the stack, because we have successfully closed it in order.
		* Then we consider the next value on the stack and the next value in the string.
4. **At the end of the loop, we just check if the stack is completely empty, and if it is we have a valid string, otherwise we return false.**

### Information Sources

1. [Valid Parentheses Problem on Leet Code](https://leetcode.com/explore/learn/card/queue-stack/230/usage-stack/1361/)
2. [How to use the built-in Stack class in Java](https://docs.oracle.com/javase/7/docs/api/java/util/Stack.html#empty())