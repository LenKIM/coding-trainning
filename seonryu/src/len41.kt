import java.util.*

fun main(args: Array<String>) {

    val datas = mutableListOf<String>()

    Scanner (System.`in`.reader())

    while(true) {
        println("Enter a name: ")
        val input = readLine()
        if (!input.isNullOrEmpty()) {
            datas.add(input)
        } else {
            break
        }
    }

    datas.sortDescending()
    printData(datas)
}

private fun printData(datas: MutableList<String>) {
    println("Total of names: ${datas.size}")
    println("-------------------")
    for(something in datas)
        println(something)
}
