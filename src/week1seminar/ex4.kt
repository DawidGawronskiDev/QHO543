fun main() {
    println("What percentage did you get?")
    val p = readln().toIntOrNull() ?: return println("Error - invalid percentage")

    when {
        p in 0..29 -> println("F")
        p in 30..49 -> println("D")
        p in 50..69 -> println("C")
        p in 70..89 -> println("B")
        p in 90..100 -> println("A")
        else -> println("Error - invalid percentage")
    }
}