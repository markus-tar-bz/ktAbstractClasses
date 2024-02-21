import kotlin.math.sqrt

class Triangle(
    private val a: Double,
    private val b: Double,
    private val c: Double
) : Shape("Triangle") {
    init {
        println("$name created with a = $a and b = $b")
        println("$name area is ${area()}")
        println("$name perimeter is ${perimeter()}")


    }
    override fun changeName(newName: String) { //we can only override non-abstract functions by declaring parent function open
        name = "Overriding non class functions "
    }

    override fun perimeter() = a + b + c
    //override keyword redefines/modifies the method of the super class in its subclass
    //the method should be open in nature(public/protected/abstract) and not final(private) in nature
    override fun area() = sqrt((perimeter() / 2) * ((perimeter() / 2) - a) * ((perimeter() / 2) - b) * ((perimeter() / 2) - c))
}