package app

data class Friend(val name: String)

fun sayHello(friend: Friend?) {
    if (friend != null) {
        println("Hello ${friend.name}")
    }

    // contoh safe call menggunakan ?
    println("Hello ${friend?.name}")

    // contoh elvis operator
    val name = friend?.name ?: "Friend"
    println("Hello $name")

    // contoh menggunakan !! operator
    val names = friend!!.name
    println("Hello $names")
}

fun main() {
    sayHello(Friend("Dendi"))
    // sayHello(null) // Error !! operator
}