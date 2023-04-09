// Values are immutable constants

val hello : String = "Hello"


// Variable are mutable

var HelloThere : String = hello

HelloThere = hello + " There!!! " // Press ctrl + alter + w to run line

println(HelloThere)

val immutableHelloThere = hello + " There"

print(immutableHelloThere)

// data type

val numberOne : Int = 1
val truth : Boolean = true
val letterA: Char = 'a'
val pi:Double = 3.144515545
val piSinglePrecision: Float = 3.14567455f
val bigNumber: Long = 1234566

println("Here is real mess :" + numberOne + truth + letterA + pi + bigNumber+ piSinglePrecision)
println(f" Pi is about  $piSinglePrecision%.3f")
println(f" Zero padding on left $numberOne%05d")

println(s"I can use s prefix to use variables like $numberOne , $bigNumber ")

val theUltimateAnswer: String = " To the life, universe, everything is constant 90"
val patternn =  """.* ([\d]+).*""".r
val patternn(answerString) = theUltimateAnswer

val answer = answerString.toInt


// Boolean

val isGreater = 1 >2
val isLesser = 1 < 2

val impossible  = isGreater & isLesser
val anotherWay = isGreater && isLesser
val anotherWay = isGreater || isLesser

val picard: String = "Picard"
val bestCaption : String = "Picard"
val isBest: Boolean = picard == bestCaption


// Exercise
// Write some code that takes value of pi , double and int, then print it within string
// three decimal places of precision to right

val pi = 3.14534555
val myDouble = 123.455
val myInt = 43

val output = f"Pi is equal to  $pi%.3f, my Double is $myDouble%.3f and my Int is $myInt%d"
println(output)
