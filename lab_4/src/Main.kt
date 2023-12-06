/**
 * Напишіть клас "Продукт", який може мати назву (String) і ціну (Double?).
 * Реалізуйте функцію, яка виводить інформацію про товар, ігноруючи null
 * значення
 * */

class Product(val name: String, val price: Double?)

fun Product.productInformation() {
    println("Information about product:")
    println("Name: $name")

    price?.let {
        println("price: $it")
    }
}
fun main() {
    val goods1 = Product("Laptop", 2000.99)
    val goods2 = Product("Laptop 2", null)

    goods1.productInformation()
    goods2.productInformation()
}