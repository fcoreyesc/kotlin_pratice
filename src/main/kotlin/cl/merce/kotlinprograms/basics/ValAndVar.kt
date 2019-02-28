package cl.merce.kotlinprograms.basics


fun main(args: Array<String>) {
    val name: String
    var varName = "nombre var"

    name = "nombre"
    // It is not possible, because it's read-only variable
    // name = "no puedo"

    // common variable with latest assignation
    varName = "puedo asignar"

    val int = 123 //integer
    val long = 123456L // long
    val double = 12.34 //double
    val float = 12.34F // float
    val hexadecimal = 0xAB //hex
    val binary = 0b01010101 //binary


    // kotlin does not support automatic widening of numbers
    // then the conversion must be invoked

    val intValue = 1234
    //casting with functions
    val long_value = intValue.toLong()

    // does not support java casting for primitives ( or wrapped primitives)
    //int_value = (int) long_value

    //char can be represented with unicode numbers
    //big difference with java, the chars are not treated as a number.
    val message = '\u1234'
    println(message)

    //Strings
    // Strings are immutable, the literals can be created using double quotes or triple quotes

    val str = "normal string"
    val strTripleQuote = """ first line
                             second line
                             third line
    """
    //String templates
    val template = "this is a simple template $str"
    println("printing string with template = $template")
    // using expressions in templates

    println("Using expression ${str.length}")

    // Arrays
    // simple array
    val array = arrayOf(1, 2, 3)

    // mixed values
    val arrayMixed = arrayOf(1, "2", '3')
    arrayMixed.forEach { v -> println(v.javaClass) }

    val arrayWithLambda = Array(20) { x -> x + x }
    println(arrayWithLambda.joinToString { m -> m.toString() })

    //Ranges
    // The ranges use .. operator

    val aToZ = "a".."z"
    val oneToTen = 1..9
    //kotlin.ranges.ComparableRange
    println(aToZ.javaClass)

    // after create a range we are able to use the keyword 'in' if a values is inside the range
    println(1 in oneToTen)
    // creating another range and adjusting the step
    val newRange = oneToTen.step(2)
    newRange.forEach { i -> println(i) }

    val anotherRange = 20.rangeTo(25)
    anotherRange.forEach { i -> println(i) }

    // negatives values are not allowed to use in ranges using keyword ..
    // for this case you must use the keyword downTo
    val negativeRange = -1 downTo -10
    negativeRange.forEach { i -> println(i) }

    // possible nullable values
    // by default the variables do not accept null values, to allow it, use the symbol <b>?</b>
    var possibleNull: String?
    possibleNull = null
    println("nullable value $possibleNull")


    /*Does not compile, because null it's not allowed by default
       var nonNullValue: String
       nonNullValue = null
   */






}
