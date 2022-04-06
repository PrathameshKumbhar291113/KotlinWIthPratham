//Interfaces : It is kinda listener that you want some service ex on touch of the keyboard something should happen , on touch of this button some functionality should be executed
//Some short term or temporary service for that we create interface.
//All the methods and variables inside an interface is by default abstract in nature.
//As abstract class in interfaces we need to override the methods , variables declared in the interface.
//When define any method body inside an interface then the method is public open but not final in  nature. bcz in case of interface everything is open nothing is final.
//It is optional to override the normal methods inside interface to the class
//Interface cannot be instantiated / no instance/object can be created of the interface  as it cannot contain any constructor
//Suppose you are using the two interfaces and there are similar named methods present in both the interfaces , refer the example given below
//Now both the interfaces contain the normal methods of the same name and one abstract method and normal method of the same name
//Here we have to call both the normal methods of both interfaces and the abstract method of the other interface
//For the detail refer the example given below

fun main(args : Array<String>) {
   var abObj = AndroidButton()
    abObj.onClick()
    abObj.onClick()
}
interface MyInterfaceListener{
//    var name : String
    fun onTouch()
    fun onClick(){
        println("It is the on click method of the My Interface Listener")
    }

}
interface MySecondInterface{
fun onTouch(){
    println("This is the onTouch method of MySecondInterface")
}
    fun onClick(){
        println("This is the onClick method of the MySecondInterface")
    }

}
class AndroidButton : MyInterfaceListener , MySecondInterface {
//    override var name: String = "Prathamesh"
        override fun onTouch(){
            super.onTouch()
            println("Hello this is the onTouch method of the MyInterfaceListener")
        }

        override fun onClick(){
            super<MyInterfaceListener>.onClick()
            super<MySecondInterface>.onClick()
            println("this is me my interface listener")
        }
}
