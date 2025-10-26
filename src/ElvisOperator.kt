fun main() {
    println("Enter first number: ")
    val firstInput = readln()
    val firstNumber = firstInput.toIntOrNull() ?: 0

    println("Enter second number: ")
    val secondInput = readln()
    val secondNumber = secondInput.toIntOrNull() ?: 0

    println(firstNumber + secondNumber)
}