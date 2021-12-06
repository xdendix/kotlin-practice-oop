package app

import data.Base
import data.MyBase
import data.MyBaseDelegate

fun main() {
    val base = MyBase()
    base.sayHello("Dendi")

    val baseDelegate = MyBaseDelegate(base)
    baseDelegate.sayHello("Prayogo")
    baseDelegate.sayGoodBye("Joko")
}