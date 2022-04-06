import java.math.BigInteger

fun main(args: Array<String>) {
println(fiboNum(7, BigInteger("0"),BigInteger("1")))
}

tailrec fun fiboNum(n:Int , a: BigInteger ,b:BigInteger) : BigInteger{
    if (n==0){
        return b
    }else{
        return fiboNum(n-1,a+b,a)
    }
}