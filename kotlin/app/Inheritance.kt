package app

import data.Manager
import data.VicePresident

fun main() {
    val manager = Manager("Dendi")
    manager.sayHello("Hidayat")

    val vicePresident = VicePresident("Prayogo")
    vicePresident.sayHello("Prayoga")
}