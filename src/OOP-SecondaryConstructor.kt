fun main() {
    var sisObj = MySister("Sharu",19,"Navi Mumbai")
    println("my sister age is ${sisObj.sisterAge}")
    println("My sister address is ${sisObj.sisterAddress}")


}

class MySister(var nameOfSister : String){
    var sisterAge :Int  = 0
    var sisterAddress : String = ""
    init {
        println("Name of my sister is $nameOfSister ")
    }
//  Declaring Secondary Constructor
    constructor(nameOfSister: String , ageOfSister : Int , addressOfSister:String) : this(nameOfSister){
//        Secondary Constructor Body is always gets called after the init block
//    While declaring the secondary constructor give a call to primary constructor
        this.sisterAge = ageOfSister
        this.sisterAddress = addressOfSister
    }
}