package week1lecture

class Pet(private val name: String, private val age: Int) {
    fun makeSound() {
        println("*Growl*")
    }
}

fun main() {
    val mike = Pet("Mike", 28)
    mike.makeSound()
}