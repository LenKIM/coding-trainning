import java.util.*

private const val PASSWORD = "password12#$"

fun main(args: Array<String>) {

    print("What is the password? ")
    val inputPw = inputString()

    if (validate(inputPw)) {
        println("Welcome!")
    } else {
        println("That password is incorrect.")
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

private fun validate(str: String) : Boolean = PASSWORD.equals(str, false)