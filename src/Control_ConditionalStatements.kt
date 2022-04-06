import java.util.Scanner

fun main(args:Array<String>){
////    If Expression
//    val a = 10
//    val b = 11
//    val c =9
//    val d =111
//    var max : Int
//    if (a>b)
//        max = a
//    else
//        max =b
//
//    println(max)
//
//    var max2 : Int = if (c>d)
//                        c
//                     else
//                        d
//
//    println(max2)

//    When Expression is used as Switch case statement in kotlin
    var sc = Scanner(System.`in`)
    println("Enter the integer value till 4")
    val x =sc.nextInt()
    var str : String = when(x){
       0 , 1 -> "the value of x =1 or 0"
        2 -> "the value of x =2"
        3 -> "the value of x =3"
        4 -> "the value of x =4"
        in 5..10 -> "x  lies in 5 to 10"
        !in 11..15 -> "x is not between 11 to 15"
        else -> "Enter valid number"
    }
    println(str)

}