package app

import data.SuperTeacher
import data.Teacher

fun main() {
    val teacher = SuperTeacher("Dendi")
    println(teacher.name)
    teacher.test()
}