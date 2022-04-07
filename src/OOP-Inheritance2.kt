// Overriding in Kotlin -

fun main(args : Array<String>) {

//    var humanObj = Human()
//    humanObj.nameOfHuman = "Human"
//    humanObj.name()

    var ownerObj = Owner()
    ownerObj.nameOfOwner = "Prathamesh"
    ownerObj.name()
    println(ownerObj.color)
//    ownerObj.running()
//    var empObj = Employee()
//    empObj.nameOfEmployee = "Sharu"
//    empObj.name()
//    empObj.running()

}

open class Human{
    var nameOfHuman : String = "Just"
    open var color : String = "White"
    open fun name(){
        println("The name of the Human is $nameOfHuman")
    }
    open fun running(){
        println("Human is running")
    }
}

class Owner : Human(){
    var nameOfOwner : String = ""
    override var color: String = "Brown"

    override fun name() {
        super.name()
        println("The name of the owner is $nameOfHuman")
    }
    override fun running() {
        super.running()
        println("The owner $nameOfOwner is running")
    }
}

class Employee : Human()/*MyEmployee*/{
    var nameOfEmployee : String =""


    override fun name() {
        println("The name of the employee is $nameOfEmployee")
    }
    override fun running() {
        super<Human>.running()
        println("The employee $nameOfEmployee is running")
    }
}
//interface MyEmployee{
//    fun running();
//}




//Doubts in the concepts : the name set to the human through the humanObject is not showing while overriding (used super.name) in owner , why