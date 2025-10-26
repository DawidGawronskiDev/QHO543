package week1lecture

fun main() {
    println("Enter season (spring/summer/autumn/winter):")
    val input = readln().lowercase()

    when (input) {
        "spring" -> println("It’s mild — wear a light jacket and trainers.")
        "summer" -> println("It’s warm — t-shirt, shorts, and sunscreen.")
        "autumn" -> println("It’s cool — a jumper, light coat, and waterproof shoes.")
        "winter" -> println("It’s cold — a heavy coat, scarf, gloves, and boots.")
    }
}