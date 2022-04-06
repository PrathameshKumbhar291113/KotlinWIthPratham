fun main(args : Array<String>) {
    var broObj = Brother("Pratham", 19)
    var cBroObj = MyCousinBrother("Durvesh",19)
    broObj.broAge = 199
    println("${broObj.broAge}")

}
//Primary Constructor with Property , more convenient technique to follow
class Brother(var broName : String , var broAge : Int){
    init {
        println("My bro name is $broName")
        println("My bro age is $broAge")
    }
}

//Primary Constructors with just parameters
class MyCousinBrother(myCBroName : String , myCBroAge:Int){
    var nameOfCBro :String = ""
    var ageOfCBro : Int = 0
    init {
        this.nameOfCBro = myCBroName
          println("My cousin bro name is $myCBroName")
        this.ageOfCBro = myCBroAge
          println("My cousin bro age is $myCBroAge")
    }
}