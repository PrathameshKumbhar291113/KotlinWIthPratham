fun main(args : Array<String>){
    var firstName = "Jelly"
    var lastName = "Bean"
    println("Hi my name is ${lastName + firstName} ,  the length of my name is = ${lastName.length} ")

    var rectObj = Rectangle()
    rectObj.length = 5
    rectObj.breadth = 10
    println("the length of the rectangle is ${rectObj.length} and breadth of the rectangle is ${rectObj.breadth} the area of the rectangle is = ${rectObj.length * rectObj.breadth}")
}

class Rectangle{
    var length : Int = 0
    var breadth : Int = 0
}