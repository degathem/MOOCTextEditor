# MOOCTextEditor
Text editor project for Data Structures and Algorithms Course UCSD

Starter Code and GUI Application for Course 2 in the
Java Programming: Object Oriented Design of 
Data Structures Specialization:

[Data structures: Measuring and Optimizing Performance]
(https://www.coursera.org/learn/data-structures-optimizing-performance)

Authored by UCSD MOOC Team:
Mia Minnes, Christine Alvarado, Leo Porter, Alec Brickman
and Adam Setters

Date: 10/29/2015


## DESCRIPTION

The files provided are skeleton code, as well as grading previews and 
testing files to be used in completing the course programming 
assignments. Additionally, you are provided a runnable JavaFX program 
which will help to test and demonstrate your implementations.

## FILES AND OUTCOMES BY WEEK

Below are the files and outcomes introduced in each week and used in each week
of the course. See file for description...

## Week 1 : Introduction and Working with Strings
document.Document.java
document.BasicDocument.java

Describe how the Flesch Readability Score can be used to determine the readability of text
- Quantify how readable a piece of text is
- High score when short sentences and short sentences, with less syllables per word
Describe how Strings are represented in Java
- strings are objects, actually they are an array of characters (char primitive type)
- strings are immutable, no way to change a string in memory
- java has a mechanism to deal with strings in memory to save memory, i.e. if strings are immutable they could take up lot of heap space ... interned string object, similar strings will reference the same object in memory
Perform basic operations with Strings in Java
	
Work with the String class's built-in methods to manipulate Strings
- String.equals() will return true if content of string is equal i.e. all of the characters are the same. It won't (false) if you use == because this compare objects, even if the strings have the same characters two different objects are holding those 
Write regular expressions to match String patterns
Use regular expressions to split strings


## Week 2 : Efficiency Analysis and Benchmarking
document.EfficientDocument.java

Explain why the performance of an algorithm is important
- Relates back to user experience, if a program takes too long to run users not happy.
- Algorithm strategy for solving a prob
- can't use stopwatch/timer, computer's hardware will slow down program, different libraries for a given language
- measure the number of operations (we control this), focus on how performance scales  (how does operations grow as input grows), go beyond input size
Describe some factors that impact the performance of an algorithm
- number of iterations, number of operations
Explain why asymptotic analysis is useful
- If doing asymtotic analysis no need to worry about initialization time, implementations of specific operations
- n typically represents the size of the input
- constant time, input size doesn't affect number of operations
- linear time, grows linearly in terms of the size of its input
- f(n) = O(g(n)) = Big O Classes f(n) and g(n) grow in the same way as their input grows
Calculate the big-O class of a code snippet
- Big O notation captures the rate o growth of two functions
Combine the runtimes of smaller code snippets to analyze the performance of more complicated code
Compute the big-O class of code with nested loops
- (O)n^2
Analyze the performance of selection sort
- has a nested loop so (O)n^2
Define worst case, average case, and best case performance and describe why each of these is used
- Need to account for variability
- best case: best possible performance of algorithm for any input (of fixed size n)
- Worst case: worst possible performance of algorthm for any input ( of fixed size n)
State and justify the asymptotic performance for linear search,binary search, selection sort, and insertion sort in the best case and in the worst case
- linear search, best O(1), worst O(n)
- binary search (must be sorted), best O(1), worst O(log n)
- selection sort, basically find smallest element in positions i to length-1, swap it with element in position i. best and worst case (O)n^2
- insertion sort, basically swap successive pairs to put value in position i in correct location relative to earlier values, best (O)n (when array is already sorted), worst (O)n^2
Describe the merge sort algorithm
- uses recursion
- if list has one element, return. Divide list in half. Sort first half. Sort Second half. Merge sorted lists.
- 
Explain the use of recursion in merge sort
Use asymptotic analysis to compare merge sort with selection sort and with insertion sort
State the best, worst, and average case performance for insertion sort, selection sort, merge sort, and quick sort
Evaluate situations in which different sorting algorithms are appropriate
Organize big O classes according to rate of growth
Avoid some common pitfalls in asymptotic analysis
Explain the role of benchmarking in computer science
Identify components of real systems which impact execution time
Use Java timing libraries to measure execution time
Use runtimes from a real system to reason about performance


## Week 3 : Interfaces, Linked Lists vs. Arrays, and Correctness
textgen.MyLinkedList*.java
textgen.MarkovTextGenerator.java
textgen.MarkovTextGenerator*.java

## Week 4 : Trees! (including Binary Search Trees and Tries)
spelling.SpellingSuggest.java
spelling.AutoComplete.java
spelling.Dictionary.java
spelling.Dictionary*.java
spelling.AutoCompleteDictionaryTrie.java
spelling.TrieNode.java

## Week 5 : Hash Maps and Edit Distance

spelling.WordPath.java
spelling.NearbyWords.java
spelling.WPTree.java

# SETUP

Importing Project into eclipse:
    1. Create a new Java Project in your workspace
    2. Import the starter files:
      File -> Import -> Select "File System" -> Next -> Browse and set 
      root directory to folder contents of zip were extracted to -> Finish

Feel free to use another IDE or manually compile and run your programs.
If you need help, google is your friend.

# ACKNOWLEDGEMENTS

A big thank you to Tomas Mikula for creating RichTextFX 
which was used as the text area in the GUI application.
(Link: https://github.com/TomasMikula/RichTextFX)


