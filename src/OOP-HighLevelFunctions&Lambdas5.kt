//With and Apply concept of the kotlin standard library.
fun main(args :Array<String>){
    //Generally in kotlin we create the instance of the object, and then we call the methods/variables of the following class
    var mlf = MyLambdaFunctions5()
//    Normal method to access the properties of the class
//    mlf.age = 19
//    mlf.name = "Prathamesh"
//    mlf.startWalk()

//    Accessing the methods and variables of the class by with and apply block
//    with(mlf){
//        name = "Prathamesh Kumbhar"
//        age = 13
//        startWalk()
//    }

    mlf.apply {
        name = "Pratham"
        age = 190
    }.startWalk()
}

class MyLambdaFunctions5{
    var name : String = ""
    var age : Int = -1

    fun startWalk(){
        println("Person started walking at the age of $age anbd the name of the person was $name")
    }
}

