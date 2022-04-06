fun main(args : Array<String>) {
    //For loop
    for(i in 0..10){
        if(i%2==0)
            println(i)
    }



    //While loop
    var i :Int=0
    while (i<=10){
        if(i%2==0)
            println(i)
        i++
    }

    //Do While loop
    do{
        if(i%2==0)
            println(i)
        i++
    }while (i<=10)
}