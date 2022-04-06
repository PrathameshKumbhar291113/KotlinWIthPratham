fun main(args : Array<String>) {
    add(1,2)
   println( add2(19,12))
}
fun add(a : Int , b : Int){

    println("Sum of  a = $a and b = $b is : ${a+b}")
}

fun add2(a : Int , b : Int) : Int{

    return a+b
}