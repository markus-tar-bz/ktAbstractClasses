abstract class Shape( //we don't want to create instances of this class hence abstract
    //only purpose of abstract class is so others can inherit from it
    var name: String
) {
    init {
        println("I am the super class!")
    }

    //each subclass needs the fun and has to implement that fun, int this case area and perimeter are implemented in all subclasses
    //When a subclass extends an abstract class, it must provide implementations for all the abstract methods defined in the abstract class.
    //since we don't know the implementation of these funs in subclasses they can only be declared abstract in our abstract class
    //funs need function bodies otherwise need abstract keyword.An abstract member function doesn’t have a body, and it must be implemented in the derived class.
    abstract fun area(): Double
    abstract fun perimeter(): Double


    open fun changeName(newName: String) { //fun has a body so cannot be declared abstract
        name = newName
    }
    /*All the variables (properties) and member functions of an abstract class are by default non-abstract.
        So, if we want to override these members in the child class then we need to use open keyword. */
}