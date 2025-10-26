fun main() {
    val favouriteArtists = listOf("Vkie", "Pikers", "Wane")

    while (true) {
        println("What is my favourite artist?")
        val guess = readln()

        if (favouriteArtists.contains(guess)) {
            println("Congratulations! $guess is one of my favourites!")
            break
        } else {
            println("Try again!")
        }
    }
}