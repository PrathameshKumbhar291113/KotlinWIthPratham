fun main() {
//var dg1 = Dog1("Black" , "Husky")
    var dg2 = Dog2("Mellon" , "GermanShepard")
}

//Inheritance using primary constructor
open class Animal1(var color : String){

}
class Dog1(color : String ,var breed : String) : Animal1(color) {
    init {
        println("The color of the dog is $color & the breed of the dog is $breed")
    }
}

//Inheritance using secondary constructor

open class Animal2{
    var color1 :String = ""
    constructor(color: String){
        this.color1 = color
        println("The color of the dog is $color")
    }

}
class Dog2 : Animal2{
    var breed1 : String = ""
    constructor(color: String ,breed: String ) : super(color){
        this.breed1 = breed

        println("The color of the dog is $color & the breed of the dog is $breed")
    }

}