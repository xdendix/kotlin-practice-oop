package app

import data.Boss

fun main() {
    val boss1 = Boss("Dendi")
    val employee1 = boss1.Employee("Prayogo")
    val employee2 = boss1.Employee("Hidayat")

    val boss2 = Boss("Joko")
    val employee3 = boss2.Employee("Rudi")
    val employee4 = boss2.Employee("Budi")

    employee1.hi()
    employee2.hi()
    employee3.hi()
    employee4.hi()
}