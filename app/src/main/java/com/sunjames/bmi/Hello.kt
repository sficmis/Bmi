package com.sunjames.bmi

class Hello {
}

fun main() {
    val p = Person()
    p.hello()
    p.weight = 65.5f
    p.height = 1.78f
    println(p.bmi())
//    //BMI
//    val weight = 74.5f
//    val height = 1.78f
//    val bmi = weight / (height * height)
//    println("BMI is: " + bmi)

    println("Hello Kotlin!")
//    val age = 20
//    println(age.inc())
//    println(age)
}