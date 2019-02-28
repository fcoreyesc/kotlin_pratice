package cl.merce.kotlinprograms.basics

fun main(args: Array<String>) {

    //classic while
    var condition = true

    while (condition) {
        condition = !condition
        println("inside the while, just one time")
    }

    // do-while

    do {
        condition = !condition
        println("inside do-while loop")
    } while (condition)


    // for with range
    val rangeOfNumbers = 1..5

    for (i in rangeOfNumbers) {
        println(i)
    }

    // foreach
    rangeOfNumbers.forEach { i -> println(i) }

}


