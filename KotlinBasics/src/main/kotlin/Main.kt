fun main(args: Array<String>) {
    println("Hello World")
    var bubbles = 9
    while (bubbles > 5) {
        bubbles--
    }
    println("$bubbles bubbles in the water\n")

    do {
        bubbles--
    } while (bubbles > 50)
    println("$bubbles bubbles in the water\n")

    repeat(2) {
        println("A fish is swimming")
    }
}