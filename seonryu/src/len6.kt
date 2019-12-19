import java.io.BufferedReader
import java.time.LocalDate
import java.time.format.DateTimeFormatter
import java.util.*

fun main(args: Array<String>) {
    val bf: BufferedReader = BufferedReader(System.`in`.reader())
    println("What is your current age? ")
    val currentAge = convertToInt(bf.readLine())

    println("At what age would you like to retire? ")
    BufferedReader(System.`in`.reader())
    val retirementAge = convertToInt(bf.readLine())

    val gapAge = retirementAge - currentAge
    println("You have $gapAge years left until you can retire.")

    val year: Int = convertToInt(LocalDate.now().format(DateTimeFormatter.ofPattern("yyyy")))
//    val gc = GregorianCalendar(TimeZone.getTimeZone("Asia/Seoul"))
//    var year2 = gc.get(GregorianCalendar.YEAR).toString()

    println("It's $year, so you can retire in ${year+gapAge}.")
}
