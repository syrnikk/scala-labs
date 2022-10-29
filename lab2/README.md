# Exercise 1
A) Estimate value of PI using MC method. 
For that one needs to generate many pairs of random numbers* in the range [0,1].
For each pair one needs to check if distance from (0,0) is smaller or greater than 1. 
Then count the number of such pairs and number of all pairs. 
(There is convenient function called hypot to calculate the hypotenous). 
The value of PI is equal 4 x N_in_circle / N.
https://www.geeksforgeeks.org/estimating-value-pi-using-monte-carlo/

B) estimate in the same way value of any integral ( say y = 1 + x*x ) in the range of (0, 1)
This can be done as follows:
  * obtain M numbers in the box x in (0, 1), y in (0, 10) (as above) and count the pairs when y < f(x) (N)
  * the integral would be equal to 10* N / M  (10 is there because the area of of the box is 10)

Randoms can be generated by: import math._ and the in the code just call random() or just math.random()

The solution with the generator will be graded 6 points. 
Plain C like loop max 4 points.


# Exercise 2
Here the goal is to define a few functions:
```scala
object zad {

  def main(a: Array[String]) {
    <("Hello world") // just prints to 
    <(3)("Hello world") // prints the string preceding it by 3 spaces

    println(invokeAndAccumulate(3, (x: Int) => 2+x ,  4)) // no recursion needed, 3 is an initial value of arg passed to function, 4 number of repetitions
    println(invokeAndAccumulate(2, (x: Int) => x*x ))
    println(max(4)(5))
  }
}
```