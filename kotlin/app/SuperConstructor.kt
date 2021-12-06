package app

import data.ExecutiveCustomer
import data.PremiumCustomer

fun main() {
    val premiumCustomer = PremiumCustomer("Dendi")
    println(premiumCustomer.name)

    val executiveCustomer = ExecutiveCustomer("Dendi", 10000000)
    println(executiveCustomer.name)
    println(executiveCustomer.balance)
}