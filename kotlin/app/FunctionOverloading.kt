package app

import data.Person

fun main() {
    val dendi = Person()
    dendi.firstName = "Dendi"

    dendi.sayHello("Prayogo")
    dendi.sayHello("Prayogo", "Hidayat")
}