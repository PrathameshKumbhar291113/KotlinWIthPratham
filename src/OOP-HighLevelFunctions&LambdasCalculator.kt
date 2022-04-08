import java.util.Scanner

fun main() {

    var myCalci = Calculator()
    var sc = Scanner(System.`in`)

    println("Enter the first number")
    var num1 = sc.nextDouble()

    println("Enter the Second number")
    var num2 = sc.nextDouble()

    println("Enter the operator (+,-,*,/)")
    var operator = sc.next()


    var myLambdaSum : (Double , Double) ->Double = {x,y->x+y}
    var myLambdaSub : (Double , Double) ->Double = {x,y->x-y}
    var myLambdaMul : (Double , Double) ->Double = {x,y->x*y}
    var myLambdaDiv : (Double , Double) ->Double = {x,y->x/y}

    when(operator){
        "+" -> myCalci.add(num1 , num2 , myLambdaSum)
        "-" -> myCalci.sub(num1 , num2 , myLambdaSub)
        "*" -> myCalci.mul(num1 , num2 , myLambdaMul)
        "/" -> myCalci.div(num1 , num2 , myLambdaDiv)
    }

}

class Calculator{
    fun  add(a :Double , b : Double , sumFunc : (Double , Double) ->Double){
        var res = sumFunc(a,b)
        println(res)
    }

    fun sub(a :Double , b : Double , subFunc : (Double , Double) ->Double){
        var res = subFunc(a,b)
        println(res)
    }

    fun mul(a :Double , b : Double , mulFunc : (Double , Double) ->Double){
        var res = mulFunc(a,b)
        println(res)
    }

    fun div(a :Double , b : Double , divFunc : (Double , Double) ->Double){
        var res = divFunc(a,b)
        println(res)
    }
}