fun main(args: Array<String>){
    var myString = "Yo wasup"
    println(myString)

    var mySecondString :String
    mySecondString = "Hello everyone"
    println(mySecondString)
    // mySecondString is mutable as at any point value/data inside that string will get change
    mySecondString = "Hello myself"
    println(mySecondString)

    val constantString = "Hello buddy sup"//It is an immutable string
    println(constantString)
}