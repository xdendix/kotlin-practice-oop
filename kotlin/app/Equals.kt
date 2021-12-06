package app

import data.Company

fun main() {
    val company1 = Company("dendi")
    val company2 = Company("dendi")

    println(company1 == company2)
    println(company1 == company1)
    println(company2 == company2)
}