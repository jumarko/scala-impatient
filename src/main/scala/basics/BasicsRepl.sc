val answer = 8*5 + 2

var counter = 0
counter = 1

// all types are classes
1.toString
1.to(10)

// Scala uses java.lang.String but adds many useful functions via StringOps class
"Hello".intersect("World")
// similarly, there are classes like RichInt, RichDouble, RichCar, and so on


// Operators are methods
1 + 2
1.+(2)

// scalal doesn't have ++ and --
counter+=4
counter+=3

// You can use math ops with BigInt and BigDecimal
val x: BigInt = 123456789090L
x * x * x

// functions
import math._ // equivalent to import scala.mat._
sqrt(2)
pow(2,4)
min(3, Pi)

// companion object BigInt
BigInt.probablePrime(100, util.Random)


// methods without parameters often don't use parentheses
"Hello".distinct

// apply method - using the apply method of companion object is a common idom for constructing objects
"Hello"(2)


// Excercises
sqrt(sqrt(3))
// res variables are vals
"crazy" * 3
pow(10, 2)
BigInt(2).pow(1024)
import BigInt.probablePrime
import util.Random
probablePrime(100, Random)
// random file name
BigInt.probablePrime(100, Random).toString(36)

"Hello".take(3)
"Hello".takeRight(3)
"Hello".drop(3)
"Hello".dropRight(3)




