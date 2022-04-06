//Visibility Modifiers - Kotlin supports 4 types of visibility modifiers
//-public , -protected , -internal , -private

fun main(args : Array<String>) {

}
//Public Modifier -  All the functions and classes are by default public in nature
public fun run2(){

}
public class Person5{

}
//Private modifier -  as the files are only accessible inside the same kotlin file where the function and classes are declared in the kotlin file
private fun  run(){

}
private class Person3{

}

//Internal Modifier as the function and the class will only be visible inside same module.
//Module - Module in kotlin is project and in this case module is KotlinWithPratham , or module can be a bunch of kotlin files.
internal fun run1(){

}
internal class Person4{

}


//Protected Modifier -  It is not available for high level functions or classes (High level function / classes - the class / function declared directly in kotlin file)
//The protected value is only visible inside the subclass not in some other class
//protected fun run3(){
//}
//protected class Person6{
//}

//Demonstration of the visibility modifiers

open class Human1{
    public val a =1
    private val b = 2
    internal val c =3
    protected val d =4
}

class Indian : Human1(){
    fun justToPrintAboveValues(){

        println(a)
//        println(b) //b value is not visible since the visibility modifier is private
        println(c)
        println(d)

    }
}

class American{
   fun justToPrintValues(){

       var human1Obj = Human1()
       println(human1Obj.a)
//       println(human1Obj.b) // The value is not accessible as the visibility modifier is private
       println(human1Obj.c)
//       println(human1Obj.d) // The protected value is only accessible inside the subclass of the parent class just shown above
   }

}