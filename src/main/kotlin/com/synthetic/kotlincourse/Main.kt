package com.synthetic.kotlincourse

fun main(){
    printSoundIntensity(10.0, null)
    printSoundIntensity(10.0, 0.7)

    printFullPrice (null)
    printFullPrice (50.0)

    // val sum = "5" + "5"
    // val diff = 10 - 5
    // val product = 10 * 5
    // val quotient = 10 / 5
    // val remainder = 10 % 5
    // val remainder1 = 10 % 6
    // val remainder2 = 10 % 4
    // val isEqual = 5 == 4
    // val isNotEqual = 5 != 4
    // val isGreater = (5 > 3)
    // val isLesser = (5 < 3)
    // val isGreaterOrEqual = (5 >= 5)
    // val isLesserOrEqual = (5 >= 5)
    // val andResult = false && false
    // val orResult = true || true
    // val notResult = !(5 > 3)
    // var number = 5
    // number += 3
    // number /= 2

    // val example = ((8 + 1) >= 9) || (6 - 2 != 4) && (2 + 3 == 6)
    // val example1 = (10 - 5 >= 5) || (2 * 3 != 6)
    // val example2 = (8 / 2 == 4) && (7 % 3 != 1)
    // val example3 = (9 - 3 >= 6) && (8 / 2 != 4)
    // val example4 = ((2 * 5) == 10) && !(7 - 3 < 5) || (8 / 2 == 4)

    //(var a = 4; a-- == 4) || (5 * 2 != 10)) && (3 + 1 == 4)
    //(var b = 3; b++ > 3) && (6 / 2 == 3) || (7 - 2 != 5)
    //(var c = 1; ++c < 3) || ((4 % 2 == 0) && (5 + 0 == 5))
    //((var d = 5; d-- == 5) && (8 / 4 == 2)) || (2 * 3 != 6)
    //(var e = 2; e++ < 3) && ((7 + 1 == 8) || (4 % 2 != 0))

    // println(number--)
    // println(number)

    // val name: String? = null

    // val result = name ?: "Unknown"

    // fun printPrice(price: Double, s: Double?){
    //  val coeff = (100.00 - (s ?: 0.00)) / 100.00
    //  println (price * coeff)

}

fun printSoundIntensity(initialSoundIntensity: Double, dampingFactor: Double?){
    val soundIntensity = initialSoundIntensity * (dampingFactor ?: 0.5)
    println (soundIntensity)
}

fun printFullPrice(shippingPrice: Double?){
    val finShippingPrice = shippingPrice ?: 50.0
    val insurancePrice = finShippingPrice * 0.05
    val fullPrice = finShippingPrice + insurancePrice
    println (fullPrice)
}

// fun printLanguage(language: String?){
//    val defaultLanguage: String = "eng"
//    println (language ?: defaultLanguage)
// }

// fun printBoxStuff(stuff: String?){
//     println(stuff ?: throw Exception("Box is empty"))
// }