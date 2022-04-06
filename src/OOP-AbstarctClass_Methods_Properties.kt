//The classes inside kotlin can be abstract in nature
//All the abstract methods are 'open' in nature , there is no need to define the method open explicitly
//When we declare any method abstract it does not contain any body of the method.
//An abstract method cannot be declared inside the non-abstract class , abstract methods can only exist inside the abstract class.
//We cannot create an instance of the abstract class / cannot instantiate the abstract class
//All the abstract methods should be overridden in the subclass otherwise it will throw an exception , the normal open method is optional to override.
//The abstract variables cannot be instantiated or the value of the variables cannot be declared.
//The role of the ABSTRACT CLASS is to just provide set of methods and properties
//Abstract class are partially defined class

abstract class Human2{
    abstract fun hello()
    abstract val v1 : String
    open fun yoBro(){
        println("Hello bro")
    }
}
class Australian : Human2() {
    override fun hello() {
        println("This is my australia")
    }

    override val v1: String = "Hello bro nice to meet you "

//    Yo bro function is optional to override
    override fun yoBro() {
        println("This is my new house")
    }

}