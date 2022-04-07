//Closures in Kotlin
//In java 8 u cannot change(Mutate) the values of outside variables inside lambda
//But in kotlin you can change the values
//Soo closures technically means that we can store the  values of the lambda inside the outside variables

fun main(args: Array<String>) {
    var mlp = MyLambdaClosures()
    var result = 0
    val myLambda : (Int,Int) ->Unit = {x,y-> result = x+y}
    mlp.addTwoNumbers(76,1){x,y-> result = x+y}
    println("The additional value of the $result")
}
class MyLambdaClosures{
    fun addTwoNumbers(a: Int , b:Int,myFunc:(Int,Int) ->Unit){
        myFunc(a,b)
    }
}

