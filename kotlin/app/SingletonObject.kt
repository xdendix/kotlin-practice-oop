package app

import data.Application
import data.Utilities

fun main() {
    println(Utilities.name)
    println(Utilities.toUpper("Dendi"))

    println(Application.Companion.toUpper("Hidayat")) // contoh companion object
    println(Application.toUpper("Prayogo"))
}