import java.util.*

const val TAX = 0.055

fun main(args: Array<String>) {

    val items = mutableListOf<Item>()

    var index = 0
    while(index < 3) {
        val item = Item()
        println("Price of item ${index+1}: ")
        item.price = inputDouble()

        println("Quantity of item ${index+1}: ")
        item.quantity = inputDouble().toInt()

        items.add(item)
        index++
    }

    val subTotal = getSubTotal(items)
    val tax = subTotal * TAX
    val total = subTotal + tax
    println("Subtotal: $subTotal")
    println("Tax: $tax")
    println("total: $total")

}

fun getSubTotal(items: List<Item>): Double {
    var total = 0.0
    for(item in  items) {
        total += item.price * item.quantity
    }
    return total
}

private fun inputDouble(): Double {
    val sc: Scanner = Scanner (System.`in`.reader())
    while(!sc.hasNextDouble()) {
        sc.next()
        println("It's not a number, Please again.")
    }
    return sc.nextDouble()
}

class Item (var price : Double = 0.0, var quantity : Int = 0 )