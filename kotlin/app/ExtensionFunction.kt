package app

import data.Student
import data.sayHello
import data.upperName

fun main() {
    val student = Student("Dendi", 28)
    student.sayHello("Prayogo")
    println(student.upperName)
}