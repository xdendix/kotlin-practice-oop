package app

import data.Student

// contoh let function
fun main() {
    val student = Student("Dendi", 15)
    val result: String = student.let {
        "Name ${it.name}, Age ${it.age}"
    }
    println(result)

    // contoh run function
    val result2: String = student.run {
        "Name ${this.name}, Age ${this.age}"
    }
    println(result2)

    // contoh apply function
    val result3: Student = student.apply {
        "Name ${this.name}, Age ${this.age}"
    }
    println(result3)

    // contoh also function
    val result4: Student = student.also {
        "Name ${it.name}, Age ${it.age}"
    }
    println(result4)

    // contoh with function
    val result5: String = with(student) {
        "Name ${this.name}, Age ${this.age}"
    }
    println(result5)
}