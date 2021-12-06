package app

import data.Employee
import data.Manager
import data.VicePresident

fun main() {
    var employee = Employee("Dendi")
    employee.sayHello("Prayogo")

    employee = Manager("Dendi")
    employee.sayHello("Prayogo")

    employee = VicePresident("Dendi")
    employee.sayHello("Prayogo")
}