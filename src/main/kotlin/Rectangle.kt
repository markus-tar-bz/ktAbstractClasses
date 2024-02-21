

class Rectangle( //constructor put in parentheses, used to construct an object of a class. You have to define the data type
    private val a: Double,
    private val b: Double

) :Shape("Rectangle") {
    init {
        println("$name created with a = $a and b = $b")
        println("$name area is ${area()}")
        println("$name perimeter is ${perimeter()}")

    }

    override fun area() = a * b
    override fun perimeter() = 2*(a + b)
    fun isSquare() = a == b
}