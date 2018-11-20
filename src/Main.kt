fun main(vararg args: String){
    println("HELLO!")
    println("Write \"HELP\" for info; Write \"EXIT\" for Exit")
    var userMessageForNextAction: String

    do {
        userMessageForNextAction = readLine().toString()

        when(userMessageForNextAction){
            "HELP" -> help()
            "NOORDER NOREPETITION" -> noOrderAndRepetition()
        }

    }while (userMessageForNextAction != "EXIT")
}

fun help(){
    println("0. \"EXIT\" -- Exit.")
    println("1. \"NOORDER NOREPETITION\" -- When order and repetition is not important.")
}

fun noOrderAndRepetition(){
    println("Enter m & n where \'C[n]^{m}\'")
    print("m = ")
    var m = readLine()!!.toInt()
    println()
    print("n = ")
    var n = readLine()!!.toInt()

    var result = Mathematics.factorial(m)
}