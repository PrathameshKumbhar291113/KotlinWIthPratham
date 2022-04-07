//"it" : Implicit name of Single Parameter
//Soo technically it is used in place of the single variable as 'it' implicitly refers to the same kind of the datatype of the parameter
fun main(args : Array<String>) {

    val mlf = MyLambdaFunction4()
//    mlf.reverseString("Hello",{ s:String ->s.reversed()})
    mlf.reverseString("Hello",{ it.reversed()})


}
class MyLambdaFunction4{
    fun reverseString(str : String, myFunc: (String) ->String){
        var res = myFunc(str)
        print(res)
    }
}