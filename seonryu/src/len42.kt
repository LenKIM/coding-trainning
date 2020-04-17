import java.io.File

fun main(args: Array<String>) {

    val datas = mutableListOf<Person>()
    val path = "G:\\tmp\\testFile\\len42_text.csv"

    File(path).readLines().forEach {
        val tmps = it.split(",")
        datas.add(Person(tmps[0], tmps[1], Integer.parseInt(tmps[2])))
    }

    println("Last       Fist        Salary")
    println("-------------------------------")
    printData(datas)
}

private fun printData(datas: MutableList<Person>) {
    for(something in datas)
        println("${something.last}      ${something.first}      ${something.salary}")
}

data class Person (var last : String, var first : String, var salary: Int = 0)
