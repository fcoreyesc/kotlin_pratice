package cl.merce.kotlinprograms.basics

fun main() {

    var a: Boolean = true

    if (a) {
        println("It's $a")
    } else {
        println("else $a")
    }

    a = !a

    if (a) {
        println("It's $a")
    } else {
        println("else  $a")
    }

    // ternary, similarity
    var str: String
    str = if (a) "False" else "True"

    println(str)

    // if expressions

    str = if (a) {
        "printing if"
    } else if (a == null) {
        "null"
    } else {
        "printing else"
    }

    println("printing str : $str")

    // when -> java switch
    // when with parameter
    val numberWhen = 2
    when (numberWhen) {
        1 -> println("first")
        2 -> println("second")
        else -> println("the others")
    }

    when (numberWhen) {
        1, 2 -> println("first a second place")
        else -> println("the others")
    }

    // when as expression

    val whenStr = when (numberWhen) {
        1 -> "first one"
        else -> "the others"
    }

    println("When as expression $whenStr")

    // when without params
    when {
        numberWhen == 1 ->
            println("first one")
        numberWhen == 2 ->
            println("second one")
        else ->
            println("The rest")
    }



}