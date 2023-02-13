fun main() {
     var fishFoodTreats = 6
    if (fishFoodTreats != null) {
        fishFoodTreats = fishFoodTreats.dec()
        println(fishFoodTreats)
    }

    fishFoodTreats = fishFoodTreats?.dec() ?: 0
    println(fishFoodTreats)


}

