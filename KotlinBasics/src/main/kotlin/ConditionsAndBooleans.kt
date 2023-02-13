fun main() {
    val numberOfFish = 5
    val numberOfPlants = 12
    println("I have $numberOfFish fish" + " and $numberOfPlants plants")

    val fish = 50
    if (fish in 1..51) {
        println(fish)
    }

    when (numberOfFish) {
        0  -> println("Empty tank ")
        in 1..39 -> println("Got fish")
        else -> println("That's a lot of fish!")
    }
}