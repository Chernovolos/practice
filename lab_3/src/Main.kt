/**
 * Створіть функцію, яка приймає список чисел і повертає список чисел, які
 * є паліндромами
 * */

fun findPalindromes(numbers: List<Int?>): List<Int?> {
    fun isPalindrome(str: String?): Boolean {
        if (str.isNullOrBlank()) {
            return false
        }
        val reversedStr = str.reversed()
        return str == reversedStr
    }

    return numbers.filter { isPalindrome(it?.toString()) }
}

fun main() {
    val numbers = listOf(222, 123, -121, null, 1331, 55, 101, 3)
    val palindromeNumbers = findPalindromes(numbers)

    println("Original numbers: $numbers")
    println("Palindrome numbers: $palindromeNumbers")
}