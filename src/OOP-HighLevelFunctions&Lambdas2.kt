fun main(args : Array<String>) {

    var myLambdaFuncObj = MyLambdaProgram()

    val myLambdaFunction :(Int ,Int) ->Int = {x,y->x+y}


//Calling types of the lambda function
//    myLambdaFuncObj.addTwoNum(3,6,myLambdaFunction)
//    myLambdaFuncObj.addTwoNum(3,6,{x,y->x+y})
//    myLambdaFuncObj.addTwoNum(33,56){x,y->x+y}

}

class MyLambdaProgram{
    fun addTwoNum(a : Int , b : Int ,myLambdaFunc : (Int , Int ) -> Int){
        var result = myLambdaFunc(a,b)
        println(result)
    }
}