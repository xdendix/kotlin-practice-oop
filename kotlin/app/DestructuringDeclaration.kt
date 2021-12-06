package app

import data.Game
import data.Login
import data.MinMax

/**
 * contoh componentX
 */
fun minmax(value1: Int, value2: Int): MinMax {
    return when {
        value1 > value2 -> MinMax(value1, value2)
        else -> MinMax(value1, value2)
    }
}

/**
 * contoh destructuring lambda parameter
 */
fun login(login: Login, callback: (Login) -> Boolean): Boolean {
    return callback(login)
}

fun main() {
    val game = Game("Game Kotlin", 10000)
    val (name, price) = game

    println(game.name)
    println(game.price)

    val (min, max) = minmax(10, 100)
    println(min)
    println(max)

    val login = Login("dendi", "rahasia")
    login(login) { (username, password) ->
        username == "dendi" && password == "rahasia"
    }
}