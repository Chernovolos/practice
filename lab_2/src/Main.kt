/**
 *Реалізувати клас даних "Автомобіль" з полями: марка, модель, рік
 * випуску. Додати можливість порівнювати автомобілі за роком випуску
 */

data class Car (val brand: String, val model: String, val yearOfProduct: Int) {
   operator fun compareTo(other: Car): Int {
        return this.yearOfProduct.compareTo(other.yearOfProduct)
    }
}

fun main() {
    val car1 = Car("Steyr", "Puch", 1864)
    val car2 = Car("Tesla", "S", 2003)

    val compareCars = car2.compareTo(car1)

    if (compareCars < 0) {
        println("Model: ${car1.model} released later than model: ${car2.model}")
    } else if (compareCars > 0) {
        println("Model: ${car1.model} released earlier than model: ${car2.model}")
    } else {
        println("Model: ${car1.model} and model: ${car2.model} released in the same year")
    }
}