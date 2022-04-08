//"Any" class contains functions such as:
//-> equals():Boolean
//->hashCode():Int
//toString():String
//Kotlin creates a copy() too
//Data Classes provide these mentioned methods
//The data class deals with the data not the objects of the class
//When you want to compare or deal with the data then use the data classes

fun main(args : Array<String>) {
    var user1 = MyClass("Pratham",13)
    var user2 = MyClass("Pratham",13)

    if (user1 == user2){
        println("Equal")
    }else{
        println("Not Equal")
    }

    println(user1.equals(user2))

    println(user1.toString())

    var newUser = user1.copy(name = "Shreya")
    println(newUser)




}

data class MyClass(var name : String , var id : Int){

}