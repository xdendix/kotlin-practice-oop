package app

import data.Person

fun main() {
    val dendi = Person()
    dendi.firstName = "Dendi"

    val prayogo = Person()
    prayogo.firstName = "Prayogo"

    val hidayat = Person()
    hidayat.firstName = "Hidayat"

    println(dendi.firstName)
    println(prayogo.firstName)
    println(hidayat.firstName)
}