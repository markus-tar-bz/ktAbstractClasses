

fun main() {
    val myCircle1 = Circle(5.0)
    //val shape = Shape("whatever") cannot create an instance/object of an abstract class

    myCircle1.changeName("Peter")
    println("The new  name of the circle is ${myCircle1.name}")

    val myRect = Rectangle(3.0,8.0)
    println("Rectangle area is ${myRect.area()}")
    println("Rectangle perimeter is ${myRect.perimeter()}")
    println("Is Rectangle square? ${myRect.isSquare()}")
}

//purpose of abstract class is that other classes inherit from them