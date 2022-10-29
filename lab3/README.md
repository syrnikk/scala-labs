# Exercise 1
The goal is to write a few simple functions:
- gt
```scala
    println( gt(5)(4) ) // gt == greater than - here true
    println( gt(3)(4) ) // false
```
- op
```scala
    def mult(x: Int, y: Int) = x*y
    println( op(mult, (2, 3) ) )  // returns of application of function passed as the first argument 
				// to the second argument
```
- fcomposer
```scala
    // We have functions Int -> Double & Double -> Int say:
    def isqrt(arg: Int ) = sqrt(arg.toDouble)
    def percentAwayFromClosestInt(arg: Double) = (( x - x.floor ).max( x.ceil - x )).toInt * 100
    // and may others like this.
    
    // Write function fcomposer that takes two such function, f & g and composes them.
    // That, the result of composition is another function h that is identical to subsequent invocation of g & f
    // h(x) == f(g(x)) for any x.
    val h = fcomposer(percentAwayFromClosestInt, isqrt)
```
Show it in example functions given above and two other functions of your choice.

# Exercise 2 
The challenge is to write a minmax function that searches for a minimum and maximum values stored 
in the list of integers.
The search should be performed in one pass over the list. It has to be a tail recursive solution.


Example:
```scala
val x = List(-3,10, 90, 89, 12, 5, -5, 12, -16, 9908)
val mm = minmax( x )
// mm contains a tuple of two numbers of which the first one 
// is the minimum value stored in the list, the second is the maximum value
```