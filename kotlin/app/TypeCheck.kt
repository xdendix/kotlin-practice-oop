package app

import data.HandPhone
import data.Laptop

// contoh casts if expression
fun printObjectWithIf(any: Any) {
    if (any is Laptop) {
        println("Laptop with name ${any.name}")
    } else if (any is HandPhone) {
        println("Handphone with name ${any.name}")
    } else {
        println(any)
    }
}

// contoh casts when expression
fun printObjectWithWhen(any: Any) {
    when (any) {
        is Laptop -> println("Laptop with name ${any.name}")
        is HandPhone -> println("Handphone with name ${any.name}")
        else -> println(any)
    }
}

// contoh unsafe casts
fun printString(any: Any) {
    val value = any as String
    println(value)
}

// contoh safe nullable casts
fun printStringSafeNullable(any: Any) {
    val value = any as? String
    println(value)
}

fun main() {
    printString("Prayogo")
    // printString(1) // ERROR

    printStringSafeNullable("Hidayat")
    printStringSafeNullable(1) // safe nullable casts

    printObjectWithIf("Dendi")
    printObjectWithIf(1)
    printObjectWithIf(Laptop("Asus"))
    printObjectWithIf(HandPhone("Iphone 8"))
}