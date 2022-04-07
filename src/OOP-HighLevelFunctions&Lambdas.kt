fun main(args : Array<String>) {

    var myProgramObj = MyProgram()
    //    Simple method to call the method
    myProgramObj.addTwoNum(4,6)
//Higher Order Functions Are those functions which accept another function as parameter
    //  Calling higher oder function which has interface as parameter
    myProgramObj.addTwoNum(5,15,object :MyInterface{
        override fun execute(sum: Int) {
            println("High level functions printing sum - $sum")
        }
    })
    //Lambda Expression is just a function without name.
    val myLambda: (Int) -> Unit ={ s /* The 's' on left side is the parameter */ : Int -> println(s) /* The statements after the arrow is the body of the lambda expression */} // Stuff written inside the curly braces is a function and the Lambda Expression[ is just a Function ]
    myProgramObj.addTwoNum(78,11,myLambda)

}
class MyProgram{
//    Simple way to declare the method and calling it in the main method
    fun addTwoNum(a : Int , b: Int ){
        val sum = a + b
        println("Simple method printing sum - $sum")
    }
//    Using Interface / Obj oriented way to print sum
    fun addTwoNum(a : Int , b: Int , action : MyInterface){
        val sum = a + b
        action.execute(sum)
    }
//    High level function with lambda as parameter
fun addTwoNum(a : Int , b: Int , myLambdaFunction : (Int) -> Unit){
    val sum = a + b
    println("High Level Lambda Functions to print sum - ")
    myLambdaFunction(sum)

}
}

interface MyInterface{
    fun execute(sum:Int)
}