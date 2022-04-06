import com.kotlinwithpratham.Person2

fun main (args:Array<String>){
    var name : String
    name = "Pratham"
    println(name)

    display()
    displayMyName("Shreya")

// creating the object of the class and calling the method of the class
    var myfirstclassobj = MyFirstClass();
    myfirstclassobj.displayMyName2("Pratham weds Shreya")

    var personobj = Person("Hello")
    personobj.name4 = "Yoo hello its Pratham Kumbhar"
    personobj.nameOfPerson(personobj.name4)
    personobj.name5 = "Yoo hello its Shreya Kumbhar"
    personobj.nameOfPerson2()

    personobj.name6 = "Izu Kumbhar"
    println("the name of the person is " + personobj.name6)


    //Concept of String Interpolation
    personobj.name7 = "Happy family"
    println("The name of the house is ${personobj.name7} and we live here")


    var person2obj = Person2("Hello im Pratham and im happy to meet you all")
    person2obj.displayNameOfThePerson()

}

//Displaying name with function
fun display(){
    var name1 : String
    name1 = "Yesss buddy"
    println(name1)
}

// parameterized Function
fun displayMyName(name2:String) : Unit{
    println(name2)
}

//Creating a class and declaring function in it
class MyFirstClass{
    fun displayMyName2(name3 : String){
        println(name3)
        val person = Person("Prathamesh")
    }
}

//Creating the class and declaring variable inside the class and then accessing the method through that object
class Person(val name: String){
    var name4 : String = ""
    var name5 : String = ""
    var name6 : String = ""
    var name7 : String = ""

    fun nameOfPerson(name1 : String){
        println(name1)
        println(name)
    }

    fun nameOfPerson2(){
        println(name5)
    }
}