# Exercise 1
Write the program that:
 - takes the aruments from command line and prints their number to the screen
 - then prints all arguments nserting spaces to that 80 characters are used
e.g. :

> scala lab1 hello there people one 2 III
<pre>
6         hello            there           people           one        2          III
                                                                                     ^
                                                                                    80 characters
</pre>
  3 extend this program to take the "width" as a first argument, i.e.:
> scala lab1  30 hello there people one 2 III
<pre>
6  hello    there   people     one   2   III
                                            ^
                                           30 characters
</pre>

# Exercise 2
The solution that looks like C/Java program will win only 2 points. Scala specific features need to be used.
Goal: generate numbers that are not squares of some numbers up to a value N. For N == 11 result should be:
1 2 3 5 6 7 8 10 11 (4 and 9 should not be printed) 
- The N should be passed from command line, if nothing is passed then only 50 first natural numbers need to printed
- in IJ, to set cmd line args go to: 
Run -> Edit Configurations -> Program arguments, and enter some number there
