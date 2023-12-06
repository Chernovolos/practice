/**
 * ВАРІАН 9 Створіть функцію-розширення для списку, яка повертає середнє
 * значення всіх елементів списку.
 */
fun <T : Number?> List<T>.averageValue(): Double {
    if (isEmpty()) return 0.0
    val nonNullValues = filterNotNull()
    if (nonNullValues.isEmpty()) return 0.0
    val sum = nonNullValues.sumOf { it.toDouble() }
    return sum / nonNullValues.size
}

fun main() {
    val numbers = listOf(0, 0, 1.2, 4, 10, 0, null, 5, null, 3)
    val average = numbers.averageValue()
    println("Average value: $average")
}