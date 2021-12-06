package app

import data.Person

fun main() {
    val dendi = Person()
    dendi.firstName = "Dendi"
    dendi.middleName = "Prayogo"
    dendi.lastName = "Hidayat"

    dendi.sayHello("Prayogo")
    dendi.run()

    val fullName = dendi.getFullName()
    println(fullName)
}