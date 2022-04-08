//Enum Class : Why we use enum class
//We generally use enum to store same type of constant values

//Syntax to define enum class
enum class CreditCardType{
//    Below given are enum constants
//    the objects given below are by default arrange in sequence , these indices can be access by using predefine property known as ordinal , and similar to ordinal there ios one more default property known as name

    SILVER, //ordinal = 0 name ="SILVER"
    GOLD, //ordinal = 1  name = "GOLD"
    PLATINUM, // o= 2 n = "PLATINUM"
    BRONZE //o =3 n = "BRONZE"
}


//Enum class constructor
enum class CreditCardType1(val color : String , val maxLimit : Int = 1000000){

    SILVER("Silver",50000),
    GOLD("Gold"),
    PLATINUM("Black"),
    BRONZE("Brown")

}


//Creating constructor for the enum class
interface CardCashBack{
    fun getCashBack() : Double
}

//Implementing interface in the enum class
enum class CreditCardType2(val color : String , val maxLimit : Int = 1000000) : CardCashBack{

    SILVER("Silver",50000){
        override fun getCashBack(): Double = 25.0989
    },
    GOLD("Gold"){
        override fun getCashBack(): Double = 35.291113

    },
    PLATINUM("Black"){
        override fun getCashBack(): Double = 16.000234

    },
    BRONZE("Brown"){
        override fun getCashBack(): Double =40.9878
    }

}


//Enum constants as anonymous class by using abstract methods



fun main(args : Array<String>) {

//    Enum Constants are the objects of enum class type.
//    CreditCardType.GOLD
//    CreditCardType.PLATINUM

//    val value: CreditCardType = CreditCardType.PLATINUM

//    Each enum objects has two properties : ordinal and name
    println(CreditCardType.BRONZE.ordinal)
    println(CreditCardType.BRONZE.name)
//    if we not declare the name property explicitly then we can  just simply write the name of the object as given below , as internally it converts the name toSting
    println(CreditCardType.SILVER)

//    Similar to properties the enum class has two method as well : values() and valueOf()

//    values() method return all the enum objects in the enum class , in the form of array of objects.

    val myCustomers: Array<CreditCardType> = CreditCardType.values()
    myCustomers.forEach { println(it) }

//    Most common usage of the enum is in when statement

    val peterCardType: CreditCardType = CreditCardType.PLATINUM


    when(peterCardType){
        CreditCardType.SILVER -> println("Peter has silver card")
        CreditCardType.GOLD -> println("Peter has gold card")
        CreditCardType.PLATINUM -> println("Peter has platinum card")
        CreditCardType.BRONZE -> println("Peter has bronze card")
        else -> println("Enter the valid card type")
    }


//    Calling for the enum class objects with constructor
    println(CreditCardType1.SILVER.color)
    println(CreditCardType1.SILVER.maxLimit)
    println(CreditCardType1.BRONZE.color)
    println(CreditCardType1.BRONZE.maxLimit)

//    Calling the enum class who has implemented the interface
    println(CreditCardType2.SILVER.color)
    println(CreditCardType2.SILVER.maxLimit)
    println(CreditCardType2.SILVER.getCashBack())
    println(CreditCardType2.BRONZE.color)
    println(CreditCardType2.BRONZE.maxLimit)
    println(CreditCardType2.BRONZE.getCashBack())


}


//When to use enum :
//When u have finite number of constant values you can group them together in something called enum class
//Enum objects are constant values . Once you create them it cannot be changed
//Enum constant is separate instance of the enum class. They have properties of name and ordinal and methods of values() and valueOf()
//You can assign your own properties to each enum objects by using constructor
//Enum class can implement interfaces, but they cannot inherit from the abstract classes or open classes
//you can use enum constants as anonymous classes - self learning