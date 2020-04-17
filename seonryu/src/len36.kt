import java.util.*

fun main(args: Array<String>) {

    val datas = mutableListOf<Double>()
    while(true) {
        println("Enter a number: ")
        val input = inputString()
        if (input == "done") {
            break
        } else {
            val data = input.toDoubleOrNull()
            if(data != null) {
                datas.add(data)
            } else {
                break
            }
        }
    }
    printData(datas)

    println("The average is ")
    println("${datas.average()}")
    println("The minimum is ")
    println("${datas.min()}")
    println("The maximum is ")
    println("${datas.max()}")

    println("The standard deviation is ")
    println("${calculatorForStandardDeviation(datas)}")
}

private fun calculatorForStandardDeviation(datas: MutableList<Double>): Double {
    var sum : Double = 0.0
    var avrg = datas.average()
    for(data in datas) {
        sum +=((avrg - data) * (avrg - data))
    }

    return Math.sqrt(sum)
}

private fun printData(datas: MutableList<Double>) {
    println("Numbers: ")
    for(something in datas)
        println(something)
}

private fun inputString(): String {
    val sc: Scanner = Scanner (System.`in`.reader())
    while(!sc.hasNext()) {
        sc.next()
        println("It's not a String, Please again.")
    }
    return sc.next()
}