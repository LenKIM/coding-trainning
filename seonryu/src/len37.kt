import java.util.*

fun main(args: Array<String>) {

    val passwordList = mutableListOf<Any>()
    val chars = mutableListOf('a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J','K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T','U', 'V', 'W', 'X', 'Y', 'Z')
    val specialChars = mutableListOf('~','`','!','@','#','$','%','^','&','*','(',')','-','+','|','_','=','[',']','{','}','<','>','?','/','.', ',')

    println("What's the minimum length? ")
    val min = inputInt()

    println("How many special characters?")
    val specialChar = inputInt()

    println("How many numbers?")
    val num = inputInt()

    // 패스워드 총 길이
    val passwordLength = (min..(min+(0..9).random())).random()

    for(index in 1..num)  passwordList.add((0..9).random())
    for(index in 1..specialChar) passwordList.add(specialChars.random())
    for(index in 1..(passwordLength - specialChar - num)) passwordList.add(chars.random())

    passwordList.shuffle()
    println("Your password is ")
    var password = StringBuilder()

    for(index in 0..(passwordList.size-1)) password.append(passwordList[index])
    println("$password")

}

private fun inputInt(): Int {
    val sc: Scanner = Scanner (System.`in`.reader())
    while(!sc.hasNextInt()) {
        sc.next()
        println("Sorry. That's not a valid input")
    }
    return sc.nextInt()
}
