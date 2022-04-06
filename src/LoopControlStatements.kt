fun main(args : Array<String>) {

//    Break Statement
    for (i in 1..10){
        if (i==5){
            break
        }
        println(i)
    }

    //Naming the loop and breaking out of it
    myOuterForLoop@ for (i in 1..3){
        for (j in 1..3){
//            println("$i , $j")
            if(i==2 && j==2){
                break@myOuterForLoop
            }
            println("$i , $j")
        }
    }

//    Continue Statement
    for(l in 1..5){
        if(l%2==0){
            continue
        }
        println(l)
    }


    outerForLoop@ for (i in 1..3){
        for (j in 1..3){

            if(i==2 && j==2){
                continue@outerForLoop
            }
            println("$i , $j")
        }
    }
}