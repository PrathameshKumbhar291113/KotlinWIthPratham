fun main(args : Array<String>) {
    val str1 : String = "Hello"
    val str2 : String = "Brother"
    var str3 : String = "I am Pratham"
    println(str3.add3Strings(str1,str2))

    val x = 5
    val y = 10
    println("the greater value is" +  x.greaterNum(y))
}

fun String.add3Strings(s1 : String , s2: String): String{
    return this+s1+s2
}

fun Int.greaterNum(a : Int) : Int{
    if(this>a){
        return this
    }else{
        return a
    }
}