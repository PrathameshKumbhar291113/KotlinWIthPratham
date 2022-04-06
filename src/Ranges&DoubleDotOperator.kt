fun main(args : Array<String>){
//Ranges
    val v1 = 1..5
    print(v1)
    val v2 = 50 downTo 1
    print(v2)
    val v3 = 5 downTo 1 step 2
    print(v3)
    val v4 = "a".."z"
    print(v4)
    val v5 = 'a'..'z'
    print(v5)

    var isPresent = 'c' in v5
    print(isPresent)

    var countAscend = 1.rangeTo(10)
    print(countAscend)

    var countDescend = 10.downTo(1)
    print(countDescend)
}