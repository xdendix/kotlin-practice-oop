package app

import data.SmartPhone

fun main() {
    val smartPhone = SmartPhone("Iphone 8", "Android")
    println(smartPhone.toString())
    println(smartPhone.hashCode())
}