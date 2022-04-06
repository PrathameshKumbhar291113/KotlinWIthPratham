// Inheritance in kotlin -
//Property of the class in case of kotlin
//by default all the classes are public in nature as well as final in nature in kotlin
// soo that by default we cannot inherit from a particular class to derived class / subclass
//for that kotlin provides open keyword , to inherit all the property of the class we use open keyword

fun main(args : Array<String>) {

    var dogObj = Dog()
    dogObj.color = "Greyish White"
    dogObj.breed = "Husky"
    dogObj.eat()
    dogObj.walk()
    dogObj.color()
    dogObj.breed()


    var catObj = Cat()
    catObj.color = "White"
    catObj.age = 13
    catObj.run()
    catObj.age()
    catObj.color()
    catObj.eat()



}
open class Animal{
    var color : String = ""
    fun color(){
        println("Color of the animal is $color")
    }
    fun eat(){
        println("Animal is eating")
    }

}
class Dog : Animal(){
    var breed : String = ""
    fun breed(){
        println("Breed of the dog is $breed")
    }
    fun walk(){
        println("Dog is walking")
    }
}
class Cat : Animal(){
    var age : Int = 0
    fun age(){
        println("Age of the cat is $age")
    }
    fun run(){
        println("Cat is running")
    }
}