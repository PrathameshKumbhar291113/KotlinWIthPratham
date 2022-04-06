//@file:JvmName("MyCustomKotlinFile")

import com.kotlinwithpratham.Person2

fun main(args : Array<String>) {
    var area = InteroperabilityMyJavaFile()
    var a = area.areaOfJavaFile(12,5)
    println(a)

    var name = Person2("Prathamesh")
    print(name)
}
fun addition(a : Int , b : Int) : Int{
    return a+b
}