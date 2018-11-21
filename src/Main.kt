fun main(vararg args: String){
    println("HELLO!")
    println("Write \"HELP\" for info; Write \"EXIT\" for Exit")
    var userMessageForNextAction: String

    do {
        println("Enter Command: ")
        userMessageForNextAction = readLine().toString()

        do {
            var again: String = "no"
            when (userMessageForNextAction) {
                "HELP" -> help()
                "NOORDER NOREPETITION" -> noOrderAndRepetition()
            }
            if (userMessageForNextAction != "EXIT") {
                println("Try again? ")
                var again: String = readLine()!!
            }
        }while(again == "yes" || again == "y" || again == "1")
    }while (userMessageForNextAction != "EXIT")
}

fun help(){
    println("0. \"EXIT\" -- Exit.")
    println("1. \"NOORDER NOREPETITION\" -- When order and repetition is not important.")
}

fun noOrderAndRepetition(){
    println("Enter m & n where \'C[n]^{m}\'")
    print("m = ")
    val m = readLine()!!.toInt()
    println()
    print("n = ")
    val n = readLine()!!.toInt()

    val result = Mathematics.factorial(m)/(Mathematics.factorial(n)*Mathematics.factorial((m-n)))

    println(result)
}