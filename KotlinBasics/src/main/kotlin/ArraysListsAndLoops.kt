fun main() {
    //santacs
    val school = listOf("mackerel", 2, "halibut")
    println(school)

//To remove an item you can use remove() method

    val myList = mutableListOf("tuna", "salmon", "shark")
    myList.remove("shark")
    println(myList)

//To create an arrey you can use arrayOf() method like string and intArrayOf for numbers

    val school2 = arrayOf("shark", 2, "minnow")
    println(java.util.Arrays.toString(school2))

    val numbers = intArrayOf(1,2,3)
    val numbers3 = intArrayOf(4,5,6)
    val foo2 = numbers3 + numbers
    println(foo2[5])


    val oceans = listOf("Atlantic", "Pacific")
    val oddList = listOf(numbers, oceans, "salmon")
    for (element in oceans) {
        println("My company name: " + element)
    }

    val array = Array (5) { it * 10 }
    println(java.util.Arrays.toString(array))

    for ((index, element) in school.withIndex()) {
        println("Item at $index is $element\n")
    }

    for (i in 3..6 step 3) print(i)

}