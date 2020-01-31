import java.util.*

const val FAHRENHEIT = "f"
const val CELSIUS = "c"

fun main(args: Array<String>) {

    /**
     * 급해서.. 기능만 짜봤어요.. 리펙토링 합니다 하하하하하
     */

    println("Press C to convert from Fahrenheit to Celsius.")
    println("Press F to convert from Celsius to Fahrenheit.")
    println("Your choice: ")
    val choiceType = inputString()

    var choiceTypeText = ""
    if(FAHRENHEIT.equals(choiceType, true)) {
        choiceTypeText = "Celsius"
    } else if(CELSIUS.equals(choiceType, true)) {
        choiceTypeText = "Fahrenheit"
    }

    println("Please enter the temperature in $choiceTypeText: ")
    val inputValue = inputString().toLong()

    var result = 0.0
    if(FAHRENHEIT.equals(choiceType, true)) {
        result = ((inputValue - 32) * 5 / 9).toDouble()
    } else if(CELSIUS.equals(choiceType, true)) {
        result = ((inputValue * 9 / 5) +32 ).toDouble()
    }
    println("The temperature in $choiceTypeText is $result.")

}

private fun inputString(): String {
    val sc: Scanner = Scanner (System.`in`.reader())
    while(!sc.hasNext()) {
        sc.next()
        println("It's not a String, Please again.")
    }
    return sc.next()
}