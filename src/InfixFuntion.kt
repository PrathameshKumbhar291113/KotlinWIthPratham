fun main(args: Array<String>) {
    val x : Int = 1
    val y : Int = 10
    var greaterValue =  x greaterNumber y
    println("The greater number is " +greaterValue)
    var a : String = ""
    a helloBro "Pratham"
}

infix fun Int.greaterNumber(a : Int ) : Int{
    if (this>a){
        return this
    }else{
        return a
    }
}

infix fun String.helloBro(name : String){
    println("Hello " +name)
}