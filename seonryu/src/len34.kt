import java.util.*

fun main(args: Array<String>) {
    val datas = mutableListOf("John", "Jackie", "Chris", "Ryu", "Amanda", "Kim", "Jeremy")
    printData(datas)

    println("Enter an employee name to remove: ")
    val removeData = inputString()

    // 삭제
    datas.removeAt(datas.indexOf(removeData))
    printData(datas)

}

private fun printData(datas: MutableList<String>) {
    println("There are ${datas.size} employees: ")
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