package program

import annotations.Fancy

@Fancy(author = "Dendi")
class MyApplication(val name: String, val version: Int) {

    fun info() : String = "Application $name-$version"
}