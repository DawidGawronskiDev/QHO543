class Car(private val model: String, private val maxSpeed: Int) {
    fun getModel(): String {
        return model
    }

    fun getMaxSpeed(): Int {
        return maxSpeed
    }
}

fun main() {
    val c1 = Car("BMW", 210)
    val c2 = Car("Audi", 200)

    println(c1.getModel())
    println(c2.getMaxSpeed())
}