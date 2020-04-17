import java.io.File
import java.nio.file.Files
import java.nio.file.Paths
import java.nio.file.StandardOpenOption
import java.util.*

const val SLASH = "/"

fun main(args: Array<String>) {

    println("Site name: ")
    val siteName = inputString()

    println("Author: ")
    val author = inputString()

    println("Do you want a folder for JavaScript: ")
    val jsYN = inputString()

    println("Do you want a folder CSS : ")
    val cssYN = inputString()

    val path = "G:\\tmp\\$siteName"
    val indexText = "<html><head><title>$siteName</title><meta name=\"$author\"></head><body></body></html>"

    File(path).mkdir()
    println("Created ./$siteName")

    Files.write(Paths.get(path+SLASH+"index.html"), indexText.toByteArray(), StandardOpenOption.CREATE)
    println("Created ./$siteName/index.html")

    if("Y".equals(jsYN, true)) {
        File(path + SLASH +"js").mkdir()
        println("Created ./$siteName/js/")
    }

    if("Y".equals(cssYN, true)) {
        File(path + SLASH +"css").mkdir()
        println("Created ./$siteName/css/")
    }
}

private fun inputString(): String {
    val sc: Scanner = Scanner (System.`in`.reader())
    while(!sc.hasNext()) {
        sc.next()
        println("It's not a String, Please again.")
    }
    return sc.next()
}