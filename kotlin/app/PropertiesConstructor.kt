package app

import data.User

fun main() {
    val user1 = User("Dendi", "Prayogo")
    val user2 = User("Hidayat", "Dendi")

    println(user1.username)
    println(user1.password)
    println(user2.username)
    println(user2.password)
}