package com.synthetic.kotlincourse.lesson5

fun main(){
    printSoundIntensity(10.0, null)
    printSoundIntensity(10.0, 0.7)

    printFullPrice (0.05,null)
    printFullPrice (0.05,100.0)

    printAtmosphericPressure ("90")
    printAtmosphericPressure (null)
}

fun printSoundIntensity(initialSoundIntensity: Double, dampingFactor: Double?){
    val soundIntensity = initialSoundIntensity * (dampingFactor ?: 0.5)
    println (soundIntensity)
}

fun printFullPrice(insuranceProcent: Double, shippingPrice: Double?){
    val finShippingPrice = shippingPrice ?: 50.0
    val insurancePrice = finShippingPrice * insuranceProcent
    val fullPrice = finShippingPrice + insurancePrice
    println (fullPrice)
}

fun printAtmosphericPressure (atmosphericPressure: String?){
    println(atmosphericPressure ?: throw Exception("Error"))
}