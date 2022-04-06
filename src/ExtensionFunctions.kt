fun main(args : Array<String>){
    var studentObj = Student()

    println( studentObj.hasPassed(40))
    println(studentObj.isTopper(76))
}

fun Student.isTopper(score : Int):Boolean{
    return score>=95
}

class Student{
    fun hasPassed(marks :Int) : Boolean{
        return marks>=40
    }
}