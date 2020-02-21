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

    println("The winner is... ")
    if(datas.isNullOrEmpty()) {
        println("No")
    } else {
        val random = Random().nextInt((datas.size))
        println("${datas[random]}")
    }
}
